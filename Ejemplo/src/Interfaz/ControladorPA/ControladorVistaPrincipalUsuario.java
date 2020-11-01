/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz.ControladorPA;

import Hibernate.GestorHibernate;
import ModelosPA.Comercio;
import ModelosPA.Rubro;
import ModelosPA.Usuario;
import VistasPA.FrmPrincipalUsuario;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CrapBoy
 */
public class ControladorVistaPrincipalUsuario {
    private GestorHibernate oper;
    private FrmPrincipalUsuario form;
    private Usuario usuario;

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

    public FrmPrincipalUsuario getForm() {
        return form;
    }

    public void setForm(FrmPrincipalUsuario form) {
        this.form = form;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public void llenaJComboBoxUsuario(JComboBox jComboBoxRubro) {
        getOper().llenaJComboBoxUsuario(jComboBoxRubro);
    }

    public void llenaJComboBoxCategoria(JComboBox jComboBoxCategoria) {
        getOper().llenaJComboBoxCategoria(jComboBoxCategoria);
    }

        public void conseguirIDRubroSeleccionado() {
        if (this.getForm().getEstado()>=2){
        String s = String.valueOf(this.getForm().getjComboBoxRubro().getSelectedItem());
        
        this.getForm().setIdDeRubroSeleccionado(this.getOper().buscarObjeto(s));
        
        //System.out.println(idDeRubroSeleccionado+ "estoy aca");

        }else{
            this.getForm().setEstado(this.getForm().getEstado() +1);
            //estado= estado+1;
        }    
    }

    public void conseguirIDCategoriaSeleccionado() {
        if (this.getForm().getEstadoCategoria()>=2){
        String s = String.valueOf(this.getForm().getjComboBoxCategoria().getSelectedItem());
        
        this.getForm().setIdCategoriaSeleccionado(this.getOper().buscarCategoria(s));
        

        }else{
            this.getForm().setEstadoCategoria(this.getForm().getEstadoCategoria() +1);
        }      
    }
    
        public void LoadComercio() {
        List<Comercio> comercio = this.getOper().BuscarComercioPorCategoriaYRubro();
        if (comercio.size() > 0) {
            Iterator consulta = comercio.iterator();
            while (consulta.hasNext()) {
                DefaultTableModel tabla = (DefaultTableModel) this.getForm().getjTableComercio().getModel();

                Vector datos = new Vector();
                Comercio fila = (Comercio) consulta.next();
                if (fila.getRubro().getId()==this.getForm().getIdDeRubroSeleccionado()  
                        && fila.getCategoria().getId()==this.getForm().getIdCategoriaSeleccionado()) {
                    datos.add(fila.getNombre());
                    datos.add(fila.getId());
                    tabla.addRow(datos);

                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "no hay registros de rubros");
        }
    }

        
    public void ClearTableComercio() {
        while (this.getForm().getjTableComercio().getRowCount() != 0) {
            ((DefaultTableModel) this.getForm().getjTableComercio().getModel()).removeRow(0);
        }
    }

    
}
