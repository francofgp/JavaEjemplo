package Ejemplo;
import Hibernate.HibernateUtil;
import VistasPA.FrmPrincipalUsuario;
import VistasPA.FrmVentanaAdmin;
import VistasPA.Frmlogin;
import VistasPA.FrmProducto;

public class Main {

    public static void main(String[] args) {
        HibernateUtil.inicializar();
        //FrmPrincipal frmPrincipal = new FrmPrincipal(this);
        //frmPrincipal.setVisible(true);
        Frmlogin frmLogin = new Frmlogin();
        frmLogin.setVisible(true);

        FrmPrincipalUsuario frmVentanaAdmin = new FrmPrincipalUsuario();
        frmVentanaAdmin.setVisible(true);
        


    }

}
