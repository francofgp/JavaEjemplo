package controladoresCU;

import Hibernate.GestorHibernate;
import ModelosPA.Admin;
import ModelosPA.Usuario;
import VistasPA.FrmAdmin;
import VistasPA.FrmUsuario;

public class registrarUsuario {

    GestorHibernate oper;
    Usuario model;
    FrmUsuario form;

    public registrarUsuario() {
        oper = new GestorHibernate();

    }

    public FrmUsuario getForm() {
        return form;
    }

    public void setForm(FrmUsuario form) {
        this.form = form;
    }

    public Usuario getModel() {
        return model;
    }

    public void setModel() {

        model = new Usuario();
        model.setNombre(this.getForm().getTxtNombre().getText());
        model.setPassword(this.getForm().getTxtPassword().getText());
        model.setApellido(this.getForm().getTxtApellido().getText());
        model.setEmail(this.getForm().getTxtEmail().getText());
        model.setDireccion(this.getForm().getTxtDireccion().getText());
        model.setTelefono(this.getForm().getTxtTelefono().getText());
        model.setFechaNac(this.getForm().getTxtFecha().getText());
        this.model = model;
    }

    public void guardar() {
        this.setModel();
        oper.guardarObjeto(this.getModel());
    }
}
