package controladoresCU;

import Hibernate.GestorHibernate;
import Hibernate.HibernateUtil;
import ModelosPA.Admin;
import ModelosPA.Categoria;
import VistasPA.FrmCategoria;
import VistasPA.FrmVentanaAdmin;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class ABMCategoria {

    private GestorHibernate oper;
    private FrmCategoria form;
    Categoria model;

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

    public FrmCategoria getForm() {
        return form;
    }

    public void setForm(FrmCategoria form) {
        this.form = form;
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

        }
    }

    public void crearModificar() {

        oper = getOper();

        String nombre = form.getTxtNombre().getText();

        if (form.getModificado() == "1") {
            if (form.getNombrePrimero().equals(nombre)) {
                form.setNombre(form.getTxtNombre().getText());
                form.setDescripcion(form.getTxtDescripcion().getText());
                //this.ID=ID;
                this.modificar(form.getNombre(), form.getDescripcion(), form.getID());
                JOptionPane.showMessageDialog(null, "La categoría se modificó con éxito!");
                form.setVisible(false);
                new FrmVentanaAdmin().setVisible(true);
            } else {
                if (this.corroborar(nombre) == false) {
                    form.setNombre(form.getTxtNombre().getText());
                    form.setDescripcion(form.getTxtDescripcion().getText());
                    //this.ID=ID;
                    this.modificar(form.getNombre(), form.getDescripcion(), form.getID());
                    JOptionPane.showMessageDialog(null, "La categoría se modificó con éxito!");
                    form.setVisible(false);
                    new FrmVentanaAdmin().setVisible(true);
                }

            }
        } else {
            //LO QUE HAGO ACA ES, CREAR UN OBJETO USUARIO Y PASERLE TODOS ESOS DATOS Y LLAMAR A LA FUNCION
            // GUARDAR USUARIO QUE CREE YO,que esta en el gestor del HIBERNATE (controlador), AHORA ESTO ES LA VISTA
            System.out.println(nombre);
            if (this.corroborar(nombre) == false) {
                this.guardar();
                JOptionPane.showMessageDialog(null, "La categoría se registró con éxito!");
                form.setVisible(false);
                new FrmVentanaAdmin().setVisible(true);
            }

        }

    }

    public Categoria getModel() {
        return model;
    }
    
    //////////////////////////////
    
    public void eliminar(Long ID) {
        Session s = HibernateUtil.getSession();
        Transaction tx = s.beginTransaction();

        try {
            Categoria categoria = (Categoria) s.createCriteria(Categoria.class)
                    .add(Restrictions.eq("id", ID)).uniqueResult();

            s.delete(categoria);
            tx.commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar la categoria ya que la tiene seleccionada un comercio" /*+ e.getMessage()*/, " Error ", JOptionPane.ERROR_MESSAGE);
            //getTx().rollback();
        }
    }

   
    public void setModel() {

        model = new Categoria();
        model.setNombre(this.getForm().getTxtNombre().getText());
        model.setDescripcion(this.getForm().getTxtDescripcion().getText());

        this.model = model;
    }

    public void guardar() {
        this.setModel();
        oper.guardarObjeto(this.getModel());
    }
    
    
    public void modificar(String nombre, String descripcion, Long ID) {
        oper.modificarCategoria(nombre, descripcion, ID);
    }

    public boolean corroborar(String nombre) {
        Session sesion = HibernateUtil.getSession();

        Categoria categoria = (Categoria) sesion.createCriteria(Categoria.class)
                .add(Restrictions.eq("nombre", nombre)).uniqueResult();

        try {
            if (categoria != null) {
                String nom = categoria.getNombre();
                if (nom.equals(nombre)) {
                    JOptionPane.showMessageDialog(null, "La categoría " + categoria.getNombre() + " ya existe!", "", JOptionPane.ERROR_MESSAGE);
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

 }
