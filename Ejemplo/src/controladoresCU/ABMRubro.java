package controladoresCU;

import Hibernate.GestorHibernate;
import Interfaz.ControladorPA.ControladorVentanaAdminPrincipal;
import ModelosPA.Rubro;
import VistasPA.FrmRubro;
import javax.swing.JOptionPane;

public class ABMRubro {

    private GestorHibernate oper;
    private Rubro model;
    private FrmRubro form;
    private String titulo;
    private ControladorVentanaAdminPrincipal vAdmin;

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

    public ControladorVentanaAdminPrincipal getvAdmin() {
        if (vAdmin == null) {
            synchronized (ControladorVentanaAdminPrincipal.class) {
                vAdmin = new ControladorVentanaAdminPrincipal();
            }
        }
        return vAdmin;
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
            salirse();
        } else {
            guardar();
            JOptionPane.showMessageDialog(null, "El rubro se registró con éxito!");
            salirse();
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

    public void salirse() {
        this.getForm().setVisible(false);
        this.getvAdmin().abrirse();    
    }

}
