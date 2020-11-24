package Interfaz.ControladorPA;

import Hibernate.GestorHibernate;
import ModelosPA.Categoria;
import ModelosPA.Rubro;
import VistasPA.FrmVentanaAdmin;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ControladorVentanaAdminPrincipal {

    private GestorHibernate oper;
    private FrmVentanaAdmin form;
    private Rubro rubro;
    private Categoria categoria;
    

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

    public void setOper(GestorHibernate oper) {
        this.oper = oper;
    }

    public FrmVentanaAdmin getForm() {
        return form;
    }

    public void setForm(FrmVentanaAdmin form) {
        this.form = form;
    }

    public void cargarRubro() {
        List<Rubro> rubro = this.getOper().rubroShow();
        if (rubro.size() > 0) {
            Iterator consulta = rubro.iterator();
            while (consulta.hasNext()) {
                DefaultTableModel tabla = (DefaultTableModel) this.getForm().getjTableRubro().getModel();
                Vector datos = new Vector();
                Rubro fila = (Rubro) consulta.next();
                datos.add(fila);
                datos.add(fila.getDescripcion());
                datos.add(fila.getId());
                datos.add(fila.getEstado());
                //datos.add(fila);
                tabla.addRow(datos);
            }
        } else {
            JOptionPane.showMessageDialog(null, "no hay registros de rubros");
        }
    }

    public void cargarCategoria() {
        List<Categoria> categoria = this.getOper().CategoriaShow();
        if (categoria.size() > 0) {
            Iterator consulta = categoria.iterator();
            while (consulta.hasNext()) {
                DefaultTableModel tabla = (DefaultTableModel) this.getForm().getjTableCategoria().getModel();
                Vector datos = new Vector();
                Categoria fila = (Categoria) consulta.next();
                datos.add(fila);
                datos.add(fila.getDescripcion());
                datos.add(fila.getId());
                datos.add(fila.getEstado());
                tabla.addRow(datos);
            }
        } else {
            JOptionPane.showMessageDialog(null, "no hay registros de categorias");
        }
    }

    
    public void conseguirRubro() {
        DefaultTableModel model = (DefaultTableModel) this.getForm().getjTableRubro().getModel();
        int selectedRowIndex = this.getForm().getjTableRubro().getSelectedRow();
        /*
        this.getForm().setID(Long.parseLong(model.getValueAt(selectedRowIndex, 2).toString()));
        this.getForm().setNombre(model.getValueAt(selectedRowIndex, 0).toString());
        this.getForm().setDescripcion(model.getValueAt(selectedRowIndex, 1).toString());
*/
        this.setRubro((Rubro)model.getValueAt(selectedRowIndex, 0));
        //System.out.println(rubro.getDescripcion());
    }

    public void conseguirCategoria() {
        DefaultTableModel model = (DefaultTableModel) this.getForm().getjTableCategoria().getModel();
        int selectedRowIndex = this.getForm().getjTableCategoria().getSelectedRow();
        /*
        this.getForm().setID(Long.parseLong(model.getValueAt(selectedRowIndex, 2).toString()));
        this.getForm().setNombre(model.getValueAt(selectedRowIndex, 0).toString());
        this.getForm().setDescripcion(model.getValueAt(selectedRowIndex, 1).toString());
        */
        this.setCategoria((Categoria)model.getValueAt(selectedRowIndex, 0));
    }

    public void limpiarTablaRubro() {
        while (this.getForm().getjTableRubro().getRowCount() != 0) {
            ((DefaultTableModel) this.getForm().getjTableRubro().getModel()).removeRow(0);
        }
    }

    public void limpiarTablaCategoria() {
        while (this.getForm().getjTableCategoria().getRowCount() != 0) {
            ((DefaultTableModel) this.getForm().getjTableCategoria().getModel()).removeRow(0);
        }
    }

    public void reporteRubro() {
        this.getOper().reporteRubro();
    }

}
