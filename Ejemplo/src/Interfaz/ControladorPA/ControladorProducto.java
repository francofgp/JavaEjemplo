/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz.ControladorPA;

import Hibernate.GestorHibernate;
import ModelosPA.Categoria;
import ModelosPA.Comercio;
import ModelosPA.Producto;
import javax.swing.JOptionPane;

/**
 *
 * @author CrapBoy
 */
public class ControladorProducto {
    private GestorHibernate oper;

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
    
    
    

    void guardar(String nombre, String descripcion, float precio, Categoria categoria, Comercio comercio) {
        
        
        Producto producto = new Producto(nombre, descripcion, precio, categoria, comercio);
        
        try {
            this.getOper().guardarUsuario(producto);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al crear el producto " + e.getMessage(), " Error ", JOptionPane.ERROR_MESSAGE);
        }

    }


    
    
    
}
