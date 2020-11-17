package controladoresCU;
import Hibernate.GestorHibernate;

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

    public void conseguirIDCategoriaSeleccionado() {
        if (this.getForm().getEstadoCategoria()>=2){
        String s = String.valueOf(this.getForm().getjComboBoxCategoria().getSelectedItem());
        
        this.getForm().setIdCategoriaSeleccionado(this.getOper().buscarCategoria(s));
        

        }else{
            this.getForm().setEstadoCategoria(this.getForm().getEstadoCategoria() +1);
        }       
    }

    public void guardar3() {
        try{
        this.guardar(this.getForm().getTxtNombre().getText(),this.getForm().getTxtDescripcion().getText(),
        Long.parseLong(this.getForm().getTxtPrecio().getText()),
        (Categoria) this.buscarCategoriaPorId(this.getForm().getIdCategoriaSeleccionado()),
        this.getComercio()); 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al crear el producto " + e.getMessage(), " Error ", JOptionPane.ERROR_MESSAGE);
        }   
    }

    public void guardar(String nombre, String descripcion, long precio, Categoria categoria, Comercio comercio) {
        Producto producto = new Producto(nombre, descripcion, precio, categoria, comercio);
         try {
            this.getOper().guardarUsuario(producto);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al crear el producto " + e.getMessage(), " Error ", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    public void llenaJComboBoxCategoria(JComboBox<String> jComboBoxCategoria) {
        this.getOper().llenaJComboBoxCategoria(jComboBoxCategoria);        
    }
           
    public Object buscarCategoriaPorId(Long id) {
        return oper.buscarCategoriaPorId(id);
    }
}



    

