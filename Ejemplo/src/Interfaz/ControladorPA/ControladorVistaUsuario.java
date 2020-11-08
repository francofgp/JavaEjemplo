/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz.ControladorPA;

import ModelosPA.Usuario;
import VistasPA.FrmUsuario;

/**
 *
 * @author CrapBoy
 */
public class ControladorVistaUsuario {
    private ControladorUsuario oper;
    private FrmUsuario form;

    public ControladorUsuario getOper() {
        if (oper == null) {
            synchronized (ControladorVistaUsuario.class) {
                oper = new ControladorUsuario();

            }
        }
        return oper;
    }

    public void setOper(ControladorUsuario oper) {
        this.oper = oper;
    }

    public FrmUsuario getForm() {
        return form;
    }

    public void setForm(FrmUsuario form) {
        this.form = form;
    }

    public void Guardar() {

        this.getOper().guardarUsuario(this.getForm().getTxtPassword().getText(),
                this.getForm().getTxtNombre().getText(),
                this.getForm().getTxtApellido().getText(),
                this.getForm().getTxtEmail().getText(),
                this.getForm().getTxtDireccion().getText(),
                this.getForm().getTxtTelefono().getText(),
                this.getForm().getTxtFecha().getText());

    }


}
