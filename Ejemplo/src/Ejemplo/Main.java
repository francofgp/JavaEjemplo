package Ejemplo;

import Hibernate.HibernateUtil;
import VistasPA.FrmPrincipalUsuario;
import VistasPA.FrmVentanaAdmin;
import VistasPA.Frmlogin;
import VistasPA.FrmProducto;
import controladoresCU.ABMCategoria;

public class Main {

    public static void main(String[] args) {
        HibernateUtil.inicializar();

        Frmlogin frmLogin = new Frmlogin();
        frmLogin.setVisible(true);

    }

}
