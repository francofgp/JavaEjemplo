package Interfaz.ControladorPA;

import Hibernate.GestorHibernate;
import ModelosPA.Comercio;
import ModelosPA.Producto;
import ModelosPA.Rubro;
import ModelosPA.Usuario;
import VistasPA.FrmPrincipalUsuario;
import controladoresCU.registrarPedido;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class ControladorVistaPrincipalUsuario {

    private GestorHibernate oper;
    private FrmPrincipalUsuario form;
    private Usuario usuario;
    private registrarPedido pedido;

    public GestorHibernate getOper() {
        if (oper == null) {
            synchronized (GestorHibernate.class) {
                oper = new GestorHibernate();
            }
        }
        return oper;
    }

    public registrarPedido getPedido() {
        if (pedido == null) {
            synchronized (GestorHibernate.class) {
                pedido = new registrarPedido();
            }
        }
        return pedido;
    }

    public void setPedido(registrarPedido pedido) {
        this.pedido = pedido;
    }

    public void setOper(GestorHibernate oper) {
        this.oper = oper;
    }

    public FrmPrincipalUsuario getForm() {
        return form;
    }

    public void setForm(FrmPrincipalUsuario form) {
        this.form = form;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void llenaJComboBoxUsuario(JComboBox jComboBoxRubro) {
        getOper().llenaJComboBoxUsuario(jComboBoxRubro);
    }

    public void llenaJComboBoxCategoria(JComboBox jComboBoxCategoria) {
        getOper().llenaJComboBoxCategoria(jComboBoxCategoria);
    }

    public void conseguirIDRubroSeleccionado() {
        if (this.getForm().getEstado() >= 2) {
            String s = String.valueOf(this.getForm().getjComboBoxRubro().getSelectedItem());

            this.getForm().setIdDeRubroSeleccionado(this.getOper().buscarObjeto(s));

            //System.out.println(idDeRubroSeleccionado+ "estoy aca");
        } else {
            this.getForm().setEstado(this.getForm().getEstado() + 1);
            //estado= estado+1;
        }
    }

    public void conseguirIDCategoriaSeleccionado() {
        if (this.getForm().getEstadoCategoria() >= 2) {
            String s = String.valueOf(this.getForm().getjComboBoxCategoria().getSelectedItem());

            this.getForm().setIdCategoriaSeleccionado(this.getOper().buscarCategoria(s));

        } else {
            this.getForm().setEstadoCategoria(this.getForm().getEstadoCategoria() + 1);
        }
    }

    public void LoadComercio() {
        List<Comercio> comercio = this.getOper().BuscarComercioPorCategoriaYRubro();
        if (comercio.size() > 0) {
            Iterator consulta = comercio.iterator();
            while (consulta.hasNext()) {
                DefaultTableModel tabla = (DefaultTableModel) this.getForm().getjTableComercio().getModel();

                Vector datos = new Vector();
                Comercio fila = (Comercio) consulta.next();
                if (fila.getRubro().getId() == this.getForm().getIdDeRubroSeleccionado()
                        && fila.getCategoria().getId() == this.getForm().getIdCategoriaSeleccionado()) {
                    datos.add(fila.getNombre());
                    datos.add(fila.getId());
                    tabla.addRow(datos);

                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "no hay registros de rubros");
        }
    }

    public void LoadProductos() {

        this.ClearTableProductos();
        List<Producto> producto = this.getOper().BuscarProducto();
        if (producto.size() > 0) {
            Iterator consulta = producto.iterator();
            while (consulta.hasNext()) {
                DefaultTableModel tabla = (DefaultTableModel) this.getForm().getjTableProducto().getModel();

                Vector datos = new Vector();
                Producto fila = (Producto) consulta.next();
                if (fila.getComercio().getNombre() == this.getForm().getTxtComercio().getText()
                        && fila.getCategoria().getId() == this.getForm().getIdCategoriaSeleccionado()) {
                    datos.add(fila.getNombre());
                    datos.add(fila.getDescripcion());
                    datos.add(fila.getPrecio());
                    datos.add(fila.getId());
                    System.out.println(fila.getComercio().getNombre());
                    System.out.println(fila.getCategoria().getNombre());

                    tabla.addRow(datos);

                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "no hay registros de rubros");
        }
    }

    public void ClearTableComercio() {
        while (this.getForm().getjTableComercio().getRowCount() != 0) {
            ((DefaultTableModel) this.getForm().getjTableComercio().getModel()).removeRow(0);
        }
    }

    public void ClearTableProductos() {
        while (this.getForm().getjTableProducto().getRowCount() != 0) {
            ((DefaultTableModel) this.getForm().getjTableProducto().getModel()).removeRow(0);
        }
    }

    String comercioSeleccionadoID;
    public void seleccionarComercio() {
        DefaultTableModel model = (DefaultTableModel) this.getForm().getjTableComercio().getModel();
        int selectedRowIndex = this.getForm().getjTableComercio().getSelectedRow();
        this.getForm().getTxtComercio().setText(model.getValueAt(selectedRowIndex, 0).toString());
        this.getForm().getTxtIDL().setText(model.getValueAt(selectedRowIndex, 1).toString());
        comercioSeleccionadoID=model.getValueAt(selectedRowIndex, 1).toString();
        this.LoadProductos();
    }

    public void agregarAlCarro() {

        TableModel model1 = this.getForm().getjTableProducto().getModel();
        int[] indexs = this.getForm().getjTableProducto().getSelectedRows();
        Object[] row = new Object[4];
        DefaultTableModel model2 = (DefaultTableModel) this.getForm().getjTableCarro().getModel();

        for (int i = 0; i < indexs.length; i++) {
            row[0] = model1.getValueAt(indexs[i], 0);
            row[1] = model1.getValueAt(indexs[i], 1);
            row[2] = model1.getValueAt(indexs[i], 2);
            row[3] = model1.getValueAt(indexs[i], 3);
            model2.addRow(row);
        }

    }

    public Comercio buscarComercioSeleccionado(){
        long id= Long.parseLong(comercioSeleccionadoID);
        //System.out.println(id);
        //Comercio comercio= (Comercio) this.getOper().buscarComercio(id);
        //System.out.println(comercio.getApellido());
        return (Comercio) this.getOper().buscarComercio(id);
    }
    
    public void hacerPedido() {
        //this.buscarComercioSeleccionado();
        DefaultTableModel model = (DefaultTableModel) this.getForm().getjTableCarro().getModel();

        float precioTotal = (float) 0.0;
        List<Producto> productos = new ArrayList<Producto>();

        for (int row = 0; row < this.getForm().getjTableCarro().getRowCount(); row++) {
            productos.add((Producto) this.getOper().buscarProducto(Long.parseLong(model.getValueAt(row, 3).toString())));
            System.out.println(model.getValueAt(row, 3).toString());
            precioTotal = precioTotal + Float.parseFloat(model.getValueAt(row, 2).toString());
        }

        System.out.println(precioTotal);
        System.out.println(productos);
        // Probably add new line to 'data'

        this.getForm().getTxtMontoTotal().setText(String.valueOf(precioTotal));

        this.getPedido().guardarPedido(this.getUsuario(), this.buscarComercioSeleccionado(),
                                    productos, precioTotal, this.getForm().getTxtDescripcion().getText());
    }

}
