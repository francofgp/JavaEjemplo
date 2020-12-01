package controladoresCU;

import Hibernate.GestorHibernate;
import ModelosPA.Calificacion;
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
import VistasPA.FrmPrincipalComercio;
import VistasPA.FrmRubro;
import VistasPA.FrmVerPedidoUsuario;
import java.awt.HeadlessException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class GestionPedido {

    private GestorHibernate oper;
    private FrmPrincipalUsuario form;
    private Usuario usuario;
    private Comercio comercio;
    private Pedido model;
    private Rubro rubro;
    private Categoria categoria;
    private float precioTotal = (float) 0.0;
    private List<Producto> producto;
    private FrmVerPedidoUsuario formPedido;
    private FrmPrincipalComercio formComercio;
    private String hora;
    private float puntaje;
    private Date fecha;

    
    /////////////////////////getter y setter ////////////////////////////////
    
    public FrmVerPedidoUsuario getFormPedido() {
        if (formPedido == null) {
            synchronized (FrmVerPedidoUsuario.class) {
                formPedido = new FrmVerPedidoUsuario();
            }
        }
        return formPedido;
    }

    public void setFormPedido(FrmVerPedidoUsuario form) {
        this.formPedido = form;
    }

    public float getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(float puntaje) {
        this.puntaje = puntaje;
    }

    public FrmPrincipalComercio getFormComercio() {
        return formComercio;
    }

    public void setFormComercio(FrmPrincipalComercio formComercio) {
        this.formComercio = formComercio;
    }

    public void setPedido(Pedido pedido) {
        this.model = pedido;
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
        model = new Pedido();
        model.setUsuario(this.getUsuario());
        model.setComercio(this.getComercio());
        model.setTotal(precioTotal);
        model.setProducto(producto);
        model.setDescripcion(this.getForm().getTxtDescripcion().getText());
        model.setEstado("Recien Creado");
        model.setFecha(fecha);
        model.setHora(hora);

    }

    public Rubro getRubro() {
        return rubro;
    }

    public void setRubro(Rubro rubro) {
        this.rubro = rubro;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

//    public String getFecha() {
//        return fecha;
//    }
//
//    public void setFecha(String fecha) {
//        this.fecha = fecha;
//    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public List<Producto> getProducto() {
        return producto;
    }

    public void setProducto(List<Producto> producto) {
        this.producto = producto;
    }
    
    
    //////////////////Metodos/////////////////////////

    public void cancelar() {
        conseguirPedido();
        this.darDeBaja();
        this.limpiarTablaPedido();
        this.cargarPedido();

    }

    public void darDeBaja() {
        this.getOper().cancelar(this.getModel());

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
        this.setRubro((Rubro) this.getForm().getjComboBoxRubro().getSelectedItem());
       /* if (this.getForm().getEstado() >= 2) {
            String s = String.valueOf(this.getForm().getjComboBoxRubro().getSelectedItem());
            //this.getForm().setIdDeRubroSeleccionado(this.buscarObjeto(s));
            this.setRubro((Rubro) this.getForm().getjComboBoxRubro().getSelectedItem());
        } else {
            this.getForm().setEstado(this.getForm().getEstado() + 1);
        }
*/
    }

    public void conseguirCategoriaSeleccionado() {
        this.setCategoria((Categoria) this.getForm().getjComboBoxCategoria().getSelectedItem());
        /*
        if (this.getForm().getEstadoCategoria() >= 2) {
            String s = String.valueOf(this.getForm().getjComboBoxCategoria().getSelectedItem());
            //this.getForm().setIdCategoriaSeleccionado(this.buscarCategoria(s));
            this.setCategoria((Categoria) this.getForm().getjComboBoxCategoria().getSelectedItem());
        } else {
            this.getForm().setEstadoCategoria(this.getForm().getEstadoCategoria() + 1);
        }
*/
    }

    public void cargarComercio() {

        if (this.getForm().getCheckBoxComercio().isSelected()) {
                    
//            this.setRubro((Rubro) this.getForm().getjComboBoxRubro().getSelectedItem());
                    
            conseguirRubroSeleccionado();
            conseguirCategoriaSeleccionado();
            String nombreComercio= this.getForm().getTxtBuscarComercio().getText();
            
            List<Comercio> comercio = this.getOper().buscarComercioPorNombre(nombreComercio);
            if (comercio.size() > 0) {
                Iterator consulta = comercio.iterator();
                while (consulta.hasNext()) {
                    DefaultTableModel tabla = (DefaultTableModel) this.getForm().getjTableComercio().getModel();

                    Vector datos = new Vector();
                    Comercio fila = (Comercio) consulta.next();
                    //  if (fila.getRubro().getId() == this.getRubro().getId()
                    //      && fila.getCategoria().getId() == this.getCategoria().getId()) {
                    datos.add(fila);
                    datos.add(fila.getId());
                    tabla.addRow(datos);

                    //}
                }
            } else {
                JOptionPane.showMessageDialog(null, "no hay productos con tales datos");
            }
            
            
        } else {
            conseguirRubroSeleccionado();
            conseguirCategoriaSeleccionado();
            List<Comercio> comercio = this.getOper().buscarComercioPorCategoriaYRubro(categoria, rubro);
            if (comercio.size() > 0) {
                Iterator consulta = comercio.iterator();
                while (consulta.hasNext()) {
                    DefaultTableModel tabla = (DefaultTableModel) this.getForm().getjTableComercio().getModel();

                    Vector datos = new Vector();
                    Comercio fila = (Comercio) consulta.next();
                    //  if (fila.getRubro().getId() == this.getRubro().getId()
                    //      && fila.getCategoria().getId() == this.getCategoria().getId()) {
                    datos.add(fila);
                    datos.add(fila.getId());
                    tabla.addRow(datos);

                    //}
                }
            } else {
                JOptionPane.showMessageDialog(null, "no hay productos con tales datos");
            }
        }

    }

    public void cargarProductos() {

        this.limpiarTablaProducto();
         List<Producto> producto;
        if(this.getForm().getCheckBoxComercio().isSelected()){
             producto = this.getOper().BuscarProducto(this.getComercio());
        }else{
            producto = this.getOper().BuscarProducto(this.getCategoria(), this.getComercio());
        }
        //List<Producto> producto = this.getOper().BuscarProducto(this.getCategoria(), this.getComercio());
        //List<Producto> producto = this.getOper().BuscarProducto();
        if (producto.size() > 0) {
            Iterator consulta = producto.iterator();
            while (consulta.hasNext()) {
                DefaultTableModel tabla = (DefaultTableModel) this.getForm().getjTableProducto().getModel();

                Vector datos = new Vector();
                Producto fila = (Producto) consulta.next();
                //if (fila.getComercio() == this.getComercio()
                //        && fila.getCategoria() == this.getCategoria()) {
                datos.add(fila);
                datos.add(fila.getDescripcion());
                datos.add(fila.getPrecio());
                datos.add(fila.getId());
                System.out.println(fila.getComercio().getNombre());
                //System.out.println(fila.getCategoria().getNombre());

                tabla.addRow(datos);

                //}
            }
        } else {
            JOptionPane.showMessageDialog(null, "no hay registros de productos");
        }
    }

    public void verPedido() {

        //this.setFormPedido();
        FrmVerPedidoUsuario fPedido = new FrmVerPedidoUsuario();
        setFormPedido(fPedido);
        this.getFormPedido().setVisible(true);
        this.getFormPedido().setControlVista(this);
        System.out.println(this.getUsuario().getId());
        this.cargarPedido();

    }

    public void cargarPedido() {

        //this.limpiarTablaPedido();
        long a = this.getUsuario().getId();
        System.out.println(a);

        List<Pedido> pedido = this.getOper().buscarPedido(this.getUsuario());

        if (pedido.size() > 0) {
            Iterator consulta = pedido.iterator();
            while (consulta.hasNext()) {
                DefaultTableModel tabla = (DefaultTableModel) this.getFormPedido().getjTablePedidos().getModel();

                Vector datos = new Vector();
                Pedido fila = (Pedido) consulta.next();

                //datos.add(fila);
                datos.add(fila);
                datos.add(fila.getTotal());
                datos.add(fila.getId());
                datos.add(fila.getUsuario().getNombre());
                datos.add(fila.getEstado());
                datos.add(fila.getComercio().getNombre());
                if (fila.getCalificacion() != null) {
                    datos.add(fila.getCalificacion().getCalificacion());
                } else {
                    datos.add("Sin calificar");
                }

                tabla.addRow(datos);

                //}
            }
        } else {
            JOptionPane.showMessageDialog(null, "no hay registros de productos");
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

    public void limpiarTablaCarro() {
        while (this.getForm().getjTableCarro().getRowCount() != 0) {
            ((DefaultTableModel) this.getForm().getjTableCarro().getModel()).removeRow(0);
        }
    }

    public void limpiarTablaPedido() {
        while (this.getFormPedido().getjTablePedidos().getRowCount() != 0) {
            ((DefaultTableModel) this.getFormPedido().getjTablePedidos().getModel()).removeRow(0);
        }
    }

    public void limpiarTablaProductos() {
        while (this.getFormPedido().getjTableProducto().getRowCount() != 0) {
            ((DefaultTableModel) this.getFormPedido().getjTableProducto().getModel()).removeRow(0);
        }
    }

    //String comercioSeleccionadoID;
    public void seleccionarComercio() {
        DefaultTableModel model = (DefaultTableModel) this.getForm().getjTableComercio().getModel();
        int selectedRowIndex = this.getForm().getjTableComercio().getSelectedRow();
        //this.getForm().getTxtComercio().setText(model.getValueAt(selectedRowIndex, 0).toString());
        //this.getForm().getTxtIDL().setText(model.getValueAt(selectedRowIndex, 1).toString());
        comercio = (Comercio) model.getValueAt(selectedRowIndex, 0);
        
        this.cargarProductos();

        this.calculoTotal();
    }

    public void seleccionarPedido() {
        DefaultTableModel tabla = (DefaultTableModel) this.getFormPedido().getjTablePedidos().getModel();
        int selectedRowIndex = this.getFormPedido().getjTablePedidos().getSelectedRow();

        this.model = (Pedido) tabla.getValueAt(selectedRowIndex, 0);

    }

    public void agregarAlCarro() {

        TableModel model1 = this.getForm().getjTableProducto().getModel();
        int[] indexs = this.getForm().getjTableProducto().getSelectedRows();
        Object[] row = new Object[4];
        DefaultTableModel model2 = (DefaultTableModel) this.getForm().getjTableCarro().getModel();

        if (model2.getRowCount() <= 4) {
            for (int i = 0; i < indexs.length; i++) {
                row[0] = model1.getValueAt(indexs[i], 0);
                row[1] = model1.getValueAt(indexs[i], 1);
                row[2] = model1.getValueAt(indexs[i], 2);
                row[3] = model1.getValueAt(indexs[i], 3);
                model2.addRow(row);
            }
        }
        this.calculoTotal();
    }

    public void hacerPedido() {

        if (validarPedido()) {
            this.calculoTotal();
            this.conseguirFechaHora();
            this.setModel();
            this.getOper().guardarObjeto(getModel());
            JOptionPane.showMessageDialog(null, "Pedido creado correctamente");
            this.limpiarTablaCarro();
            this.limpiarTablaComercio();
            this.limpiarTablaProducto();
            this.getForm().getTxtMontoTotal().setText("$ xxxxx");
            
        }
    }

    public void quitarProducto() {

        int viewIndex = this.getForm().getjTableCarro().getSelectedRow();
        if (viewIndex != -1) {
            int modelIndex = this.getForm().getjTableCarro().convertRowIndexToModel(viewIndex); // converts the row index in the view to the appropriate index in the model
            DefaultTableModel model = (DefaultTableModel) this.getForm().getjTableCarro().getModel();
            model.removeRow(modelIndex);
        }
        this.calculoTotal();
    }

    public float calculoTotal() {

        precioTotal = (float) 0.0;
        DefaultTableModel model = (DefaultTableModel) this.getForm().getjTableCarro().getModel();
        List<Producto> productos = new ArrayList<Producto>();

        for (int row = 0; row < this.getForm().getjTableCarro().getRowCount(); row++) {
            productos.add((Producto) model.getValueAt(row, 0));
            //System.out.println(model.getValueAt(row, 3).toString());
            precioTotal = precioTotal + Float.parseFloat(model.getValueAt(row, 2).toString());
        }

        this.getForm().getTxtMontoTotal().setText(String.valueOf(precioTotal));

        producto = productos;
        return precioTotal;
    }

    void abrirse(Usuario usuario) {

        FrmPrincipalUsuario frmUsuario = new FrmPrincipalUsuario();
        this.setForm(frmUsuario);
        this.getForm().setVisible(true);
        this.getForm().setControlVista(this);
        setUsuario(usuario);
        this.getForm().getTxtID().setText(Long.toString(getUsuario().getId()));
        this.getForm().getTxtNombre().setText(getUsuario().getNombre());
        this.getForm().getTxtCorreo().setText(getUsuario().getEmail());

    }

    public void cargarProductosPedido() {
        limpiarTablaProductos();
        this.seleccionarPedido();
        this.cargarPedidos();

    }

    public void conseguirPedido() {
        DefaultTableModel model = (DefaultTableModel) this.getFormPedido().getjTablePedidos().getModel();
        int selectedRowIndex = this.getFormPedido().getjTablePedidos().getSelectedRow();

        this.model = ((Pedido) model.getValueAt(selectedRowIndex, 0));

    }

    private void cargarPedidos() {
        //this.limpiarTablaProducto();
        List<Producto> producto = this.getModel().getProducto();
        //List<Producto> producto = this.getOper().BuscarProducto();
        if (producto.size() > 0) {
            Iterator consulta = producto.iterator();
            while (consulta.hasNext()) {
                DefaultTableModel tabla = (DefaultTableModel) this.getFormPedido().getjTableProducto().getModel();

                Vector datos = new Vector();
                Producto fila = (Producto) consulta.next();
                //if (fila.getComercio() == this.getComercio()
                //        && fila.getCategoria() == this.getCategoria()) {
                datos.add(fila);
                datos.add(fila.getDescripcion());
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

    public void activarCalificacion(boolean estado) {
        this.getFormPedido().getBtnAceptarCancelarCalificacion().setVisible(estado);
        this.getFormPedido().getBtnAceptarConfirmarCalificacion().setVisible(estado);

        this.getFormPedido().getBtnValor1().setVisible(estado);
        this.getFormPedido().getBtnValor2().setVisible(estado);
        this.getFormPedido().getBtnValor3().setVisible(estado);
        this.getFormPedido().getBtnValor4().setVisible(estado);
        this.getFormPedido().getBtnValor5().setVisible(estado);

        this.getFormPedido().getjLabelDescrip().setVisible(estado);
        this.getFormPedido().getjLabelDescripcion().setVisible(estado);
        this.getFormPedido().getTxtDescripcion().setVisible(estado);

    }

    public void calificar() {

        if (validar()) {
            setPuntaje(0.0f);
            activarCalificacion(true);
        }

    }

    public void cancelarCalificacion() {
        activarCalificacion(false);
    }

    public void obtenerPuntaje(float valor) {
        puntaje = valor;
    }

    public void aceptarCalificacion() {
        if (puntaje != 0.0f) {
            crearCalificacion();
            activarCalificacion(false);
            limpiarTablaPedido();
            cargarPedido();
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un puntaje");
        }
    }

    private void crearCalificacion() {
        Calificacion calificacion = new Calificacion();
        calificacion.setCalificacion(puntaje);
        calificacion.setDescripcion(this.getFormPedido().getTxtDescripcion().getText());
        model.setCalificacion(calificacion);
        this.getOper().actualizarObjeto(model);

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

    private void conseguirFechaHora() {
        
        hora= this.getForm().getjComboBoxHora().getSelectedItem().toString()
                + ":" + this.getForm().getjComboBoxMinuto().getSelectedItem().toString();

        Date date = Calendar.getInstance().getTime();  
        //DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");  
        fecha = date;  
    }

    private boolean validarPedido() {
        
        if(this.getComercio()==null){
            JOptionPane.showMessageDialog(null, "seleccione un comercio");
            return false;
        }
        

        
        if(producto.size() <= 0){
            JOptionPane.showMessageDialog(null, "seleccione al menos un producto");
            return false;
        }
        
        
        return true;
    }

    public void interactuarSeleccionComercio() {
        seleccionarComercio();
        limpiarTablaCarro();
        calculoTotal();

    }

    public void buscar() {
        this.limpiarTablaComercio();
        this.cargarComercio();

    }

 
}
