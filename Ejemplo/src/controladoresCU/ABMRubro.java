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

//    public void guardar(String nombre, String descripcion) {
//        Rubro rubro = new Rubro(nombre, descripcion);
//        this.getOper().guardarUsuario(rubro);
//    }
    public void modificar(String nombre, String descripcion, Long ID) {
        this.getOper().modificarUsuario(nombre, descripcion, ID);
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
        this.getOper().guardarObjeto(this.getModel());
    }

    public Rubro getModel() {
        return model;
    }

    public boolean corroborar(String nombre) {
        return this.getOper().corroborarRubro(nombre);
    }

    public void eliminar(Long ID) {
        this.getOper().eliminarRubro(ID);
    }

    public void darDeBaja(Long ID) {
        this.getOper().darDeBajaRubro(ID);
    }

    public void crearModificar() {

        String nombre = form.getTxtNombre().getText();

        if (form.getModificado() == "1") {
            if (form.getNombrePrimero().equals(nombre)) {
                
                /////No hace nada///////
                
                form.setNombre(form.getTxtNombre().getText());
                form.setDescripcion(form.getTxtDescripcion().getText());
                modificar(form.getNombre(), form.getDescripcion(), form.getID());
                
                JOptionPane.showMessageDialog(null, "El rubro se modificó con éxito!");
                form.setVisible(false);
                new FrmVentanaAdmin().setVisible(true);
                
                ///////////no hace nada///////////////
                
            } else {
                if (corroborar(nombre) == false) {

                    form.setNombre(form.getTxtNombre().getText());
                    form.setDescripcion(form.getTxtDescripcion().getText());
                    modificar(form.getNombre(), form.getDescripcion(), form.getID());

                    JOptionPane.showMessageDialog(null, "El rubro se modificó con éxito!");
                    form.setVisible(false);
                    new FrmVentanaAdmin().setVisible(true);
                }
            }
        } else {
            System.out.println(nombre);
            if (corroborar(nombre) == false) {
                
                guardar();
                
                JOptionPane.showMessageDialog(null, "El rubro se registró con éxito!");
                form.setVisible(false);
                new FrmVentanaAdmin().setVisible(true);
            }
        }
    }
}
