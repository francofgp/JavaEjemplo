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
    Categoria categoriaElegida;

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

    public void darDeBajaCategoria() {
        this.getOper().darDeBajaCategoria(this.getCategoriaElegida());
    }

    public Categoria getCategoriaElegida() {
        return categoriaElegida;
    }

    public void setCategoriaElegida(Categoria categoriaElegida) {
        this.categoriaElegida = categoriaElegida;
    }
    
    

    public void crearModificar() {

        //oper = getOper();

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
                if (this.corroborar(nombre) == false || this.getCategoriaElegida().getNombre()==nombre) {

                    ////////////////este ////////////////////
                    
                    setearValoresEnTxtForm();
                    modificar();
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
    public void eliminar() {
        this.getOper().eliminarObjeto(this.getCategoriaElegida());
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

    private void setearValoresEnTxtForm() {
        form.setNombre(form.getTxtNombre().getText());
        form.setDescripcion(form.getTxtDescripcion().getText());
    }
    
    public void modificar() {
        //this.getOper().modificarUsuario(nombre, descripcion, ID);
        this.getCategoriaElegida().setDescripcion(form.getDescripcion());
        this.getCategoriaElegida().setNombre(form.getNombre());
        
        
        this.getOper().actualizarObjeto(this.getCategoriaElegida());
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
            JOptionPane.showMessageDialog(null, "Debe ingresar un nombre a su Categoria");
        }else{
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

}
