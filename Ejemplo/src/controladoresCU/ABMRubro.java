package controladoresCU;

import Hibernate.GestorHibernate;
import Hibernate.HibernateUtil;

import ModelosPA.Categoria;
import ModelosPA.Rubro;
import VistasPA.FrmCategoria;
import VistasPA.FrmRubro;
import VistasPA.FrmVentanaAdmin;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class ABMRubro {

    GestorHibernate oper;
    Rubro model;
    FrmRubro form;
    private String titulo;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public GestorHibernate getOper() {
        return oper;
    }

    public void setOper(GestorHibernate oper) {
        this.oper = oper;
    }

    public ABMRubro() {
        oper = new GestorHibernate();

    }

    public void guardar(String nombre, String descripcion) {
        Rubro rubro = new Rubro(nombre, descripcion);
        oper.guardarUsuario(rubro);
    }

    public void modificar(String nombre, String descripcion, Long ID) {
        oper.modificarUsuario(nombre, descripcion, ID);
    }

    public FrmRubro getForm() {
        return form;
    }

    public void setForm(FrmRubro form) {
        this.form = form;
    }

    //implementar al menos 3 try y catch
    public void setModel() {

        model = new Rubro();
        model.setNombre(this.getForm().getTxtNombre().getText());
        model.setDescripcion(this.getForm().getTxtDescripcion().getText());
        model.setEstado("Activo");
        this.model = model;
    }

    public void guardar() {
        this.setModel();
        oper.guardarObjeto(this.getModel());
    }

    public Rubro getModel() {
        return model;
    }

    public boolean corroborar(String nombre) {
        Session sesion = HibernateUtil.getSession();

        Rubro rubro = (Rubro) sesion.createCriteria(Rubro.class)
                .add(Restrictions.eq("nombre", nombre)).uniqueResult();

        try {
            if (rubro != null) {
                String nom = rubro.getNombre();
                if (nom.equals(nombre)) {
                    JOptionPane.showMessageDialog(null, "El rubro " + rubro.getNombre() + " ya existe!", "", JOptionPane.ERROR_MESSAGE);
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }

    }

    public void eliminar(Long ID) {
        Session s = HibernateUtil.getSession();
        Transaction tx = s.beginTransaction();
        try {
            Rubro rubro = (Rubro) s.createCriteria(Rubro.class)
                    .add(Restrictions.eq("id", ID)).uniqueResult();
            s.delete(rubro);
            tx.commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el rubro ya que lo tiene seleccionado un comercio " /*+ e.getMessage()*/, " Error ", JOptionPane.ERROR_MESSAGE);
            //getTx().rollback();

        }
    }

    public void darDeBaja(Long ID) {
        Session s = HibernateUtil.getSession();
        Transaction tx = s.beginTransaction();
        try {
            Rubro rubro = (Rubro) s.createCriteria(Rubro.class)
                    .add(Restrictions.eq("id", ID)).uniqueResult();

            rubro.setEstado("Dado de Baja");
            s.update(rubro);
            tx.commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al dar de baja al rubro ", " Error ", JOptionPane.ERROR_MESSAGE);
            //getTx().rollback();

        }
    }

    public void crearModificar(){
            //aca se puede poner de otra forma, singleton por ejemplo
       


     String nombre = form.getTxtNombre().getText();

        if(form.getModificado()=="1"){
            if(form.getNombrePrimero().equals(nombre)){
                form.setNombre(form.getTxtNombre().getText());
                form.setDescripcion(form.getTxtDescripcion().getText());
                //this.ID=ID;
                modificar(form.getNombre(),form.getDescripcion(),form.getID());
                JOptionPane.showMessageDialog(null,"El rubro se modificó con éxito!");
                form.setVisible(false);
                new FrmVentanaAdmin().setVisible(true);
            }else{
                if(corroborar(nombre)==false){
                form.setNombre(form.getTxtNombre().getText());
                form.setDescripcion(form.getTxtDescripcion().getText());
                //this.ID=ID;
                modificar(form.getNombre(),form.getDescripcion(),form.getID());
                JOptionPane.showMessageDialog(null,"El rubro se modificó con éxito!");
                form.setVisible(false);
                new FrmVentanaAdmin().setVisible(true);
            }

            }}else{
            //LO QUE HAGO ACA ES, CREAR UN OBJETO USUARIO Y PASERLE TODOS ESOS DATOS Y LLAMAR A LA FUNCION
            // GUARDAR USUARIO QUE CREE YO,que esta en el gestor del HIBERNATE (controlador), AHORA ESTO ES LA VISTA
            System.out.println(nombre);
            if(corroborar(nombre)==false){
                //Rubro rubro = new Rubro(this.txtNombre.getText(),this.txtDescripcion.getText());
                guardar();
                JOptionPane.showMessageDialog(null,"El rubro se registró con éxito!");       
                form.setVisible(false);   
                new FrmVentanaAdmin().setVisible(true);
            }

        }
 
        
        }
    
    
    
    
}
