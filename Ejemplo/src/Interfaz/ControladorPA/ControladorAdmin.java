/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz.ControladorPA;

import Hibernate.GestorHibernate;
import ModelosPA.Admin;
import ModelosPA.Usuario;

/**
 *
 * @author CrapBoy
 */
public class ControladorAdmin {
    GestorHibernate oper;
    public ControladorAdmin() {
     oper = new GestorHibernate();

    }
    
    
    
    
    
    public  void guardarUsuario(Admin user){
        oper.guardarUsuario(user);
    }
}
