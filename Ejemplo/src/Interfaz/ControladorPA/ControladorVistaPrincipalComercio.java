package Interfaz.ControladorPA;

import Hibernate.GestorHibernate;
import ModelosPA.Comercio;
import ModelosPA.Pedido;
import ModelosPA.Producto;
import VistasPA.FrmPrincipalComercio;
import controladoresCU.ABMProducto;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControladorVistaPrincipalComercio {

    private GestorHibernate oper;
    private FrmPrincipalComercio form;
    private Comercio comercio;
    private ABMProducto ABMproducto;
    private Pedido model;
    private Producto producto;

    public Comercio getComercio() {
        return comercio;
    }

    public ABMProducto getABMproducto() {
        if (ABMproducto == null) {
            synchronized (ABMProducto.class) {
                ABMproducto = new ABMProducto();
            }
        }
        return ABMproducto;
    }

    public void setABMproducto(ABMProducto ABMproducto) {
        this.ABMproducto = ABMproducto;
    }
    
    



    
    public void setComercio(Comercio comercio) {
        this.comercio = comercio;
    }
    

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

    public Pedido getModel() {
        return model;
    }

    public void setModel(Pedido model) {
        this.model = model;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
    
    

    public FrmPrincipalComercio getForm() {
        return form;
    }

    public void setForm(FrmPrincipalComercio form) {
        this.form = form;
    }

    public void abrirse(Comercio comercio) {
        FrmPrincipalComercio frmComercio = new FrmPrincipalComercio();
        this.setForm(frmComercio);
        this.getForm().setVisible(true);
        this.getForm().setControlVista(this);
        setComercio(comercio);
        this.cargarPedido();
        this.getForm().getTxtID().setText(Long.toString(getComercio().getId()));
        this.getForm().getTxtNombre().setText(getComercio().getNombre());
        this.getForm().getTxtEmail().setText(getComercio().getCorreo());
        this.cargarProductos();
        

    }
    
    
    public void limpiarTablaPedido() {
        while (this.getForm().getjTablePedidos().getRowCount() != 0) {
            ((DefaultTableModel) this.getForm().getjTablePedidos().getModel()).removeRow(0);
        }
    }
     
    
   public void cargarPedido() {
        
        limpiarTablaPedido();
//        System.out.println(this.getComercio().getNombre());
        List<Pedido> pedido = this.getOper().buscarPedidoComercio(this.getComercio());

        if (pedido.size() > 0) {
            Iterator consulta = pedido.iterator();
            while (consulta.hasNext()) {
                DefaultTableModel tabla = (DefaultTableModel) this.getForm().getjTablePedidos().getModel();

                Vector datos = new Vector();
                Pedido fila = (Pedido) consulta.next();

                //datos.add(fila);
                datos.add(fila);
                datos.add(fila.getTotal());
                datos.add(fila.getId());
                //datos.add(fila.getUsuario().getId());
                datos.add(fila.getComercio().getId());
                datos.add(fila.getEstado());

                tabla.addRow(datos);

                //}
            }
        } else {
            JOptionPane.showMessageDialog(null, "no hay registros de productos");
        }
        
    
    
    }

    public void cargarProductosPedido() {

        limpiarTablaProductosPedidos();
        this.seleccionarPedido();
        this.cargarPedidos();

    }
    public void limpiarTablaProductosPedidos() {
        while (this.getForm().getjTableProductoPedidos().getRowCount() != 0) {
            ((DefaultTableModel) this.getForm().getjTableProductoPedidos().getModel()).removeRow(0);
        }
    }
    
    public void limpiarTablaProductos() {
        while (this.getForm().getjTableProductos().getRowCount() != 0) {
            ((DefaultTableModel) this.getForm().getjTableProductos().getModel()).removeRow(0);
        }
    }

    public void seleccionarPedido() {
        DefaultTableModel tabla = (DefaultTableModel) this.getForm().getjTablePedidos().getModel();
        int selectedRowIndex = this.getForm().getjTablePedidos().getSelectedRow();

        this.model = (Pedido) tabla.getValueAt(selectedRowIndex, 0);
        System.out.println(model);
    }

    private void cargarPedidos() {
        //this.limpiarTablaProducto();
        List<Producto> producto = this.getModel().getProducto();
        //List<Producto> producto = this.getOper().BuscarProducto();
        if (producto.size() > 0) {
            Iterator consulta = producto.iterator();
            while (consulta.hasNext()) {
                DefaultTableModel tabla = (DefaultTableModel) this.getForm().getjTableProductoPedidos().getModel();

                Vector datos = new Vector();
                Producto fila = (Producto) consulta.next();
                //if (fila.getComercio() == this.getComercio()
                //        && fila.getCategoria() == this.getCategoria()) {
                datos.add(fila);
                datos.add(fila.getDescripcion());
                datos.add(fila.getCategoria());
                datos.add(fila.getPrecio());
                datos.add(fila.getId());
                System.out.println(fila.getComercio().getNombre());

                tabla.addRow(datos);

                //}
            }
        } else {
            JOptionPane.showMessageDialog(null, "no hay registros de productos");
        }

    }

    private void cargarProductos() {
        List<Producto> producto = this.getOper().productosComercio(comercio);
        if (producto.size() > 0) {
            Iterator consulta = producto.iterator();
            while (consulta.hasNext()) {
                DefaultTableModel tabla = (DefaultTableModel) this.getForm().getjTableProductos().getModel();
                Vector datos = new Vector();
                Producto fila = (Producto) consulta.next();
                datos.add(fila);
                datos.add(fila.getDescripcion());
                datos.add(fila.getCategoria());
                datos.add(fila.getPrecio());
                datos.add(fila.getId());
                //datos.add(fila);
                tabla.addRow(datos);
            }
        } else {
            JOptionPane.showMessageDialog(null, "no hay registros de rubros");
        }
    }

    public void nuevoProducto() {
        
        this.getABMproducto().abrirse(comercio);
        this.getForm().setVisible(false);

    }

    public void modificar() {

        try {
            conseguirProducto();
            this.getABMproducto().abrirseParaModificar(comercio, this.getProducto());
            this.getForm().setVisible(false);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un producto");
        }


        
    }

    public void conseguirProducto() {
        DefaultTableModel model = (DefaultTableModel) this.getForm().getjTableProductos().getModel();
        int selectedRowIndex = this.getForm().getjTableProductos().getSelectedRow();

        this.setProducto((Producto) model.getValueAt(selectedRowIndex, 0));
    }

    public void eliminar() {
        try {
            conseguirProducto();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un producto");
        }

        this.getABMproducto().setProductoElegido(this.getProducto());
        this.getABMproducto().preguntarEliminar();
        this.limpiarTablaProductos();
        this.cargarProductos();



    }

    }


    
    


