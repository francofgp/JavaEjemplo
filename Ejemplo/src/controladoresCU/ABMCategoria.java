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
        this.getOper().darDeBajaCategoria(ID);
    }

    public void crearModificar() {

        oper = getOper();

        String nombre = form.getTxtNombre().getText();

        if (form.getModificado() == "1") {
            if (form.getNombrePrimero().equals(nombre)) {

                /////////no hace nada//////
                
                ////////////////este ////////////////////
                form.setNombre(form.getTxtNombre().getText());
                form.setDescripcion(form.getTxtDescripcion().getText());
                this.modificar(form.getNombre(), form.getDescripcion(), form.getID());
                ///////////////////////////////////////////

                /////////////// o este //////////////////////////////
                //this.modificar(form.getTxtNombre().getText(),form.getTxtDescripcion().getText(),form.getID());
                /////////////////////////////////////////////////////////////////////////////////////
                
                JOptionPane.showMessageDialog(null, "La categoría se modificó con éxito!");
                form.setVisible(false);
                new FrmVentanaAdmin().setVisible(true);
                
                ////////no hace nada//////////                
                
            } else {
                if (this.corroborar(nombre) == false) {

                    ////////////////este ////////////////////
                    form.setNombre(form.getTxtNombre().getText());
                    form.setDescripcion(form.getTxtDescripcion().getText());
                    this.modificar(form.getNombre(), form.getDescripcion(), form.getID());
                    ///////////////////////////////////////////

                    /////////////// o este //////////////////////////////
                    //this.modificar(form.getTxtNombre().getText(),form.getTxtDescripcion().getText(),form.getID());
                    /////////////////////////////////////////////////////////////////////////////////////
                    
                    JOptionPane.showMessageDialog(null, "La categoría se modificó con éxito!");
                    form.setVisible(false);
                    new FrmVentanaAdmin().setVisible(true);
                }

            }
        } else {
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
        this.getOper().eliminarCategoria(ID);
    }

    public void setModel() {

        model = new Categoria();
        model.setNombre(this.getForm().getTxtNombre().getText());
        model.setDescripcion(this.getForm().getTxtDescripcion().getText());
        model.setEstado("Activo");
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
        return this.getOper().corroborarCategoria(nombre);

    }

}
