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
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author CrapBoy
 */
public class ControladorRubro extends GestorHibernate implements ICategoriaRubro{
    
    GestorHibernate oper;
    public ControladorRubro() {
     oper = new GestorHibernate();

    }
    
    public  void guardar(String nombre, String descripcion){
        Rubro rubro = new Rubro(nombre,descripcion);
        oper.guardarUsuario(rubro);
    }
        
    public  void modificar(String nombre, String descripcion, Long ID){
        oper.modificarUsuario(nombre,descripcion,ID);
    }
    
    
    
     //implementar al menos 3 try y catch

    public  boolean corroborar(String nombre){
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
    
    @Override 
    public void eliminar(Long ID){
                Session s = HibernateUtil.getSession();
        Transaction tx = s.beginTransaction();
        try{
            Rubro rubro = (Rubro) s.createCriteria(Rubro.class)
            .add(Restrictions.eq("id",ID)).uniqueResult();
        
        s.delete(rubro);
        tx.commit();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al eliminar el rubro ya que lo tiene seleccionado un comercio " /*+ e.getMessage()*/, " Error ", JOptionPane.ERROR_MESSAGE);
            //getTx().rollback();

        }
    }
    
    
    
    
    
}
