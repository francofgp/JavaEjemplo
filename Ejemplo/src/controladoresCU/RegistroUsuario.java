package controladoresCU;

import Hibernate.GestorHibernate;
import ModelosPA.Admin;
import ModelosPA.Usuario;
import VistasPA.FrmAdmin;
import VistasPA.FrmUsuario;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class RegistroUsuario {

    GestorHibernate oper;
    Usuario model;
    FrmUsuario form;
    String date;
    InicioSesion inicioSesion;

    public RegistroUsuario() {
        oper = new GestorHibernate();

    }

    public InicioSesion getInicioSesion() {
        if (inicioSesion == null) {
            synchronized (InicioSesion.class) {
                inicioSesion = new InicioSesion();
            }
        }
        return inicioSesion;
    }

    public void setInicioSesion(InicioSesion inicioSesion) {
        this.inicioSesion = inicioSesion;
    }

    public GestorHibernate getOper() {
        return oper;
    }

    public void setOper(GestorHibernate oper) {
        this.oper = oper;
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
        model.setFechaNac(date);
        //this.model = model;
    }

    public void guardar() {

        if (validar()) {
            this.setModel();
            oper.guardarObjeto(this.getModel());
            JOptionPane.showMessageDialog(null, "Usuario Creado");
            this.getForm().setVisible(false);
            this.getInicioSesion().abrirse();

        }

    }

    private boolean obtenerFecha() {

        try {
            SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
            date = dFormat.format(this.getForm().getDataFecha().getDate());
            System.out.println(date);
            return false;
        } catch (Exception e) {
            return true;
        }

    }

    private boolean validar() {
        String nombs = this.getForm().getTxtNombre().getText();
        String trim = nombs.trim();
        if (trim.length() == 0) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un nombre a su Usuario");
            return false;
        }
        if (this.getOper().corroborarUsuario(trim) || this.getOper().corroborarComercio(trim) || this.getOper().corroborarAdmin(trim)) {
            JOptionPane.showMessageDialog(null, "Nombre de usuario ya esta en uso");
            return false;
        }

        if (obtenerFecha()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar Fecha de Nacimiento");
            return false;
        }

        return true;
    }

    public void abrirse() {
        new FrmUsuario().setVisible(true);
    }
}
