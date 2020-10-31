/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz.ControladorPA;

import Hibernate.GestorHibernate;
import ModelosPA.Comercio;
import VistasPA.FrmPrincipalComercio;

/**
 *
 * @author CrapBoy
 */
public class ControladorVistaPrincipalComercio {
    
    private GestorHibernate oper;
    private FrmPrincipalComercio form;
    private Comercio comercio;

    public Comercio getComercio() {
        return comercio;
    }

    public void setComercio(Comercio comercio) {
        this.comercio = comercio;
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

    public FrmPrincipalComercio getForm() {
        return form;
    }

    public void setForm(FrmPrincipalComercio form) {
        this.form = form;
    }




    
    
    
    
}
