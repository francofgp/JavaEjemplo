package Interfaz.ControladorPA;

import Hibernate.GestorHibernate;
import ModelosPA.Comercio;
import ModelosPA.Pedido;
import VistasPA.FrmPrincipalComercio;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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
    
    
   public void cargarPedido() {

        
        List<Pedido> pedido = this.getOper().buscarPedidoComercio(this.getComercio());

        if (pedido.size() > 0) {
            Iterator consulta = pedido.iterator();
            while (consulta.hasNext()) {
                DefaultTableModel tabla = (DefaultTableModel) this.getForm().getjTable1().getModel();

                Vector datos = new Vector();
                Pedido fila = (Pedido) consulta.next();

                //datos.add(fila);
                datos.add(fila.getDescripcion());
                datos.add(fila.getTotal());
                datos.add(fila.getId());
                //datos.add(fila.getUsuario().getId());
                datos.add(fila.getComercio().getId());

                tabla.addRow(datos);

                //}
            }
        } else {
            JOptionPane.showMessageDialog(null, "no hay registros de productos");
        }
        
    
    
    }
    
    
    
    
    

}
