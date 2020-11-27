package Interfaz.ControladorPA;

import Hibernate.GestorHibernate;
import ModelosPA.Categoria;
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
import ModelosPA.Comercio;
import ModelosPA.Pedido;
import ModelosPA.Producto;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class ControladorVistaPrincipalUsuario {

    private GestorHibernate oper;
    private FrmPrincipalUsuario form;
    private Usuario usuario;
    private Comercio comercio;
    private Pedido model;
    private Rubro rubro;
    private Categoria categoria;
    float precioTotal = (float) 0.0;
    public GestorHibernate getOper() {
        if (oper == null) {
            synchronized (GestorHibernate.class) {
                oper = new GestorHibernate();
            }
        }
        return oper;
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

    public Comercio getComercio() {
        return comercio;
    }

    public void setComercio(Comercio comercio) {
        this.comercio = comercio;
    }

    public Pedido getModel() {
        return model;
    }

    public void setModel() {
        model= new Pedido();
        model.setUsuario(this.getUsuario());
        model.setComercio(this.getComercio());
        model.setTotal(precioTotal);
        model.setDescripcion(this.getForm().getTxtDescripcion().getText());
        
    }
    
    
    

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Rubro getRubro() {
        return rubro;
    }

    public void setRubro(Rubro rubro) {
        this.rubro = rubro;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    

    public void llenaJComboBoxRubro(JComboBox jComboBoxRubro) {
        //getOper().llenaJComboBoxRubro(jComboBoxRubro);
        
        List<Rubro> resulset = getOper().rubroShow();

        jComboBoxRubro.removeAllItems();

        for (Rubro rubro : resulset) {
            //jComboBox1.addItem("" + usuario.getNombre() + " - " + usuario.getApellido());
            if ("Activo".equals(rubro.getEstado())) {
                jComboBoxRubro.addItem(rubro);

            }

        }
    }

    public void llenaJComboBoxCategoria(JComboBox jComboBoxCategoria) {
        //this.getOper().llenaJComboBoxCategoria(jComboBoxCategoria);
        List<Categoria> resulset = this.getOper().categoriaShow();

        jComboBoxCategoria.removeAllItems();

        for (Categoria categoria : resulset) {
            //jComboBox1.addItem("" + usuario.getNombre() + " - " + usuario.getApellido());
            if ("Activo".equals(categoria.getEstado())) {
                jComboBoxCategoria.addItem(categoria);

            }

        }

    }

    public void conseguirRubroSeleccionado() {

        if (this.getForm().getEstado() >= 2) {
            String s = String.valueOf(this.getForm().getjComboBoxRubro().getSelectedItem());
            //this.getForm().setIdDeRubroSeleccionado(this.buscarObjeto(s));
            this.setRubro((Rubro) this.getForm().getjComboBoxRubro().getSelectedItem());
        } else {
            this.getForm().setEstado(this.getForm().getEstado() + 1);
        }
    }

    public void conseguirCategoriaSeleccionado() {
        if (this.getForm().getEstadoCategoria() >= 2) {
            String s = String.valueOf(this.getForm().getjComboBoxCategoria().getSelectedItem());
            //this.getForm().setIdCategoriaSeleccionado(this.buscarCategoria(s));
            this.setCategoria((Categoria) this.getForm().getjComboBoxCategoria().getSelectedItem());
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
                if (fila.getRubro().getId() == this.getRubro().getId()
                        && fila.getCategoria().getId() == this.getCategoria().getId()) {
                    datos.add(fila);
                    datos.add(fila.getId());
                    tabla.addRow(datos);

                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "no hay registros de rubros");
        }
    }

    public void LoadProductos() {

        this.limpiarTablaProducto();
        List<Producto> producto = this.getOper().BuscarProducto();
        if (producto.size() > 0) {
            Iterator consulta = producto.iterator();
            while (consulta.hasNext()) {
                DefaultTableModel tabla = (DefaultTableModel) this.getForm().getjTableProducto().getModel();

                Vector datos = new Vector();
                Producto fila = (Producto) consulta.next();
                if (fila.getComercio() == this.getComercio()
                        && fila.getCategoria() == this.getCategoria()) {
                    datos.add(fila);
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

    public void limpiarTablaComercio() {
        while (this.getForm().getjTableComercio().getRowCount() != 0) {
            ((DefaultTableModel) this.getForm().getjTableComercio().getModel()).removeRow(0);
        }
    }

    public void limpiarTablaProducto() {
        while (this.getForm().getjTableProducto().getRowCount() != 0) {
            ((DefaultTableModel) this.getForm().getjTableProducto().getModel()).removeRow(0);
        }
    }

    //String comercioSeleccionadoID;

    public void seleccionarComercio() {
        DefaultTableModel model = (DefaultTableModel) this.getForm().getjTableComercio().getModel();
        int selectedRowIndex = this.getForm().getjTableComercio().getSelectedRow();
        //this.getForm().getTxtComercio().setText(model.getValueAt(selectedRowIndex, 0).toString());
        //this.getForm().getTxtIDL().setText(model.getValueAt(selectedRowIndex, 1).toString());
        comercio = (Comercio) model.getValueAt(selectedRowIndex, 0);
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

    /*
    public Comercio buscarComercioSeleccionado() {
        long id = Long.parseLong(comercioSeleccionadoID);
        //System.out.println(id);
        //Comercio comercio= (Comercio) this.getOper().buscarComercio(id);
        //System.out.println(comercio.getApellido());
        return (Comercio) this.getOper().buscarComercio(id);
    }
*/
    public void hacerPedido() {
        //this.buscarComercioSeleccionado();
        precioTotal = (float) 0.0;
        DefaultTableModel model = (DefaultTableModel) this.getForm().getjTableCarro().getModel();
        List<Producto> productos = new ArrayList<Producto>();

        for (int row = 0; row < this.getForm().getjTableCarro().getRowCount(); row++) {
            productos.add((Producto) model.getValueAt(row, 0));
            //System.out.println(model.getValueAt(row, 3).toString());
            precioTotal = precioTotal + Float.parseFloat(model.getValueAt(row, 2).toString());
        }
        
        /*
        System.out.println(precioTotal);
        System.out.println(productos);
        // Probably add new line to 'data'
        */
        this.getForm().getTxtMontoTotal().setText(String.valueOf(precioTotal));
        this.setModel();
        this.getOper().guardarObjeto(getModel());
        
        
        
    }

}
