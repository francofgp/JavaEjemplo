package Interfaz.ControladorPA;

import Hibernate.GestorHibernate;
import ModelosPA.Comercio;
import ModelosPA.Pedido;
import ModelosPA.Producto;
import VistasPA.FrmPrincipalComercio;
import controladoresCU.ABMProducto;
import controladoresCU.InicioSesion;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControladorVistaPrincipalComercio extends ClaseTabla{

    private GestorHibernate oper;
    private FrmPrincipalComercio form;
    private Comercio comercio;
    private ABMProducto ABMproducto;
    private Pedido model;
    private Producto producto;
    private InicioSesion inicioSesion;
    
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
   
    public InicioSesion getInicioSesion() {
        if (inicioSesion == null) {
            synchronized (InicioSesion.class) {
                inicioSesion = new InicioSesion();
            }
        }
        return inicioSesion;
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
        this.calculoCalificacion();

    }

    public void limpiarTablaPedido() {
        this.limpiarTabla(this.getForm().getjTablePedidos());

    }

    public void cargarPedido() {

        limpiarTablaPedido();

        List<Pedido> pedido = getOper().buscarPedidoComercio(this.getComercio());

        if (pedido.size() > 0) {
            Iterator consulta = pedido.iterator();
            while (consulta.hasNext()) {
                DefaultTableModel tabla = (DefaultTableModel) this.getForm().getjTablePedidos().getModel();

                Vector datos = new Vector();
                Pedido fila = (Pedido) consulta.next();

                datos.add(fila);
                datos.add(fila.getTotal());
                if (fila.getCalificacion() != null) {
                    datos.add(fila.getCalificacion().getCalificacion());
                } else {
                    datos.add("Sin calificar");
                }

                datos.add(fila.getFecha());
                datos.add(fila.getEstado());

                tabla.addRow(datos);

            }
        } else {
            JOptionPane.showMessageDialog(null, "no hay registros de Pedidos");
        }

    }

    public void cargarProductosPedido() {

        limpiarTablaProductosPedidos();
        this.seleccionarPedido();
        this.cargarPedidos();

    }

    public void limpiarTablaProductosPedidos() {
        this.limpiarTabla(this.getForm().getjTableProductoPedidos());
    }

    public void limpiarTablaProductos() {
        this.limpiarTabla(this.getForm().getjTableProductos());
    }

    public void seleccionarPedido() {
        this.model = (Pedido) this.conseguirObjetoDeTabla(this.getForm().getjTablePedidos());
    }

    private void cargarPedidos() {

        List<Producto> producto2 = this.getModel().getProducto();

        if (producto2.size() > 0) {
            Iterator consulta = producto2.iterator();
            while (consulta.hasNext()) {
                DefaultTableModel tabla = (DefaultTableModel) this.getForm().getjTableProductoPedidos().getModel();

                Vector datos = new Vector();
                Producto fila = (Producto) consulta.next();

                datos.add(fila);
                datos.add(fila.getDescripcion());
                datos.add(fila.getCategoria());
                datos.add(fila.getPrecio());
                datos.add(fila.getId());
                
                tabla.addRow(datos);

            }
        } else {
            JOptionPane.showMessageDialog(null, "no hay registros de productos pedidos");
        }

    }

    public void cargarProductos() {
        List<Producto> producto3 = this.getOper().productosComercio(comercio);
        if (producto3.size() > 0) {
            Iterator consulta = producto3.iterator();
            while (consulta.hasNext()) {
                DefaultTableModel tabla = (DefaultTableModel) this.getForm().getjTableProductos().getModel();
                Vector datos = new Vector();
                Producto fila = (Producto) consulta.next();
                datos.add(fila);
                datos.add(fila.getDescripcion());
                datos.add(fila.getCategoria());
                datos.add(fila.getPrecio());
                datos.add(fila.getId());
                datos.add(fila.getEstado());

                tabla.addRow(datos);
            }
        } else {
            JOptionPane.showMessageDialog(null, "no hay registros de Productos");
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
        this.setProducto((Producto) this.conseguirObjetoDeTabla(this.getForm().getjTableProductos()));
    }

    public void eliminar() {
        try {
            conseguirProducto();
            this.getABMproducto().setProductoElegido(this.getProducto());
            this.getABMproducto().preguntarEliminar();
            this.limpiarTablaProductos();
            this.cargarProductos();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un producto");
        }

    }

    public float calculoCalificacion() {

        float total = 0;
        int a = 0;
        for (int i = 0; i < this.getForm().getjTablePedidos().getRowCount(); i++) {

            if (this.getForm().getjTablePedidos().getValueAt(i, 2) != "Sin calificar") {
                float total2 = (float) this.getForm().getjTablePedidos().getValueAt(i, 2);
                a++;
                total = total + total2;
            }
        }
        total = total / a;

        if (total > 0) {
            this.getForm().getTxtID1().setText(String.valueOf(total));
        } else {
            this.getForm().getTxtID1().setText("Sin calificar");
        }
        return total;
    }

    public void darDeBaja() {
        try {
            this.conseguirProducto();
            this.getABMproducto().setProductoElegido(producto);
            this.getABMproducto().darDeBaja();
            this.limpiarTablaProductos();
            this.cargarProductos();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un producto");
        }

    }

    public void darDeAlta() {
        try {

            this.conseguirProducto();
            this.getABMproducto().setProductoElegido(producto);
            this.getABMproducto().darDeAlta();
            this.limpiarTablaProductos();
            this.cargarProductos();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un producto");
        }
    }

    public void buscar() {
        
        if(validar()){
        this.limpiarTablaPedido();
        this.limpiarTablaProductosPedidos();
        this.obtenerFecha();
        this.cargarBusquedaFecha();
        }

    }

    private void cargarBusquedaFecha() {
        List<Pedido> pedido = getOper().buscarPedidoComercioYFecha(this.getComercio(),minDate,maxDate );

        if (pedido.size() > 0) {
            Iterator consulta = pedido.iterator();
            while (consulta.hasNext()) {
                DefaultTableModel tabla = (DefaultTableModel) this.getForm().getjTablePedidos().getModel();

                Vector datos = new Vector();
                Pedido fila = (Pedido) consulta.next();

                datos.add(fila);
                datos.add(fila.getTotal());
                if (fila.getCalificacion() != null) {
                    datos.add(fila.getCalificacion().getCalificacion());
                } else {
                    datos.add("Sin calificar");
                }

                datos.add(fila.getFecha());
                datos.add(fila.getEstado());

                tabla.addRow(datos);

            }
        } else {
            JOptionPane.showMessageDialog(null, "no hay registros de Pedidos");
        }
    }
    
    Date minDate;
    Date maxDate;
    private boolean obtenerFecha() {
        try {
  
            SimpleDateFormat dFormat = new SimpleDateFormat("dd/MM/yyyy");
            String fechaDesde = dFormat.format(this.getForm().getDataFecha().getDate());   
            minDate = dFormat.parse(fechaDesde);
            maxDate = new Date(minDate.getTime() + TimeUnit.DAYS.toMillis(1));

            return false;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Debe ingresar una fecha de busqueda válida");
            return true;
        }

    }

    private boolean validar() {
        return !obtenerFecha();
    }

    public void cerrarse() {
        this.getForm().setVisible(false);
        this.getInicioSesion().abrirse();

    }

}
