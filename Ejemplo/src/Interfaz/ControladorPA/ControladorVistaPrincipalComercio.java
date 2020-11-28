package Interfaz.ControladorPA;

import Hibernate.GestorHibernate;
import ModelosPA.Comercio;
import VistasPA.FrmPrincipalComercio;

public class ControladorVistaPrincipalComercio {

    private GestorHibernate oper;
    private FrmPrincipalComercio form;
    private Comercio comercio;

    public Comercio getComercio() {
        return comercio;
    }

    public void setComercio(Comercio comercio) {
        this.comercio = comercio;
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

    public FrmPrincipalComercio getForm() {
        return form;
    }

    public void setForm(FrmPrincipalComercio form) {
        this.form = form;
    }

    public void abrirse(Comercio comercio) {
        FrmPrincipalComercio frmComercio = new FrmPrincipalComercio();
        this.setForm(frmComercio);
        this.getForm().setVisible(true);
        this.getForm().setControlVista(this);
        setComercio(comercio);
        this.getForm().getTxtID().setText(Long.toString(getComercio().getId()));
        this.getForm().getTxtNombre().setText(getComercio().getNombre());
        this.getForm().getTxtEmail().setText(getComercio().getCorreo());

    }

}
