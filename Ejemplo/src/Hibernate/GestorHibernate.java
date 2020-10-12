package Hibernate;
import GUtilr.Util;
import ModelosPA.Categoria;
import ModelosPA.Rubro;
import ModelosPA.Usuario;
//import Modelos.GestionProyecto.Usuario;
import java.awt.Component;
import java.util.*;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.openSession;
import org.hibernate.Transaction;
import org.hibernate.criterion.*;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
//import Modelos.GestionProyecto.Usuario;



public class GestorHibernate extends HibernateUtil {

    public static void Usuario(String text, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       
    
    private Transaction tx;
    /**
     * Elimina un objeto del repositorio
     * @param objeto Objeto a eliminar
     */
    public void eliminarObjeto(Object objeto){
         try{   
            Session s = HibernateUtil.getSession();
            Transaction tx = s.beginTransaction();
            s.delete(objeto);        
            tx.commit();
               } catch(Exception ex){
                System.out.println("Repositorio.eliminarObjeto(Object objeto)"+ex);
            ex.printStackTrace();
                JOptionPane.showMessageDialog((Component)null,"El elemento no se puede eliminar:"+ex.getMessage(),"Error",0);
                getTx().rollback();
            }
    }

    public void guardarObjeto(Object objeto){
        try{
        Session s = HibernateUtil.getSession();
        Transaction tx = s.beginTransaction();
        s.save(objeto);        
        tx.commit();
        
        
         System.out.println(" guardaractualizarObjeto() " +objeto.getClass()+": "+objeto.toString());  
        } catch(Exception ex){
            System.out.println("error "+ex);
            System.out.println("Repositorio.guardarObjeto(Object objeto)"+objeto.getClass()+": "+objeto.toString()+ex);
            ex.printStackTrace();
            getTx().rollback();
        }
    }
    
        public void guardarUsuario(Object objeto){
        
        //esto es copiado y pegado, basicamente a todo lo que estaba antes lo guarda, sin verificar nada
        // le paso el objeto que lo cree en el FRMusuario, aca se puede hacer comprobaciones supongo, ya que es el gestor
        Session s = HibernateUtil.getSession();
        Transaction tx = s.beginTransaction();
       // objeto.setApellido("asd");
       // objeto.setNombre("asdasd");
       // objeto.setId(2);
        s.save(objeto);        
        tx.commit();
    }
        
    
        
    public void modificarUsuario(String nombre, String descripcion, Long ID){
        
        
        Session s = HibernateUtil.getSession();
        Transaction tx = s.beginTransaction();
        
        
        Rubro rubro = (Rubro) s.createCriteria(Rubro.class)
                .add(Restrictions.eq("id",ID)).uniqueResult();
        
        rubro.setDescripcion(descripcion);
        rubro.setNombre(nombre);
        s.update(rubro);
        tx.commit();
        
        /***
        //esto es copiado y pegado, basicamente a todo lo que estaba antes lo guarda, sin verificar nada
        // le paso el objeto que lo cree en el FRMusuario, aca se puede hacer comprobaciones supongo, ya que es el gestor
        Session s = HibernateUtil.getSession();
        Transaction tx = s.beginTransaction();
       // objeto.setApellido("asd");
       // objeto.setNombre("asdasd");
       // objeto.setId(2);
        s.save(objeto);        
        tx.commit();
        * ***/
    }
    
    public void modificarCategoria(String nombre, String descripcion, Long ID){
        
        
        Session s = HibernateUtil.getSession();
        Transaction tx = s.beginTransaction();
        
        
        Categoria categoria = (Categoria) s.createCriteria(Categoria.class)
                .add(Restrictions.eq("id",ID)).uniqueResult();
        
        categoria.setDescripcion(descripcion);
        categoria.setNombre(nombre);
        s.update(categoria);
        tx.commit();
      
    }

     /**
     * Actualiza un objeto en el repositorio
     * @param objeto Objeto a actualizar
     */
    public boolean actualizarObjeto(Object objeto){
          Session s = HibernateUtil.getSession();
        Transaction tx = s.beginTransaction();
        try{
            s.update(objeto);
            tx.commit();
            System.out.println(" actualizarObjeto() " +objeto.getClass()+": "+objeto.toString());
            return true;
        }catch(HibernateException e){
            JOptionPane.showMessageDialog(null, e);
            tx.rollback();
            JOptionPane.showMessageDialog(null, "No se pueden guardar los datos. \nLos mismos han sido modificados por otra persona.");
//            this.clearCache(); //puso juan

            return false;
        }
    }
    
    
       public static List<Rubro> RubroShow(){
           Session sesion = HibernateUtil.getSession();
           List<Rubro> rubro = session.createCriteria(Rubro.class).list();
           return rubro;
        
    }
    
    
    public Transaction getTx() {
        return tx;
    }

    public void setTx(Transaction tx) {
        this.tx = tx;
    }

      public List listarClase(Class clase){
        Criteria crit = getSession().createCriteria(clase);
        return crit.list();
    }

    public List listarClase(Class clase,String atributoOrden, int estado){
        Criteria crit = getSession().createCriteria(clase).addOrder(Order.asc(atributoOrden))
                        .add (Restrictions.eq("estado",estado));
        return crit.list();
    }

    public List listarClase(Class clase,String atributoOrden){
        Criteria crit = getSession().createCriteria(clase).addOrder(Order.asc(atributoOrden));
        return crit.list();
    }
 
//    public Integer listarUltimo(Class clase) {
//        Criteria crit = getSession().createCriteria(clase);
//        crit.setProjection(Projections.max("codigo"));
//        return Util.convertirToInteger(crit.uniqueResult());
//    }

    public List listarUltimo(Class clase) {
           Criteria crit = getSession().createCriteria(clase) 
                        .addOrder(Order.desc("codigo"));
        return crit.list();         
    }

    public List listarClaseCodigo(Class clase, int valor){        
        Criteria crit = getSession().createCriteria(clase)
            .add( Restrictions.eq("codigo", valor))
             .add( Restrictions.eq("estado", 0));
        return crit.list();
    }  
    
    
    public Object listarClaseCodigoUnique(Class clase, int valor){
        Criteria crit = getSession().createCriteria(clase)
            .add( Restrictions.eq("codigo", valor))
            .add( Restrictions.eq("estado", 0));
        return crit.uniqueResult();
    }
    
     public void eliminarRubro(Long ID){

        Session s = HibernateUtil.getSession();
        Transaction tx = s.beginTransaction();
        
        
        Rubro rubro = (Rubro) s.createCriteria(Rubro.class)
                .add(Restrictions.eq("id",ID)).uniqueResult();
        
        s.delete(rubro);
        tx.commit();
    }
    public void eliminarCategoria(Long ID){

        Session s = HibernateUtil.getSession();
        Transaction tx = s.beginTransaction();
        
        
        Categoria categoria = (Categoria) s.createCriteria(Categoria.class)
                .add(Restrictions.eq("id",ID)).uniqueResult();
        
        s.delete(categoria);
        tx.commit();
    }
   /*
    public static boolean Login(String username, String password){
        Session sesion = (Session) HibernateUtil.getSessionFactory();
        
        Usuario usuario = (Usuario) sesion.createCriteria(Usuario.class)
                .add(Restrictions.eq("username",username)).uniqueResult();
        
        try{
            if(usuario!=null){
            
                if(usuario.getPassword().equals(password)){
                    JOptionPane.showMessageDialog(null,"Bienvenido usuario"+usuario.getNombre());
                    return true;
                }
            }
             
            else{
                JOptionPane.showMessageDialog(null,"El usuario"+usuario.getNombre()
                        +" no existe","",JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }catch(Exception e){
            System.out.println(e);
            return false;
        }
        return false;
        
        
    }
*/

    public List<Categoria> CategoriaShow() {
        Session sesion = HibernateUtil.getSession();
           List<Categoria> categoria = session.createCriteria(Categoria.class).list();
           return categoria;
    }

    public void llenaJComboBoxUsuario(JComboBox jComboBoxRubro) {
        
        // Video de donde saque https://www.youtube.com/watch?v=qCmMzU4HQt4
        Session sesion = null;
        try {

            sesion = HibernateUtil.getSessionFactory().openSession();

            Criteria crit = sesion.createCriteria(Rubro.class);
            List<Rubro> resulset = crit.list();
            
            jComboBoxRubro.removeAllItems();

            for (Rubro rubro : resulset) {
                //jComboBox1.addItem("" + usuario.getNombre() + " - " + usuario.getApellido());
                jComboBoxRubro.addItem(rubro.getNombre());

            }

            sesion.close();

            //JOptionPane.showMessageDialog(this, "Factor creado Satisfactoriamente", "Felicitaciones", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            //JOptionPane.showMessageDialog(this, "Error al crear Factor:" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public long buscarObjeto(String nombre) {
                 
        Session sesion = HibernateUtil.getSession();
        
        Rubro rubro = (Rubro) sesion.createCriteria(Rubro.class)
                .add(Restrictions.eq("nombre", nombre)).uniqueResult();
        System.out.println(rubro.getId());
        return rubro.getId();
    }
    
        public Object buscarObjetoPorId(Long id) {
                 
        Session sesion = HibernateUtil.getSession();
        
        Rubro rubro = (Rubro) sesion.createCriteria(Rubro.class)
                .add(Restrictions.eq("id", id)).uniqueResult();
        System.out.println(rubro.getId());
        return rubro;
    }
    
}



 
 
