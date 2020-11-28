package controladoresCU;

import Hibernate.GestorHibernate;
import VistasPA.FrmPrincipalComercio;
import VistasPA.FrmPrincipalUsuario;
import VistasPA.FrmVentanaAdmin;
import VistasPA.Frmlogin;

public class InicioSesion {

    private GestorHibernate oper;
    private Frmlogin form;
    private RegistroUsuario rUsuario;
    private RegistroAdmin rAdmin;
    private RegistroComercio rComercio;

    public RegistroComercio getrComercio() {
        if (rComercio == null) {
            synchronized (RegistroComercio.class) {
                rComercio = new RegistroComercio();
            }
        }
        return rComercio;
    }
    
    
    
    public RegistroUsuario getrUsuario() {
        if (rUsuario == null) {
            synchronized (RegistroUsuario.class) {
                rUsuario = new RegistroUsuario();

            }
        }
        return rUsuario;
    }

    public RegistroAdmin getrAdmin() {
                if (rAdmin == null) {
            synchronized (RegistroAdmin.class) {
                rAdmin = new RegistroAdmin();
            }
        }
        return rAdmin;
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

    public Frmlogin getForm() {
        if (form == null) {
            synchronized (Frmlogin.class) {
                form = new Frmlogin();
            }
        }
        return form;
    }

    public void setForm(Frmlogin form) {
        this.form = form;
    }

    public boolean ingresarComercio() {
        String password = new String(this.getForm().getjPasswordField1().getPassword());
        //this.getOper().Ingresar(this.getForm().getUsuarioText().getText(), password);

        if (this.getOper().ingresarComercio(this.getForm().getUsuarioText().getText(), password)) { //si es verdadero abro el princiapl comercio y el return va a ser que cierre el login despues
            FrmPrincipalComercio frmComercio = new FrmPrincipalComercio();
            frmComercio.setVisible(true);
            //necesito ahora pasarle los datos al frmComercio, del comercio de la sesion
            frmComercio.getControlVista().setComercio(this.getOper().buscarComercioIngresante(this.getForm().getUsuarioText().getText(), password));

            frmComercio.getTxtID().setText(Long.toString(frmComercio.getControlVista().getComercio().getId()));
            frmComercio.getTxtNombre().setText(frmComercio.getControlVista().getComercio().getNombre());
            frmComercio.getTxtEmail().setText(frmComercio.getControlVista().getComercio().getCorreo());

        }
        return this.getOper().ingresarComercio(this.getForm().getUsuarioText().getText(), password);
    }

    public void ingresarUsuario() {
        String password = new String(this.getForm().getjPasswordField1().getPassword());
        //primero pruebo si ingresa con admin, sino pruebo con usuario

        if (this.getOper().ingresarAdmin(this.getForm().getUsuarioText().getText(), password)) {
            FrmVentanaAdmin frmAdmin = new FrmVentanaAdmin();
            frmAdmin.setVisible(true);
        } else if (this.getOper().ingresarUsuario(this.getForm().getUsuarioText().getText(), password)) { //si es verdadero abro el princiapl comercio y el return va a ser que cierre el login despues
            FrmPrincipalUsuario frmUsuario = new FrmPrincipalUsuario();
            frmUsuario.setVisible(true);

            frmUsuario.getControlVista().setUsuario(this.getOper().buscarUsuarioIngresante(this.getForm().getUsuarioText().getText(), password));

            frmUsuario.getTxtID().setText(Long.toString(frmUsuario.getControlVista().getUsuario().getId()));
            frmUsuario.getTxtNombre().setText(frmUsuario.getControlVista().getUsuario().getNombre());
            frmUsuario.getTxtCorreo().setText(frmUsuario.getControlVista().getUsuario().getEmail());
        }
    }

    public void ingresarRegistrarUsuario() {
        this.getrUsuario().abrirse();
        this.getForm().setVisible(false);
    }

    public void ingresarRegistrarAdmin() {
        this.getrAdmin().abrirse();
        this.getForm().setVisible(false);// TODO add your handling code here:
    }

    public void ingresarRegistrarComercio() {
        this.getrComercio().abrirse();
        this.getForm().setVisible(false);
    }

    void abrirse() {
        this.getForm().setVisible(true);
    }
}
