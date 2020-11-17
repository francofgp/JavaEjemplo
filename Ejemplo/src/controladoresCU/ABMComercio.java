package controladoresCU;

import Hibernate.GestorHibernate;
import ModelosPA.Categoria;
import ModelosPA.Comercio;
import ModelosPA.Rubro;
import VistasPA.FrmComercio;
import javax.swing.JComboBox;

public class ABMComercio {
  
    FrmComercio form;
    GestorHibernate oper;
    
    public GestorHibernate getOper() {
        if (oper == null) {
            synchronized (GestorHibernate.class) {
                oper = new GestorHibernate();
            }
        }
        return oper; 
    }
    
    public ABMComercio() {
     oper = new GestorHibernate();

    }
    
    public void setOper(GestorHibernate oper) {
        this.oper = oper;
    }
    
    public FrmComercio getForm() {
        return form;
    }

    public void setForm(FrmComercio form) {
        this.form = form;
    }
    
    
    public void llenaJComboBoxUsuario(JComboBox jComboBoxRubro){
        getOper().llenaJComboBoxUsuario(jComboBoxRubro);
    }
    
    //////////////////////////    
    public void llenaJComboBoxCategoria(JComboBox jComboBoxCategoria){
        this.getOper().llenaJComboBoxCategoria(jComboBoxCategoria);
    }
    
    public Object buscarCategoriaPorId(Long idCategoriaSeleccionado) {
        return getOper().buscarCategoriaPorId(idCategoriaSeleccionado);
    }
    /////////////////////////

    public  long  buscarObjeto(String s) {
        return oper.buscarObjeto(s);
    }
    
    public  long  buscarCategoria(String s) {
        return oper.buscarCategoria(s);
    }

    public Object buscarObjetoPorId(Long idDeRubroSeleccionado) {
        return oper.buscarObjetoPorId(idDeRubroSeleccionado);
    }

    

    public void guardar(String nombre, String apellido, String fechaNac, String password, String direccion,
                    String correo, String cuil, String telefono, String nombreLocal, String direccionNegocio,
                    Rubro rubro, Categoria categoria) {
        
        Comercio comercio = new Comercio(nombre,apellido,fechaNac,password,direccion,
                                        correo,cuil,telefono,nombreLocal,direccionNegocio,
                                        rubro,categoria);
        
        oper.guardarUsuario(comercio);

    }
    
    ////////////////////////////////////////////////////
    
    
    public void guardar3() {
        this.guardar(this.getForm().getTxtNombre().getText(),this.getForm().getTxtApellido().getText(),
                this.getForm().getTxtFecha().getText(),this.getForm().getTxtPassword().getText(),
                this.getForm().getTxtDireccion().getText(),this.getForm().getTxtEmail().getText(),
                this.getForm().getTxtCuit().getText(),this.getForm().getTxtTelefono().getText(),
                this.getForm().getTxtNombreLocal().getText(),this.getForm().getTxtDireccionLocal().getText(),
                (Rubro) this.getForm().buscarObjetoPorId(this.getForm().getIdDeRubroSeleccionado()),
                (Categoria) this.getForm().buscarCategoriaPorId(this.getForm().getIdCategoriaSeleccionado()));
    }
    
    public void conseguirIDRubroSeleccionado() {
        if (this.getForm().getEstado()>=2){
        String s = String.valueOf(this.getForm().getjComboBoxRubro().getSelectedItem());
        
        this.getForm().setIdDeRubroSeleccionado(this.buscarObjeto(s));
        }else{
            this.getForm().setEstado(this.getForm().getEstado() +1);
        }    
    }

    public void conseguirIDCategoriaSeleccionado() {
        if (this.getForm().getEstadoCategoria()>=2){
        String s = String.valueOf(this.getForm().getjComboBoxCategoria().getSelectedItem());
        this.getForm().setIdCategoriaSeleccionado(this.buscarCategoria(s));
        }else{
            this.getForm().setEstadoCategoria(this.getForm().getEstadoCategoria() +1);
        }      
    }
    
}
