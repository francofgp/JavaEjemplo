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
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
/**
 *
 * @author Chelo
 */
public class ControladorCategoria extends GestorHibernate implements ICategoriaRubro{
    
    GestorHibernate oper;
    public ControladorCategoria() {
     oper = new GestorHibernate();

    }
    
    public  void guardar(String nombre, String descripcion){
        Categoria categoria = new Categoria(nombre,descripcion);
        oper.guardarUsuario(categoria);
    }
        
    public  void modificar(String nombre, String descripcion, Long ID){
        oper.modificarCategoria(nombre,descripcion,ID);
    }
    
    public boolean corroborar(String nombre){
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
    
    
    
    @Override//implementar al menos 1 herencia de comportamiento
    public void eliminar(Long ID){
        Session s = HibernateUtil.getSession();
        Transaction tx = s.beginTransaction();
        
        try{
        Categoria categoria = (Categoria) s.createCriteria(Categoria.class)
                .add(Restrictions.eq("id",ID)).uniqueResult();
        
        s.delete(categoria);
        tx.commit();            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al eliminar la categoria ya que la tiene seleccionada un comercio" /*+ e.getMessage()*/, " Error ", JOptionPane.ERROR_MESSAGE);
            //getTx().rollback();
        }
    }

    public void darDeBajaCategoria(Long ID) {
        Session s = HibernateUtil.getSession();
        Transaction tx = s.beginTransaction();
        try {
            Categoria categoria = (Categoria) s.createCriteria(Categoria.class)
                    .add(Restrictions.eq("id", ID)).uniqueResult();

            categoria.setEstado("Dado de Baja");
            s.update(categoria);
            tx.commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al dar de baja a la categoria ", " Error ", JOptionPane.ERROR_MESSAGE);
            //getTx().rollback();

        }
    }
}
