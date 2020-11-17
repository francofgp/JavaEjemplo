package controladoresCU;

import Hibernate.GestorHibernate;
import ModelosPA.Categoria;
import ModelosPA.Comercio;
import ModelosPA.Rubro;
import VistasPA.FrmComercio;
import javax.swing.JComboBox;

public class ABMComercio {

    FrmComercio form;
    GestorHibernate oper;
    Comercio model;

    public GestorHibernate getOper() {
        if (oper == null) {
            synchronized (GestorHibernate.class) {
                oper = new GestorHibernate();
            }
        }
        return oper;
    }

    public ABMComercio() {
        oper = new GestorHibernate();

    }

    public void setOper(GestorHibernate oper) {
        this.oper = oper;
    }

    public FrmComercio getForm() {
        return form;
    }

    public void setForm(FrmComercio form) {
        this.form = form;
    }

    public Comercio getModel() {
        return model;
    }

    public void setModel() {

        model = new Comercio();
        model.setNombre(this.getForm().getTxtNombre().getText());
        model.setApellido(this.getForm().getTxtApellido().getText());
        model.setFechaNac(this.getForm().getTxtFecha().getText());
        model.setPassword(this.getForm().getTxtPassword().getText());
        model.setDireccion(this.getForm().getTxtDireccion().getText());
        model.setCorreo(this.getForm().getTxtEmail().getText());
        model.setTelefono(this.getForm().getTxtTelefono().getText());
        model.setCuil(this.getForm().getTxtCuit().getText());
        model.setDireccionNegocio(this.getForm().getTxtDireccionLocal().getText());
        model.setNombreLocal(this.getForm().getTxtNombreLocal().getText());
        model.setRubro((Rubro) this.getForm().buscarObjetoPorId(this.getForm().getIdDeRubroSeleccionado()));
        model.setCategoria((Categoria) this.getForm().buscarCategoriaPorId(this.getForm().getIdCategoriaSeleccionado()));

        this.model = model;
    }

    public void llenaJComboBoxUsuario(JComboBox jComboBoxRubro) {
        getOper().llenaJComboBoxUsuario(jComboBoxRubro);
    }

    //////////////////////////    
    public void llenaJComboBoxCategoria(JComboBox jComboBoxCategoria) {
        this.getOper().llenaJComboBoxCategoria(jComboBoxCategoria);
    }

    public Object buscarCategoriaPorId(Long idCategoriaSeleccionado) {
        return getOper().buscarCategoriaPorId(idCategoriaSeleccionado);
    }
    /////////////////////////

    public long buscarObjeto(String s) {
        return oper.buscarObjeto(s);
    }

    public long buscarCategoria(String s) {
        return oper.buscarCategoria(s);
    }

    public Object buscarObjetoPorId(Long idDeRubroSeleccionado) {
        return oper.buscarObjetoPorId(idDeRubroSeleccionado);
    }

    public void guardar() {
        this.setModel();
        oper.guardarObjeto(this.getModel());
    }

    ////////////////////////////////////////////////////
    public void conseguirIDRubroSeleccionado() {
        if (this.getForm().getEstado() >= 2) {
            String s = String.valueOf(this.getForm().getjComboBoxRubro().getSelectedItem());

            this.getForm().setIdDeRubroSeleccionado(this.buscarObjeto(s));
        } else {
            this.getForm().setEstado(this.getForm().getEstado() + 1);
        }
    }

    public void conseguirIDCategoriaSeleccionado() {
        if (this.getForm().getEstadoCategoria() >= 2) {
            String s = String.valueOf(this.getForm().getjComboBoxCategoria().getSelectedItem());
            this.getForm().setIdCategoriaSeleccionado(this.buscarCategoria(s));
        } else {
            this.getForm().setEstadoCategoria(this.getForm().getEstadoCategoria() + 1);
        }
    }

}
