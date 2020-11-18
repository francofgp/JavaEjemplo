package controladoresCU;

import Hibernate.GestorHibernate;
import ModelosPA.Admin;
import ModelosPA.Usuario;
import Hibernate.GestorHibernate;
import ModelosPA.Admin;
import ModelosPA.Categoria;
import ModelosPA.Comercio;
import ModelosPA.Rubro;
import VistasPA.FrmAdmin;
import VistasPA.FrmComercio;

public class registrarAdmin {

    GestorHibernate oper;
    private FrmAdmin form;
    Admin model;

    public registrarAdmin() {
        oper = new GestorHibernate();
    }

    public void guardarUsuario(String password, String nombre) {
        Admin user = new Admin(password, nombre);
        oper.guardarUsuario(user);
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

    public FrmAdmin getForm() {
        return form;
    }

    public void setForm(FrmAdmin form) {
        this.form = form;
    }

    public Admin getModel() {
        return model;
    }

    public void setModel() {

        model = new Admin();
        model.setNombre(this.getForm().getTxtNombre().getText());
        model.setPassword(this.getForm().getTxtPassword().getText());

        this.model = model;
    }

    public void guardar() {
        this.setModel();
        oper.guardarObjeto(this.getModel());
    }
}
