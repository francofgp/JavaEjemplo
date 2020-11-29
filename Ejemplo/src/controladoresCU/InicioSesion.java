package controladoresCU;

import Hibernate.GestorHibernate;
import Interfaz.ControladorPA.ControladorVistaPrincipalComercio;
import ModelosPA.Comercio;
import ModelosPA.Usuario;
import VistasPA.FrmPrincipalComercio;
import VistasPA.FrmPrincipalUsuario;
import VistasPA.FrmVentanaAdmin;
import VistasPA.Frmlogin;
import javax.swing.JOptionPane;

public class InicioSesion {

    private GestorHibernate oper;
    private Frmlogin form;
    private RegistroUsuario rUsuario;
    private RegistroAdmin rAdmin;
    private RegistroComercio rComercio;
    private ControladorVistaPrincipalComercio vistaComercio;
    private GestionPedido gestionPedido;

    public RegistroComercio getrComercio() {
        if (rComercio == null) {
            synchronized (RegistroComercio.class) {
                rComercio = new RegistroComercio();
            }
        }
        return rComercio;
    }

    public GestionPedido getGestionPedido() {
        if (gestionPedido == null) {
            synchronized (GestionPedido.class) {
                gestionPedido = new GestionPedido();
            }
        }
        return gestionPedido;
    }

    public void setGestionPedido(GestionPedido gestionPedido) {
        this.gestionPedido = gestionPedido;
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
        Comercio comercio = this.getOper().buscarComercioLogin(this.getForm().getUsuarioText().getText(), password);
        //if (this.getOper().ingresarComercio(this.getForm().getUsuarioText().getText(), password)) { //si es verdadero abro el princiapl comercio y el return va a ser que cierre el login despues
        if (comercio != null) {
            this.getVistaComercio().abrirse(comercio);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Comercio o contraseña incorrecta", "", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
    }

    public void ingresarUsuario() {
        String password = new String(this.getForm().getjPasswordField1().getPassword());
        //primero pruebo si ingresa con admin, sino pruebo con usuario


        
        if (this.getOper().ingresarAdmin(this.getForm().getUsuarioText().getText(), password)) {
            FrmVentanaAdmin frmAdmin = new FrmVentanaAdmin();
            frmAdmin.setVisible(true);
        } else if (this.getOper().buscarUsuarioLogin(this.getForm().getUsuarioText().getText(), password)!=null) { //si es verdadero abro el princiapl comercio y el return va a ser que cierre el login despues
            Usuario usuario=  this.getOper().buscarUsuarioLogin(this.getForm().getUsuarioText().getText(), password);

            this.getGestionPedido().abrirse(usuario);

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

    public void iniciarSesion() {

        if (this.getForm().getCheckBoxComercio().isSelected()) {
            if (ingresarComercio()) {
                this.getForm().setVisible(false);
            }
        } else {
            ingresarUsuario();
            this.getForm().setVisible(false);
        }

    }
}
