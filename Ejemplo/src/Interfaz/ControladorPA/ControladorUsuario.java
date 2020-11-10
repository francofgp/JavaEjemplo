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
    
    
    
    public void guardarUsuario(String password, String nombre, String apellido, String email, String direccion, String telefono, String fechaNac) {
        Usuario user = new Usuario(password, nombre, apellido, email, direccion, telefono, fechaNac);
        oper.guardarUsuario(user);
    }
}
