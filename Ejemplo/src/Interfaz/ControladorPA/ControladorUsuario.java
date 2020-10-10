/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz.ControladorPA;

import Hibernate.GestorHibernate;
import ModelosPA.Usuario;

/**
 *
 * @author CrapBoy
 */
public class ControladorUsuario {
    GestorHibernate oper;
    public ControladorUsuario() {
     oper = new GestorHibernate();

    }
    
    
    
    
    
    public  void guardarUsuario(Usuario user){
        oper.guardarUsuario(user);
    }
}
