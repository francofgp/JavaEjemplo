package controladoresCU;

import Hibernate.GestorHibernate;
import ModelosPA.Admin;
import ModelosPA.Usuario;
import Hibernate.GestorHibernate;

import ModelosPA.Admin;
import VistasPA.FrmAdmin;

public class registrarAdmin {
    
    GestorHibernate oper;
    private FrmAdmin form;
    
    
    public registrarAdmin() {
        oper = new GestorHibernate();
    }
    
    public  void guardarUsuario(String password, String nombre){
        Admin user = new Admin(password,nombre);
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
    
    public void guardar() {

        this.guardarUsuario(this.getForm().getTxtPassword().getText(),
                this.getForm().getTxtNombre().getText());

    }
    
    
    
    
    
}
