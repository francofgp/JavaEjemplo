/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz.ControladorPA;

import Hibernate.GestorHibernate;
import Hibernate.HibernateUtil;
import ModelosPA.Admin;
import ModelosPA.Categoria;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
/**
 *
 * @author Chelo
 */
public class ControladorCategoria {
    
    GestorHibernate oper;
    public ControladorCategoria() {
     oper = new GestorHibernate();

    }
    
        public  void guardarUsuario(Categoria user){
        oper.guardarUsuario(user);
    }
        
    public  void modificarUsuario(String nombre, String descripcion, Long ID){
        oper.modificarCategoria(nombre,descripcion,ID);
    }
    
    public static boolean corroboraCategoria(String nombre){
        Session sesion = HibernateUtil.getSession();
        
        Categoria categoria = (Categoria) sesion.createCriteria(Categoria.class)
                .add(Restrictions.eq("nombre", nombre)).uniqueResult();                        
        
        try{
            if(categoria!=null){  
                String nom = categoria.getNombre();
                if(nom.equals(nombre)){
                    JOptionPane.showMessageDialog(null, "La categoría "+categoria.getNombre() + " ya existe!", "",JOptionPane.ERROR_MESSAGE);
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        } catch (Exception e) {
            return false;
        }
       
        }
}
