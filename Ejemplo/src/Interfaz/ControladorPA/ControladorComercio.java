/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz.ControladorPA;

import Hibernate.GestorHibernate;
import ModelosPA.Admin;
import ModelosPA.Comercio;
import javax.swing.JComboBox;

/**
 *
 * @author CrapBoy
 */
public class ControladorComercio {
    GestorHibernate oper;
    public ControladorComercio() {
     oper = new GestorHibernate();

    }
    
    
    
    public  void guardarUsuario(Comercio comercio){
        oper.guardarUsuario(comercio);
    }
    
    public void llenaJComboBoxUsuario(JComboBox jComboBoxRubro){
        oper.llenaJComboBoxUsuario(jComboBoxRubro);
    }

    public  long  buscarObjeto(String s) {
        return oper.buscarObjeto(s);
    }
}
