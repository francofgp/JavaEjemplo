package controladoresCU;

import Hibernate.GestorHibernate;
import ModelosPA.Calificacion;
import ModelosPA.Pedido;
import ModelosPA.Producto;
import ModelosPA.Usuario;
import VistasPA.FrmVerPedidoUsuario;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GestionCalificacion {

    private GestorHibernate oper;
    private FrmVerPedidoUsuario form;
    private Usuario usuario;
    private Pedido model;
    private float puntaje;

    public float getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(float puntaje) {
        this.puntaje = puntaje;
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

    public FrmVerPedidoUsuario getForm() {
        return form;
    }

    public void setForm(FrmVerPedidoUsuario form) {
        this.form = form;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Pedido getModel() {
        return model;
    }

    public void setModel(Pedido model) {
        this.model = model;
    }

    public void activarCalificacion(boolean estado) {
        this.getForm().getBtnAceptarCancelarCalificacion().setVisible(estado);
        this.getForm().getBtnAceptarConfirmarCalificacion().setVisible(estado);

        this.getForm().getBtnValor1().setVisible(estado);
        this.getForm().getBtnValor2().setVisible(estado);
        this.getForm().getBtnValor3().setVisible(estado);
        this.getForm().getBtnValor4().setVisible(estado);
        this.getForm().getBtnValor5().setVisible(estado);

        this.getForm().getjLabelDescrip().setVisible(estado);
        this.getForm().getjLabelDescripcion().setVisible(estado);
        this.getForm().getTxtDescripcion().setVisible(estado);

    }

    public void cargarProductosPedido() {
        limpiarTablaProductos();
        this.seleccionarPedido();
        this.cargarPedidos();

    }

    public void limpiarTablaProductos() {
        while (this.getForm().getjTableProducto().getRowCount() != 0) {
            ((DefaultTableModel) this.getForm().getjTableProducto().getModel()).removeRow(0);
        }
    }

    public void seleccionarPedido() {
        DefaultTableModel tabla = (DefaultTableModel) this.getForm().getjTablePedidos().getModel();
        int selectedRowIndex = this.getForm().getjTablePedidos().getSelectedRow();

        this.model = (Pedido) tabla.getValueAt(selectedRowIndex, 0);

    }

    private void cargarPedidos() {

        List<Producto> producto = this.getModel().getProducto();

        if (producto.size() > 0) {
            Iterator consulta = producto.iterator();
            while (consulta.hasNext()) {
                DefaultTableModel tabla = (DefaultTableModel) this.getForm().getjTableProducto().getModel();

                Vector datos = new Vector();
                Producto fila = (Producto) consulta.next();

                datos.add(fila);
                datos.add(fila.getDescripcion());
                datos.add(fila.getPrecio());
                datos.add(fila.getCategoria());
                
                tabla.addRow(datos);

            }
        } else {
            JOptionPane.showMessageDialog(null, "no hay registros de productos");
        }

    }

    public void aceptarCalificacion() {
        if (puntaje != 0.0f) {
            crearCalificacion();
            activarCalificacion(false);
            limpiarTablaPedido();
            cargarPedido();
            limpiarTablaProductos();
            model = null;
            this.getForm().getTxtDescripcion().setText("");
            JOptionPane.showMessageDialog(null, "Gracias por calificar " + ("\uD83D\uDC4D"));
        } else {
            
        }
    }

    public void cancelar() {
        
        try{
        conseguirPedido();
        this.darDeBaja();
        this.limpiarTablaPedido();
        this.cargarPedido();
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Debe seleccionar un pedido");
        }


    }

    public void conseguirPedido() {
        DefaultTableModel model2 = (DefaultTableModel) this.getForm().getjTablePedidos().getModel();
        int selectedRowIndex = this.getForm().getjTablePedidos().getSelectedRow();

        this.model = ((Pedido) model2.getValueAt(selectedRowIndex, 0));

    }

    public void darDeBaja() {
        this.getOper().cancelar(this.getModel());

    }

    public void limpiarTablaPedido() {
        while (this.getForm().getjTablePedidos().getRowCount() != 0) {
            ((DefaultTableModel) this.getForm().getjTablePedidos().getModel()).removeRow(0);
        }
    }

    public void cargarPedido() {

        long a = this.getUsuario().getId();
                
        List<Pedido> pedido = getOper().buscarPedido(this.getUsuario());

        if (pedido.size() > 0) {
            Iterator consulta = pedido.iterator();
            while (consulta.hasNext()) {
                DefaultTableModel tabla = (DefaultTableModel) this.getForm().getjTablePedidos().getModel();

                Vector datos = new Vector();
                Pedido fila = (Pedido) consulta.next();

                
                datos.add(fila);
                datos.add(fila.getTotal());
                datos.add(fila.getId());
                datos.add(fila.getEstado());
                datos.add(fila.getComercio().getNombreLocal());

                if (fila.getCalificacion() != null) {
                    datos.add(fila.getCalificacion().getCalificacion());
                } else {
                    datos.add("Sin calificar");
                }
                datos.add(fila.getFecha());

                tabla.addRow(datos);

                
            }
        } else {
            JOptionPane.showMessageDialog(null, "no hay registros de productos");
        }

    }

    public void obtenerPuntaje(float valor) {
        puntaje = valor;
    }

    private void crearCalificacion() {
        Calificacion calificacion = new Calificacion();
        calificacion.setCalificacion(puntaje);
        calificacion.setDescripcion(this.getForm().getTxtDescripcion().getText());
        model.setCalificacion(calificacion);
        this.getOper().actualizarObjeto(model);

    }

    public void calificar() {

        if (validar()) {
            setPuntaje(0.0f);
            activarCalificacion(true);
        }

    }

    private boolean validar() {
        if (model == null) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un pedido");
            return false;
        } else if (model.getCalificacion() != null) {
            JOptionPane.showMessageDialog(null, "Pedido ya calificado");
            return false;
        }
        return true;
    }

    public void cancelarCalificacion() {
        activarCalificacion(false);
    }

    void abrirse(Usuario usuario) {
        FrmVerPedidoUsuario fPedido = new FrmVerPedidoUsuario();
        this.setForm(fPedido);
        this.getForm().setControlVista(this);
        this.getForm().setVisible(true);
        this.setUsuario(usuario);
        this.cargarPedido();

    }

    public void buscar() {
        this.limpiarTablaPedido();
        this.limpiarTablaProductos();
        this.cargarBusquedaNombre();
    }
    
        private void cargarBusquedaNombre() {
        String nombreComercio = this.getForm().getTxtBuscarPedido().getText();
        List<Pedido> pedido = getOper().busquedaPedidoPorNombre(this.getUsuario(), nombreComercio);

        if (pedido.size() > 0) {
            Iterator consulta = pedido.iterator();
            while (consulta.hasNext()) {
                DefaultTableModel tabla = (DefaultTableModel) this.getForm().getjTablePedidos().getModel();

                Vector datos = new Vector();
                Pedido fila = (Pedido) consulta.next();

                datos.add(fila);
                datos.add(fila.getTotal());
                datos.add(fila.getId());
                datos.add(fila.getEstado());
                datos.add(fila.getComercio().getNombreLocal());

                if (fila.getCalificacion() != null) {
                    datos.add(fila.getCalificacion().getCalificacion());
                } else {
                    datos.add("Sin calificar");
                }
                datos.add(fila.getFecha());

                tabla.addRow(datos);

            }
        } else {
            JOptionPane.showMessageDialog(null, "no hay registros de productos");
        }
    }

    public void mostrarTodos() {
        this.limpiarTablaPedido();
        this.limpiarTablaProductos();
        this.cargarPedido();
    }

    void cerrarse() {
        if (getForm() != null) {
            this.getForm().setVisible(false);
        }
    }

    public void buscarPorFecha() {
        if(esFechaValida()){
            
        this.limpiarTablaPedido();
        this.limpiarTablaProductos();
            this.obtenerFecha();
            this.cargarBusquedaFecha();
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

    private boolean esFechaValida() {

        return !obtenerFecha();
    }
    
    public void cargarBusquedaFecha() {

        long a = this.getUsuario().getId();
                
        List<Pedido> pedido = getOper().buscarPedidoPorFecha(this.getUsuario(),minDate,maxDate);

        if (pedido.size() > 0) {
            Iterator consulta = pedido.iterator();
            while (consulta.hasNext()) {
                DefaultTableModel tabla = (DefaultTableModel) this.getForm().getjTablePedidos().getModel();

                Vector datos = new Vector();
                Pedido fila = (Pedido) consulta.next();

                
                datos.add(fila);
                datos.add(fila.getTotal());
                datos.add(fila.getId());
                datos.add(fila.getEstado());
                datos.add(fila.getComercio().getNombre());

                if (fila.getCalificacion() != null) {
                    datos.add(fila.getCalificacion().getCalificacion());
                } else {
                    datos.add("Sin calificar");
                }
                datos.add(fila.getFecha());

                tabla.addRow(datos);

                //}
            }
        } else {
            JOptionPane.showMessageDialog(null, "no hay registros de productos");
        }

    }


}
