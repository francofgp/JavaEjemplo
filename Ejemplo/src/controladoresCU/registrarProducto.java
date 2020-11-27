package controladoresCU;

import Hibernate.GestorHibernate;
import ModelosPA.Admin;

import ModelosPA.Categoria;
import ModelosPA.Comercio;
import ModelosPA.Producto;
import VistasPA.FrmProducto;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class registrarProducto {

    private GestorHibernate oper;
    private FrmProducto form;
    private Comercio comercio;
    private Producto model;
    public Categoria categoria;

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
        return form;
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
    
    

    public void conseguirCategoriaSeleccionado() {
        if (this.getForm().getEstadoCategoria() >= 2) {
            String s = String.valueOf(this.getForm().getjComboBoxCategoria().getSelectedItem());
            //this.getForm().setIdCategoriaSeleccionado(this.buscarCategoria(s));
            this.setCategoria((Categoria) this.getForm().getjComboBoxCategoria().getSelectedItem());
        } else {
            this.getForm().setEstadoCategoria(this.getForm().getEstadoCategoria() + 1);
        }
    }

    public void setModel() {

        model = new Producto();
        model.setNombre(this.getForm().getTxtNombre().getText());
        model.setDescripcion(this.getForm().getTxtNombre().getText());
        model.setPrecio(Float.parseFloat(this.getForm().getTxtPrecio().getText()));
        model.setCategoria((Categoria) this.getCategoria());
        model.comercio = comercio;
        this.model = model;
    }

    public void guardar() {
        try {
            this.setModel();
            oper.guardarObjeto(this.getModel());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Parámetros incorrectos" + ex.getMessage(), " Error ", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void llenaJComboBoxCategoria(JComboBox jComboBoxCategoria) {
        List<Categoria> resulset = this.getOper().categoriaShow();

        jComboBoxCategoria.removeAllItems();

        for (Categoria categoria : resulset) {
            //jComboBox1.addItem("" + usuario.getNombre() + " - " + usuario.getApellido());
            if ("Activo".equals(categoria.getEstado())) {
                jComboBoxCategoria.addItem(categoria);

            }

        }
    }

    public Object buscarCategoriaPorId(Long id) {
        return oper.buscarCategoriaPorId(id);
    }
}
