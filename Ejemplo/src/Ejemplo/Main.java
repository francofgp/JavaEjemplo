package Ejemplo;
import Hibernate.HibernateUtil;
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

        FrmVentanaAdmin frmVentanaAdmin = new FrmVentanaAdmin();
        frmVentanaAdmin.setVisible(true);
        
        FrmProducto HOLA = new FrmProducto();
        HOLA.setVisible(true);

    }

}
