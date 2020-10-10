/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz.ControladorPA;

import Hibernate.GestorHibernate;
import ModelosPA.Admin;
import ModelosPA.Rubro;

/**
 *
 * @author CrapBoy
 */
public class ControladorRubro {
    
    GestorHibernate oper;
    public ControladorRubro() {
     oper = new GestorHibernate();

    }
    
        public  void guardarUsuario(Rubro user){
        oper.guardarUsuario(user);
    }
        
    public  void modificarUsuario(String nombre, String descripcion, Long ID){
        oper.modificarUsuario(nombre,descripcion,ID);
    }
    
}
