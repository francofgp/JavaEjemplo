/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz.ControladorPA;

import ModelosPA.Categoria;
import ModelosPA.Rubro;
import VistasPA.FrmComercio;

/**
 *
 * @author CrapBoy
 */
public class ControladorVistaComercio {
    
    private ControladorComercio oper;
    private FrmComercio form;

    public ControladorComercio getOper() {
        if (oper == null) {
            synchronized (ControladorComercio.class) {
                oper = new ControladorComercio();

            }
        }
        return oper; 
    }

    public void setOper(ControladorComercio oper) {
        this.oper = oper;
    }

    public FrmComercio getForm() {
        return form;
    }

    public void setForm(FrmComercio form) {
        this.form = form;
    }

    public void guardar() {
        this.getOper().guardar(this.getForm().getTxtNombre().getText(),this.getForm().getTxtApellido().getText(),
                this.getForm().getTxtFecha().getText(),this.getForm().getTxtPassword().getText(),
                this.getForm().getTxtDireccion().getText(),this.getForm().getTxtEmail().getText(),
                this.getForm().getTxtCuit().getText(),this.getForm().getTxtTelefono().getText(),
                this.getForm().getTxtNombreLocal().getText(),this.getForm().getTxtDireccionLocal().getText(),
                (Rubro) this.getForm().buscarObjetoPorId(this.getForm().getIdDeRubroSeleccionado()),
                (Categoria) this.getForm().buscarCategoriaPorId(this.getForm().getIdCategoriaSeleccionado()));
    }
    
    /*
    this.txtNombre.getText(),this.txtApellido.getText(), this.txtFecha.getText(),
                                    this.txtPassword.getText(),this.txtDireccion.getText(),this.txtEmail.getText(),
                                    this.txtCuit.getText(),this.txtTelefono.getText(),this.txtNombreLocal.getText(),
                                    this.txtDireccionLocal.getText() , (Rubro) buscarObjetoPorId(idDeRubroSeleccionado),
                                    (Categoria) buscarCategoriaPorId(idCategoriaSeleccionado
    */

    public void conseguirIDRubroSeleccionado() {
        if (this.getForm().getEstado()>=2){
        String s = String.valueOf(this.getForm().getjComboBoxRubro().getSelectedItem());
        
        this.getForm().setIdDeRubroSeleccionado(this.getOper().buscarObjeto(s));
        
        //System.out.println(idDeRubroSeleccionado+ "estoy aca");

        }else{
            this.getForm().setEstado(this.getForm().getEstado() +1);
            //estado= estado+1;
        }    
    }

    public void conseguirIDCategoriaSeleccionado() {
        if (this.getForm().getEstadoCategoria()>=2){
        String s = String.valueOf(this.getForm().getjComboBoxCategoria().getSelectedItem());
        
        this.getForm().setIdCategoriaSeleccionado(this.getOper().buscarCategoria(s));
        

        }else{
            this.getForm().setEstadoCategoria(this.getForm().getEstadoCategoria() +1);
        }      
    }
    




    
    
    
}
