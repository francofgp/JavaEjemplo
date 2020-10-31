/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz.ControladorPA;

import Hibernate.GestorHibernate;
import VistasPA.FrmPrincipalComercio;
import VistasPA.Frmlogin;

/**
 *
 * @author CrapBoy
 */
public class ControladorVistaLogin {
    
    private GestorHibernate oper;
    private Frmlogin form;

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
        return form;
    }

    public void setForm(Frmlogin form) {
        this.form = form;
    }

    public boolean ingresarComercio() {
        String password = new String(this.getForm().getjPasswordField1().getPassword());
        //this.getOper().Ingresar(this.getForm().getUsuarioText().getText(), password);
        
        if(this.getOper().ingresarComercio(this.getForm().getUsuarioText().getText(), password)){ //si es verdadero abro el princiapl comercio y el return va a ser que cierre el login despues
                FrmPrincipalComercio frmComercio= new FrmPrincipalComercio();
                frmComercio.setVisible(true);
            //necesito ahora pasarle los datos al frmComercio, del comercio de la sesion
            frmComercio.getControlVista().setComercio(this.getOper().buscarComercioIngresante(this.getForm().getUsuarioText().getText(), password));
            frmComercio.getTxtID().setText(Long.toString(frmComercio.getControlVista().getComercio().getId()));
            frmComercio.getTxtNombre().setText(frmComercio.getControlVista().getComercio().getNombre());
            frmComercio.getTxtEmail().setText(frmComercio.getControlVista().getComercio().getCorreo());

               
        }
        return this.getOper().ingresarComercio(this.getForm().getUsuarioText().getText(), password);
    }
    
    
    
}
