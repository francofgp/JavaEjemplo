package controladoresCU;

import Hibernate.GestorHibernate;
import ModelosPA.Categoria;
import ModelosPA.Comercio;
import ModelosPA.Rubro;
import VistasPA.FrmComercio;
import java.util.List;
import javax.swing.JComboBox;

public class ABMComercio {

    FrmComercio form;
    GestorHibernate oper;
    Comercio model;
    Rubro rubro;
    Categoria categoria;

    public Rubro getRubro() {
        return rubro;
    }

    public void setRubro(Rubro rubro) {
        this.rubro = rubro;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    

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

    public Comercio getModel() {
        return model;
    }

    public void setModel() {

        model = new Comercio();
        model.setNombre(this.getForm().getTxtNombre().getText());
        model.setApellido(this.getForm().getTxtApellido().getText());
        model.setFechaNac(this.getForm().getTxtFecha().getText());
        model.setPassword(this.getForm().getTxtPassword().getText());
        model.setDireccion(this.getForm().getTxtDireccion().getText());
        model.setCorreo(this.getForm().getTxtEmail().getText());
        model.setTelefono(this.getForm().getTxtTelefono().getText());
        model.setCuil(this.getForm().getTxtCuit().getText());
        model.setDireccionNegocio(this.getForm().getTxtDireccionLocal().getText());
        model.setNombreLocal(this.getForm().getTxtNombreLocal().getText());
        model.setRubro((Rubro) rubro);
        model.setCategoria((Categoria) categoria);

        this.model = model;
    }

    public void llenaJComboBoxRubro(JComboBox jComboBoxRubro) {
        //getOper().llenaJComboBoxRubro(jComboBoxRubro);
        
        List<Rubro> resulset = getOper().rubroShow();

        jComboBoxRubro.removeAllItems();

        for (Rubro rubro : resulset) {
            //jComboBox1.addItem("" + usuario.getNombre() + " - " + usuario.getApellido());
            if ("Activo".equals(rubro.getEstado())) {
                jComboBoxRubro.addItem(rubro);

            }

        }
    }

    //////////////////////////    
    public void llenaJComboBoxCategoria(JComboBox jComboBoxCategoria) {
        //this.getOper().llenaJComboBoxCategoria(jComboBoxCategoria);
        List<Categoria> resulset = this.getOper().CategoriaShow();

        jComboBoxCategoria.removeAllItems();

        for (Categoria categoria : resulset) {
            //jComboBox1.addItem("" + usuario.getNombre() + " - " + usuario.getApellido());
            if ("Activo".equals(categoria.getEstado())) {
                jComboBoxCategoria.addItem(categoria);

            }

        }

    }

    public Object buscarCategoriaPorId(Long idCategoriaSeleccionado) {
        return getOper().buscarCategoriaPorId(idCategoriaSeleccionado);
    }
    /////////////////////////

    public long buscarObjeto(String s) {
        return oper.buscarObjeto(s);
    }

    public long buscarCategoria(String s) {
        return oper.buscarCategoria(s);
    }

    /*public Object buscarObjetoPorId(Long idDeRubroSeleccionado) {
        return oper.buscarObjetoPorId(idDeRubroSeleccionado);
    }
*/
    public void guardar() {
        this.setModel();
        oper.guardarObjeto(this.getModel());
    }

    ////////////////////////////////////////////////////
    public void conseguirRubroSeleccionado() {

        if (this.getForm().getEstado() >= 2) {
            String s = String.valueOf(this.getForm().getjComboBoxRubro().getSelectedItem());
            //this.getForm().setIdDeRubroSeleccionado(this.buscarObjeto(s));
            this.setRubro((Rubro) this.getForm().getjComboBoxRubro().getSelectedItem());
        } else {
            this.getForm().setEstado(this.getForm().getEstado() + 1);
        }
    }

    public void conseguirCategoriaSeleccionado() {
        if (this.getForm().getEstadoCategoria() >= 2) {
            String s = String.valueOf(this.getForm().getjComboBoxCategoria().getSelectedItem());
            //this.getForm().setIdCategoriaSeleccionado(this.buscarCategoria(s));
            this.setCategoria((Categoria) this.getForm().getjComboBoxCategoria().getSelectedItem());
        } else {
            this.getForm().setEstadoCategoria(this.getForm().getEstadoCategoria() + 1);
        }
    }

}
