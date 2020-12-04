package controladoresCU;

import Hibernate.GestorHibernate;
import ModelosPA.Categoria;
import ModelosPA.Comercio;
import ModelosPA.Rubro;
import VistasPA.FrmComercio;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class RegistroComercio {

    private FrmComercio form;
    private GestorHibernate oper;
    private Comercio model;
    private Rubro rubro;
    private Categoria categoria;
    private Date date;
    private InicioSesion inicioSesion;

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

    public RegistroComercio() {
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

    public InicioSesion getInicioSesion() {
        if (inicioSesion == null) {
            synchronized (InicioSesion.class) {
                inicioSesion = new InicioSesion();
            }
        }
        return inicioSesion;
    }

    public void setModel() {

        model = new Comercio();
        model.setNombre(this.getForm().getTxtNombre().getText());
        model.setApellido(this.getForm().getTxtApellido().getText());
        model.setFechaNac(date);
        model.setPassword(this.getForm().getTxtPassword().getText());
        model.setDireccion(this.getForm().getTxtDireccion().getText());
        model.setCorreo(this.getForm().getTxtEmail().getText());
        model.setTelefono(this.getForm().getTxtTelefono().getText());
        model.setCuil(this.getForm().getTxtCuit().getText());
        model.setDireccionNegocio(this.getForm().getTxtDireccionLocal().getText());
        model.setNombreLocal(this.getForm().getTxtNombreLocal().getText());
        model.setRubro((Rubro) rubro);
        model.setCategoria((Categoria) categoria);

        System.out.println(rubro);
        System.out.println(categoria);

    }

    public void llenaJComboBoxRubro(JComboBox jComboBoxRubro) {

        List<Rubro> resulset = getOper().rubroShow();

        jComboBoxRubro.removeAllItems();

        for (Rubro rubro2 : resulset) {

            if ("Activo".equals(rubro2.getEstado())) {
                jComboBoxRubro.addItem(rubro2);

            }

        }
    }

    public void llenaJComboBoxCategoria(JComboBox jComboBoxCategoria) {

        List<Categoria> resulset = this.getOper().categoriaShow();

        jComboBoxCategoria.removeAllItems();

        for (Categoria categoria1 : resulset) {

            if ("Activo".equals(categoria1.getEstado())) {
                jComboBoxCategoria.addItem(categoria1);

            }

        }

    }

    public Object buscarCategoriaPorId(Long idCategoriaSeleccionado) {
        return getOper().buscarCategoriaPorId(idCategoriaSeleccionado);
    }

    public long buscarObjeto(String s) {
        return oper.buscarObjeto(s);
    }

    public long buscarCategoria(String s) {
        return oper.buscarCategoria(s);
    }

    public void guardar() {
        if (validar()) {
            this.setModel();
            oper.guardarObjeto(this.getModel());
            JOptionPane.showMessageDialog(null, "Tu comercio se registr� con �xito!");
            this.getForm().setVisible(false);
            this.getInicioSesion().abrirse();
        }

    }

    public void conseguirRubroSeleccionado() {
        this.setRubro((Rubro) this.getForm().getjComboBoxRubro().getSelectedItem());
    }

    public void conseguirCategoriaSeleccionado() {
        this.setCategoria((Categoria) this.getForm().getjComboBoxCategoria().getSelectedItem());
    }

    private boolean obtenerFecha() {

        try {
            SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
            date = this.getForm().getDataFecha().getDate();
            System.out.println(date);
            return false;
        } catch (Exception e) {
            return true;
        }

    }

    private boolean validar() {
        String nombs = this.getForm().getTxtNombre().getText();
        String trim = nombs.trim();
        if (trim.length() == 0) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un nombre a su Comercio");
            return false;
        }
        if (this.getOper().corroborarComercio(trim)) {
            JOptionPane.showMessageDialog(null, "Nombre de comercio ya esta en uso");
            return false;
        }
        obtenerFecha();
        if (date==null) {
            JOptionPane.showMessageDialog(null, "Debe ingresar Fecha de Nacimiento");
            return false;
        }
        conseguirCategoriaSeleccionado();
        if (categoria==null) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar la Categoria");
            return false;
        }

        conseguirRubroSeleccionado();
        if (rubro==null) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar el Rubro");
            return false;
        }
        
        if ("".equals(this.getForm().getTxtPassword().getText())) {
            JOptionPane.showMessageDialog(null, "Debe ingresar una Contrase�a");
            return false;
        }
        
        if ("".equals(this.getForm().getTxtNombreLocal().getText())) {
            JOptionPane.showMessageDialog(null, "Debe ingresar nombre a su local");
            return false;
        }

        return true;
    }

    public void abrirse() {
        new FrmComercio().setVisible(true);
    }

}
