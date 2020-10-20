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
import ModelosPA.Rubro;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

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
    public static boolean corroboraRubro(String nombre){
        Session sesion = HibernateUtil.getSession();
        
        Rubro rubro = (Rubro) sesion.createCriteria(Rubro.class)
                .add(Restrictions.eq("nombre", nombre)).uniqueResult();                        
        
        try{
            if(rubro!=null){  
                String nom = rubro.getNombre();
                if(nom.equals(nombre)){
                    JOptionPane.showMessageDialog(null, "El rubro "+rubro.getNombre() + " ya existe!", "",JOptionPane.ERROR_MESSAGE);
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
