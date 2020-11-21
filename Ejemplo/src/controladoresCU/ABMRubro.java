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
    Rubro rubroElegido;
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

    public Rubro getRubroElegido() {
        return rubroElegido;
    }

    public void setRubroElegido(Rubro rubroElegido) {
        this.rubroElegido = rubroElegido;
    }
    
    

//    public void guardar(String nombre, String descripcion) {
//        Rubro rubro = new Rubro(nombre, descripcion);
//        this.getOper().guardarUsuario(rubro);
//    }
    public void modificar() {
        //this.getOper().modificarUsuario(nombre, descripcion, ID);
        this.getRubroElegido().setDescripcion(form.getDescripcion());
        this.getRubroElegido().setNombre(form.getNombre());
        
        
        this.getOper().actualizarObjeto(this.getRubroElegido());
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

    public void eliminar() {
        this.getOper().eliminarObjeto(this.getRubroElegido());
    }

    public void darDeBaja() {
        this.getOper().darDeBajaRubro(this.getRubroElegido());
    }

    public void crearModificar() {

        String nombre = form.getTxtNombre().getText();

        if (form.getModificado() == "1") {
            if (form.getNombrePrimero().equals(nombre)) {
                
                /////No hace nada///////
                
                form.setNombre(form.getTxtNombre().getText());
                form.setDescripcion(form.getTxtDescripcion().getText());
                modificar();
                
                JOptionPane.showMessageDialog(null, "El rubro se modificó con éxito!");
                form.setVisible(false);
                new FrmVentanaAdmin().setVisible(true);
                
                ///////////no hace nada///////////////
                
            } else {
                if (corroborar(nombre) == false) {
                
                    setearValoresEnTxtForm();
                    modificar();

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

    private void setearValoresEnTxtForm() {
                    form.setNombre(form.getTxtNombre().getText());
                    form.setDescripcion(form.getTxtDescripcion().getText());
    }

    public void preguntarEliminar() {
        int preg = JOptionPane.showConfirmDialog(null, "Seguro que desea elimar este rubro?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if (preg == JOptionPane.YES_OPTION) {     
            eliminar();
        }
    }

    public void comprobarVacioLuegoCrearModificar() {
        String nombs = this.getForm().getTxtNombre().getText();
        String trim = nombs.trim();
        if(trim.length()==0){
            JOptionPane.showMessageDialog(null, "Debe ingresar un nombre a su rubro");
        }else{
            crearModificar();
        }
    }
}
