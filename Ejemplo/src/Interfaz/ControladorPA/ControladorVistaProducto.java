/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz.ControladorPA;

import Hibernate.GestorHibernate;
import ModelosPA.Categoria;
import ModelosPA.Comercio;
import VistasPA.FrmProducto;
import javax.swing.JOptionPane;

/**
 *
 * @author CrapBoy
 */
public class ControladorVistaProducto {
    private GestorHibernate oper;
    private FrmProducto form;
    private Comercio comercio;
    private ControladorProducto controlador;

    public ControladorProducto getControlador() {
        if (controlador == null) {
            synchronized (ControladorProducto.class) {
                controlador = new ControladorProducto();

            }
        }
        return controlador;     
    }

    public void setControlador(ControladorProducto controlador) {
        this.controlador = controlador;
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

    public void guardar() {
        try{
        this.getControlador().guardar(this.getForm().getTxtNombre().getText(),this.getForm().getTxtDescripcion().getText(),
        Long.parseLong(this.getForm().getTxtPrecio().getText()),
        (Categoria) this.getForm().buscarCategoriaPorId(this.getForm().getIdCategoriaSeleccionado()),
        this.getComercio()); 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al crear el producto " + e.getMessage(), " Error ", JOptionPane.ERROR_MESSAGE);
        }
        

    }
    
    
    
}
