package controladoresCU;

import Hibernate.GestorHibernate;
import ModelosPA.Admin;
import VistasPA.FrmAdmin;
import javax.swing.JOptionPane;

public class RegistroAdmin {

    private GestorHibernate oper;
    private FrmAdmin form;
    private Admin model;
    private InicioSesion inicioSesion;

    public RegistroAdmin() {
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

    }

    public void guardar() {
        if (validar()) {
            this.setModel();
            oper.guardarObjeto(this.getModel());
            JOptionPane.showMessageDialog(null, "Admin Creado");
            this.getForm().setVisible(false);
            this.getInicioSesion().abrirse();
        }
    }

    private boolean validar() {
        String nombs = this.getForm().getTxtNombre().getText();
        String trim = nombs.trim();
        if (trim.length() == 0) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un nombre a su Admin");
            return false;
        }

        if (this.getOper().corroborarAdmin(trim)) {
            JOptionPane.showMessageDialog(null, "Nombre de admin ya esta en uso");
            return false;
        }

        return true;

    }

    void abrirse() {
        new FrmAdmin().setVisible(true);
    }
}
