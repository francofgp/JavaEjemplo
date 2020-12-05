package controladoresCU;

import Hibernate.GestorHibernate;
import ModelosPA.Rubro;
import VistasPA.FrmRubro;
import VistasPA.FrmVentanaAdmin;
import javax.swing.JOptionPane;

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

    public Rubro getRubroElegido() {
        return model;
    }

    public void setRubroElegido(Rubro rubro) {
        this.model = rubro;
    }

    public void modificar() {

        this.getModel().setDescripcion(form.getTxtDescripcion().getText());
        this.getModel().setNombre(form.getTxtNombre().getText());

        this.getOper().actualizarObjeto(this.getModel());
    }

    public FrmRubro getForm() {
        if (form == null) {
            synchronized (FrmRubro.class) {
                form = new FrmRubro();
            }
        }
        return form;
    }

    public void setForm(FrmRubro form) {
        this.form = form;
    }

    public void setModel() {

        model = new Rubro();
        model.setNombre(this.getForm().getTxtNombre().getText());
        model.setDescripcion(this.getForm().getTxtDescripcion().getText());
        model.setEstado("Activo");

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
        this.getOper().eliminarObjeto(this.getModel());
    }

    public void darDeBaja() {
        this.getOper().darDeBajaRubro(this.getModel());
    }

    public void darDeAlta() {
        this.getOper().darDeAltaRubro(this.getModel());
    }

    public void crearModificar() {
        if ("1".equals(form.getModificado())) {
            modificar();
            JOptionPane.showMessageDialog(null, "El rubro se modificó con éxito!");
            form.setVisible(false);
            new FrmVentanaAdmin().setVisible(true);
        } else {
            guardar();
            JOptionPane.showMessageDialog(null, "El rubro se registró con éxito!");
            form.setVisible(false);
            new FrmVentanaAdmin().setVisible(true);
        }
    }

    public void preguntarEliminar() {
        int preg = JOptionPane.showConfirmDialog(null, "Seguro que desea eliminar este rubro?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (preg == JOptionPane.YES_OPTION) {
            eliminar();
        }
    }

    public void modificarCrear() {
        if (validar()) {
            crearModificar();
        }

    }

    public void setearCampos(String modificado, Rubro rubro) {
        this.getForm().getTxtDescripcion().setText(rubro.getDescripcion());
        this.getForm().getTxtNombre().setText(rubro.getNombre());
        this.getForm().getBtnAceptar().setText("Modificar rubro");
        this.getForm().setModificado(modificado);

        this.getForm().setNombre(rubro.getNombre());
        this.getForm().setDescripcion(rubro.getDescripcion());
        this.getForm().setID(rubro.getId());

        this.getForm().setNombrePrimero(this.getForm().getNombre());
        setRubroElegido(rubro);
    }

    private boolean validar() {
        String nombs = this.getForm().getTxtNombre().getText();
        String trim = nombs.trim();

        if (trim.length() == 0) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un nombre a su rubro");
            return false;
        }

        if ("1".equals(form.getModificado()) && (corroborar(trim) == false || this.getModel().getNombre().equals(trim))) {
            return true;
        } else if (!"1".equals(form.getModificado()) && corroborar(trim) == false) {
            return true;

        } else {
            JOptionPane.showMessageDialog(null, "El rubro ya existe");
            return false;
        }

    }

}
