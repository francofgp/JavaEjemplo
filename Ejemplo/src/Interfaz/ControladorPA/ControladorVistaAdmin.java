/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz.ControladorPA;

import VistasPA.FrmAdmin;

/**
 *
 * @author CrapBoy
 */
public class ControladorVistaAdmin {
    private ControladorAdmin oper;
    private FrmAdmin form;

    public ControladorAdmin getOper() {
        if (oper == null) {
            synchronized (ControladorAdmin.class) {
                oper = new ControladorAdmin();

            }
        }
        return oper;
    }

    public void setOper(ControladorAdmin oper) {
        this.oper = oper;
    }
    
    public FrmAdmin getForm() {
        return form;
    }

    public void setForm(FrmAdmin form) {
        this.form = form;
    }
    
    public void guardar() {

        this.getOper().guardarUsuario(this.getForm().getTxtPassword().getText(),
                this.getForm().getTxtNombre().getText());

    }
    
    
}
