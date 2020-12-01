package controladoresCU;

import Hibernate.GestorHibernate;
import Hibernate.HibernateUtil;
import ModelosPA.Admin;
import ModelosPA.Categoria;
import VistasPA.FrmCategoria;
import VistasPA.FrmRubro;
import VistasPA.FrmVentanaAdmin;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class ABMCategoria {

    private GestorHibernate oper;
    private FrmCategoria form;
    Categoria model;
    //Categoria categoriaElegida;

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
        if (form == null) {
            synchronized (FrmCategoria.class) {
                form = new FrmCategoria();
            }
        }
        return form;
    }

    public void setForm(FrmCategoria form) {
        this.form = form;
    }

    public void darDeBajaCategoria() {
        this.getOper().darDeBajaCategoria(this.getModel());
    }

//    public Categoria getCategoriaElegida() {
//        return model;
//    }

    public void setCategoriaElegida(Categoria categoria) {
        this.model = categoria;
    }
    
    

    public void crearModificar() {

        if ("1".equals(form.getModificado())) {
            modificar();
            JOptionPane.showMessageDialog(null, "La categoría se modificó con éxito!");
            form.setVisible(false);
            new FrmVentanaAdmin().setVisible(true);
        } else {
            this.guardar();
            JOptionPane.showMessageDialog(null, "La categoría se registró con éxito!");
            form.setVisible(false);
            new FrmVentanaAdmin().setVisible(true);
        }
    }

    public Categoria getModel() {
        return model;
    }

    //////////////////////////////
    public void eliminar() {
        this.getOper().eliminarObjeto(this.getModel());
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
        this.getOper().guardarObjeto(this.getModel());
    }

    public void modificar(String nombre, String descripcion, Long ID) {
        this.getOper().modificarCategoria(nombre, descripcion, ID);
    }

    public boolean corroborar(String nombre) {
        return this.getOper().corroborarCategoria(nombre);

    }
 /*
    private void setearValoresEnTxtForm() {
        form.setNombre(form.getTxtNombre().getText());
        form.setDescripcion(form.getTxtDescripcion().getText());
    }
    */
    public void modificar() {
        //form.setNombre(form.getTxtNombre().getText());
        //form.setDescripcion(form.getTxtDescripcion().getText());
        this.getModel().setDescripcion(form.getTxtDescripcion().getText());
        this.getModel().setNombre(form.getTxtNombre().getText());
        
        
        this.getOper().actualizarObjeto(this.getModel());
    }

    public void preguntarEliminar() {
        int preg = JOptionPane.showConfirmDialog(null, "Seguro que desea elimar este rubro?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if (preg == JOptionPane.YES_OPTION) {     
            eliminar();
        }
    }

    public void CrearModificar() {
        if (validar()) {
            crearModificar();
        }

    }

    public void setearCampos(String modificado, Categoria categoria) {
        this.getForm().getTxtDescripcion().setText(categoria.getDescripcion());
        this.getForm().getTxtNombre().setText(categoria.getNombre());
        this.getForm().getBtnAceptar().setText("Modificar categoria");
        this.getForm().setModificado(modificado);
           
        this.getForm().setNombre(categoria.getNombre());
        this.getForm().setDescripcion(categoria.getDescripcion());
        this.getForm().setID(categoria.getId());
        
        this.getForm().setNombrePrimero(this.getForm().getNombre());
        setCategoriaElegida(categoria);
        }

    private boolean validar() {
        String nombs = this.getForm().getTxtNombre().getText();
        String trim = nombs.trim();
        if(trim.length()==0){
            JOptionPane.showMessageDialog(null, "Debe ingresar un nombre a su categoria");
           return false;
        }
       
        if ("1".equals(form.getModificado()) && (corroborar(trim) == false || this.getModel().getNombre().equals(trim))){
            return true;
        }else if(!"1".equals(form.getModificado()) && corroborar(trim) == false){
            return true;
        
        }else{
        JOptionPane.showMessageDialog(null, "La categoria ya existe");
         return false;
        }
    }
}
