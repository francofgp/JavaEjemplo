package controladoresCU;
import Hibernate.GestorHibernate;
import ModelosPA.Admin;

import ModelosPA.Categoria;
import ModelosPA.Comercio;
import ModelosPA.Producto;
import VistasPA.FrmProducto;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;


public class registrarProducto {
    
    private GestorHibernate oper;
    private FrmProducto form;
    private Comercio comercio;
    private Producto model;
    public Categoria categoria;


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

    public FrmProducto getForm() {
        return form;
    }

    public void setForm(FrmProducto form) {
        this.form = form;
    }

    public Comercio getComercio() {
        return comercio;
    }

    public void setComercio(Comercio comercio) {
        this.comercio = comercio;
    }

    public Producto getModel() {
        return model;
    }
    
    public void conseguirIDCategoriaSeleccionado() {
        if (this.getForm().getEstadoCategoria()>=2){
        String s = String.valueOf(this.getForm().getjComboBoxCategoria().getSelectedItem());
        
        this.getForm().setIdCategoriaSeleccionado(this.getOper().buscarCategoria(s));
        

        }else{
            this.getForm().setEstadoCategoria(this.getForm().getEstadoCategoria() +1);
        }       
    }
    
    public void setModel() {

        model = new Producto();
        model.setNombre(this.getForm().getTxtNombre().getText());
        model.setDescripcion(this.getForm().getTxtNombre().getText());
        model.setPrecio(Float.parseFloat(this.getForm().getTxtPrecio().getText()));
        model.setCategoria((Categoria) this.getForm().buscarCategoriaPorId(this.getForm().getIdCategoriaSeleccionado()));
        model.comercio = comercio;
        this.model = model;
    }

    public void guardar() {
        try {
            this.setModel();
            oper.guardarObjeto(this.getModel());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Parámetros incorrectos" + ex.getMessage(), " Error ", JOptionPane.ERROR_MESSAGE);
        }
    }

    
    public void llenaJComboBoxCategoria(JComboBox<String> jComboBoxCategoria) {
        this.getOper().llenaJComboBoxCategoria(jComboBoxCategoria);        
    }
           
    public Object buscarCategoriaPorId(Long id) {
        return oper.buscarCategoriaPorId(id);
    }
}



    

