package controladoresCU;

import Hibernate.GestorHibernate;
import Interfaz.ControladorPA.ControladorVistaPrincipalComercio;
import ModelosPA.Categoria;
import ModelosPA.Comercio;
import ModelosPA.Producto;
import VistasPA.FrmProducto;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class ABMProducto {

    private GestorHibernate oper;
    private FrmProducto form;
    private Comercio comercio;
    private Producto model;
    public Categoria categoria;
    private ControladorVistaPrincipalComercio vistaComercio;

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

    public FrmProducto getForm() {
        if (form == null) {
            synchronized (FrmProducto.class) {
                form = new FrmProducto();
            }
        }
        return form;
    }

    public ControladorVistaPrincipalComercio getVistaComercio() {
        if (vistaComercio == null) {
            synchronized (ControladorVistaPrincipalComercio.class) {
                vistaComercio = new ControladorVistaPrincipalComercio();
            }
        }
        return vistaComercio;
    }

    public void setVistaComercio(ControladorVistaPrincipalComercio vistaComercio) {
        this.vistaComercio = vistaComercio;
    }

    public void setForm(FrmProducto form) {
        this.form = form;
    }

    public Comercio getComercio() {
        return comercio;
    }

    public void setComercio(Comercio comercio) {
        this.comercio = comercio;
    }

    public Producto getModel() {
        return model;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setProductoElegido(Producto producto) {
        model = producto;
    }

    public void conseguirCategoriaSeleccionado() {
        this.setCategoria((Categoria) this.getForm().getjComboBoxCategoria().getSelectedItem());
    }

    public void setModel() {

        model = new Producto();
        model.setNombre(this.getForm().getTxtNombre().getText());
        model.setDescripcion(this.getForm().getTxtDescripcion().getText());
        model.setPrecio(Float.parseFloat(this.getForm().getTxtPrecio().getText()));
        model.setCategoria((Categoria) this.getForm().getComboBoxCategoria().getSelectedItem());
        model.setEstado("Activo");
        model.setComercio(comercio);

    }

    public void modificar() {
        model.setNombre(this.getForm().getTxtNombre().getText());
        model.setDescripcion(this.getForm().getTxtDescripcion().getText());
        model.setPrecio(Float.parseFloat(this.getForm().getTxtPrecio().getText()));
        model.setCategoria((Categoria) this.getForm().getComboBoxCategoria().getSelectedItem());
        model.comercio = comercio;

        this.getOper().actualizarObjeto(this.getModel());
    }

    public void guardar() {
        this.setModel();
        this.getOper().guardarObjeto(this.getModel());
    }

    public void crearModificar() {
        if ("1".equals(form.getModificado())) {
            modificar();
            JOptionPane.showMessageDialog(null, "El producto se modificó con éxito!");
            this.salir();
        } else {
            guardar();
            JOptionPane.showMessageDialog(null, "El producto se registró con éxito!");
            this.salir();
        }
    }

    public void modificarCrear() {

        if (validar()) {
            crearModificar();
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

    public Object buscarCategoriaPorId(Long id) {
        return oper.buscarCategoriaPorId(id);
    }

    public void abrirse(Comercio comercio) {

        this.getForm();
        this.getForm().setVisible(true);
        this.getForm().getControlVista().setComercio(comercio);

    }

    private boolean validar() {
        String nombs = this.getForm().getTxtNombre().getText();
        String trim = nombs.trim();

        if (trim.length() == 0) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un nombre a su producto");
            return false;
        }
        try {
            Float.parseFloat(this.getForm().getTxtPrecio().getText());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un número para el precio");
            return false;
        }

        if ("1".equals(form.getModificado()) && (this.getOper().corroborarProducto(trim) == false || this.getModel().getNombre().equals(trim))) {
            return true;
        } else if (!"1".equals(form.getModificado()) && this.getOper().corroborarProducto(trim) == false) {
            return true;

        } else {
            JOptionPane.showMessageDialog(null, "El producto ya existe");
            return false;
        }
    }

    public void salir() {
        this.getForm().setVisible(false);
        this.getVistaComercio().abrirse(comercio);
    }

    public void setearCampos(String modificado, Producto producto) {
        this.getForm().getTxtDescripcion().setText(producto.getDescripcion());
        this.getForm().getTxtNombre().setText(producto.getNombre());
        this.getForm().getTxtPrecio().setText(Float.toString(producto.getPrecio()));
        this.getForm().getBtnCrear().setText("Modificar categoria");
        this.getForm().setModificado(modificado);
        this.getForm().getComboBoxCategoria().getModel().setSelectedItem(producto.getCategoria());

        this.setProductoElegido(producto);
    }

    public void abrirseParaModificar(Comercio comercio, Producto producto) {
        this.getForm();
        this.getForm().setVisible(true);
        this.getForm().getControlVista().setComercio(comercio);

        setProductoElegido(producto);
        getForm().modificar("1", getModel());
        getForm().setVisible(true);

    }

    public void preguntarEliminar() {
        int preg = JOptionPane.showConfirmDialog(null, "Seguro que desea elimar este producto?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (preg == JOptionPane.YES_OPTION) {
            eliminar();
        }
    }

    public void eliminar() {
        this.getModel().setComercio(null);

        try {
            this.getOper().eliminarObjeto(this.getModel());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No se puede eliminar, ya que el producto tiene al menos un pedido asociado");
        }
    }

    public void darDeBaja() {
        this.getOper().cambiarEstadoProducto(this.getModel(), "Dado de Baja");
    }

    public void darDeAlta() {
        this.getOper().cambiarEstadoProducto(this.getModel(), "Activo");
    }

}
