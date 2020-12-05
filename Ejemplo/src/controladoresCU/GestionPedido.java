package controladoresCU;

import Hibernate.GestorHibernate;
import ModelosPA.Categoria;
import ModelosPA.Rubro;
import ModelosPA.Usuario;
import VistasPA.FrmPrincipalUsuario;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import ModelosPA.Comercio;
import ModelosPA.Pedido;
import ModelosPA.Producto;
import java.util.Calendar;
import java.util.Date;
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
    private InicioSesion inicioSesion;

    private String hora;

    private Date fecha;
    private GestionCalificacion controlCalificacion;

    public GestionCalificacion getControlCalificacion() {
        if (controlCalificacion == null) {
            synchronized (GestionCalificacion.class) {
                controlCalificacion = new GestionCalificacion();
            }
        }
        return controlCalificacion;
    }

    public void setControlCalificacion(GestionCalificacion controlCalificacion) {
        this.controlCalificacion = controlCalificacion;
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

    public void llenaJComboBoxRubro(JComboBox jComboBoxRubro) {

        List<Rubro> resulset = getOper().rubroShow();

        jComboBoxRubro.removeAllItems();

        for (Rubro rubro : resulset) {

            if ("Activo".equals(rubro.getEstado())) {
                jComboBoxRubro.addItem(rubro);

            }

        }
    }

    public void llenaJComboBoxCategoria(JComboBox jComboBoxCategoria) {

        List<Categoria> resulset = this.getOper().categoriaShow();

        jComboBoxCategoria.removeAllItems();

        for (Categoria categoria2 : resulset) {

            if ("Activo".equals(categoria2.getEstado())) {
                jComboBoxCategoria.addItem(categoria2);

            }

        }

    }

    public void conseguirRubroSeleccionado() {
        this.setRubro((Rubro) this.getForm().getjComboBoxRubro().getSelectedItem());
    }

    public void conseguirCategoriaSeleccionado() {
        this.setCategoria((Categoria) this.getForm().getjComboBoxCategoria().getSelectedItem());
    }

    public void cargarComercio() {

        conseguirRubroSeleccionado();
        conseguirCategoriaSeleccionado();

        List<Comercio> listaComercio = this.buscarComercio();

        if (listaComercio.size() > 0) {
            Iterator consulta = listaComercio.iterator();
            while (consulta.hasNext()) {
                DefaultTableModel tabla = (DefaultTableModel) this.getForm().getjTableComercio().getModel();

                Vector datos = new Vector();
                Comercio fila = (Comercio) consulta.next();

                datos.add(fila);
                datos.add(fila.getId());
                if (calificacionTabla(fila) > 0) {
                    datos.add(calificacionTabla(fila));
                } else {
                    datos.add("Sin calificar");
                }
                tabla.addRow(datos);

            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay comercios con tales datos!");
        }

    }

    public float calificacionTabla(Comercio fila) {

        int i = 0;
        float total = 0;
        float calificacion = 0;
        float subCat = 0;
        this.getOper();
        List<Pedido> pedido = oper.buscarPedidoComercio(fila);
        Iterator consulta = pedido.iterator();

        while (consulta.hasNext()) {

            Vector datos2 = new Vector();
            Pedido fila2 = (Pedido) consulta.next();

            if (fila2.getCalificacion() != null) {
                datos2.add(fila2.getCalificacion().getCalificacion());
                subCat = fila2.getCalificacion().getCalificacion();
                total = total + subCat;
                i++;
            }
        }
        calificacion = total / i;

        return calificacion;
    }

    public float calcularCalificacionTxt() {
        DefaultTableModel model3 = (DefaultTableModel) this.getForm().getjTableComercio().getModel();
        int selectedRowIndex = this.getForm().getjTableComercio().getSelectedRow();
        this.comercio = (Comercio) model3.getValueAt(selectedRowIndex, 0);

        List<Pedido> pedido = this.getOper().buscarPedidoComercio(this.getComercio());
        Iterator consulta = pedido.iterator();
        int i = 0;
        float total = 0;
        float calificacion;
        float subCat;

        while (consulta.hasNext()) {

            Vector datos3 = new Vector();
            Pedido fila = (Pedido) consulta.next();

            if (fila.getCalificacion() != null) {
                datos3.add(fila.getCalificacion().getCalificacion());
                subCat = fila.getCalificacion().getCalificacion();
                total = total + subCat;
                i++;
            }
        }

        calificacion = total / i;
        if (calificacion > 0) {
            this.getForm().getTxtID1().setText(String.valueOf(calificacion));

        } else {
            this.getForm().getTxtID1().setText("Sin calificar");

        }
        return calificacion;
    }

    public void cargarNombreComercio() {
        this.getForm().getJNombreComercio().setText(comercio.getNombre());
    }

    public void cargarProductos() {

        this.limpiarTablaProducto();
        List<Producto> producto3 = this.buscarProducto();

        if (producto3.size() > 0) {
            Iterator consulta = producto3.iterator();
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

    public void verPedido() {
        this.getControlCalificacion().abrirse(usuario);
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

    public void seleccionarComercio() {
        DefaultTableModel model4 = (DefaultTableModel) this.getForm().getjTableComercio().getModel();
        int selectedRowIndex = this.getForm().getjTableComercio().getSelectedRow();

        comercio = (Comercio) model4.getValueAt(selectedRowIndex, 0);

        this.cargarProductos();

        this.calculoTotal();
    }

    public void agregarAlCarro() {

        if(this.getForm().getjTableProducto().getSelectedRow()>-1){
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
        }else{
         JOptionPane.showMessageDialog(null, "Por favor seleccione un producto");
        }
        
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

            comercio = null;
            producto = null;

        }
    }

    public void quitarProducto() {
        if(this.getForm().getjTableProducto().getSelectedRow()>-1){
        int viewIndex = this.getForm().getjTableCarro().getSelectedRow();
        if (viewIndex != -1) {
            int modelIndex = this.getForm().getjTableCarro().convertRowIndexToModel(viewIndex); // converts the row index in the view to the appropriate index in the model
            DefaultTableModel model = (DefaultTableModel) this.getForm().getjTableCarro().getModel();
            model.removeRow(modelIndex);
        }
        this.calculoTotal();
        }else{
        JOptionPane.showMessageDialog(null, "Por favor seleccione producto a quitar");
        }
    }

    public float calculoTotal() {

        precioTotal = (float) 0.0;
        DefaultTableModel model5 = (DefaultTableModel) this.getForm().getjTableCarro().getModel();
        List<Producto> productos = new ArrayList<Producto>();

        for (int row = 0; row < this.getForm().getjTableCarro().getRowCount(); row++) {
            productos.add((Producto) model5.getValueAt(row, 0));

            precioTotal = precioTotal + Float.parseFloat(model5.getValueAt(row, 2).toString());
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
        this.getForm().getRbtnPorNombre().setSelected(true);

    }

    private void conseguirFechaHora() {

        hora = this.getForm().getjComboBoxHora().getSelectedItem().toString()
                + ":" + this.getForm().getjComboBoxMinuto().getSelectedItem().toString();

        Date date = Calendar.getInstance().getTime();

        fecha = date;
    }

    private boolean validarPedido() {

        if (this.getComercio() == null) {
            JOptionPane.showMessageDialog(null, "seleccione un comercio");
            return false;
        }

        if (producto.size() <= 0) {
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

    private List<Comercio> buscarComercio() {

        String nombreComercio = this.getForm().getTxtBuscarComercio().getText();

        if (this.getForm().getRbtnPorNombre().isSelected()) {
            return this.getOper().buscarComercioPorNombre(nombreComercio);

        } else if (this.getForm().getRbtnPorCategoriaRubro().isSelected()) {
            return this.getOper().buscarComercioPorCategoriaYRubro(nombreComercio, categoria, rubro);
        } else if (this.getForm().getRbtnSoloCategoria().isSelected()) {
            return this.getOper().buscarComercioPorCategoria(nombreComercio, categoria);
        } else {
            return this.getOper().buscarComercioPorRubro(nombreComercio, rubro);
        }
    }

    private List<Producto> buscarProducto() {

        //String nombreComercio = this.getForm().getTxtBuscarComercio().getText();

        if (this.getForm().getRbtnPorNombre().isSelected()) {
            return this.getOper().buscarProducto(this.getComercio());

        } else if (this.getForm().getRbtnPorCategoriaRubro().isSelected()) {
            return this.getOper().buscarProducto(this.getCategoria(), this.getComercio());
        } else if (this.getForm().getRbtnSoloCategoria().isSelected()) {
            return this.getOper().buscarProducto(this.getCategoria(), this.getComercio());
        } else {
            return this.getOper().buscarProducto(this.getComercio());
        }
    }

    public void cerrarse() {
        this.getForm().setVisible(false);
        this.getControlCalificacion().cerrarse();
        this.getInicioSesion().abrirse();
    }

}
