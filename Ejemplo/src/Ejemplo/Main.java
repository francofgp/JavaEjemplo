package Ejemplo;

import Hibernate.HibernateUtil;
import VistasPA.Frmlogin;

public class Main {

    public static void main(String[] args) {
        HibernateUtil.inicializar();

        Frmlogin frmLogin = new Frmlogin();
        frmLogin.setVisible(true);

    }

}
