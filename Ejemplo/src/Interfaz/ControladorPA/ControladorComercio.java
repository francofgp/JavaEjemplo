/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz.ControladorPA;

import Hibernate.GestorHibernate;
import ModelosPA.Admin;
import ModelosPA.Categoria;
import ModelosPA.Comercio;
import ModelosPA.Rubro;
import javax.swing.JComboBox;

/**
 *
 * @author CrapBoy
 */
public class ControladorComercio {
    GestorHibernate oper;
    public ControladorComercio() {
     oper = new GestorHibernate();

    }
    
    
    
    public  void guardarUsuario(Comercio comercio){
       // oper.guardarUsuario(comercio);
    }
    
    public void llenaJComboBoxUsuario(JComboBox jComboBoxRubro){
        oper.llenaJComboBoxUsuario(jComboBoxRubro);
    }
    
        
    public void llenaJComboBoxCategoria(JComboBox jComboBoxCategoria){
        oper.llenaJComboBoxCategoria(jComboBoxCategoria);
    }

    public  long  buscarObjeto(String s) {
        return oper.buscarObjeto(s);
    }
    
    public  long  buscarCategoria(String s) {
        return oper.buscarCategoria(s);
    }

    public Object buscarObjetoPorId(Long idDeRubroSeleccionado) {
        return oper.buscarObjetoPorId(idDeRubroSeleccionado);
    }

    public Object buscarCategoriaPorId(Long idCategoriaSeleccionado) {
        return oper.buscarCategoriaPorId(idCategoriaSeleccionado);
    }

    void guardar(String nombre, String apellido, String fechaNac, String password, String direccion,
                    String correo, String cuil, String telefono, String nombreLocal, String direccionNegocio,
                    Rubro rubro, Categoria categoria) {
        
        Comercio comercio = new Comercio(nombre,apellido,fechaNac,password,direccion,
                                        correo,cuil,telefono,nombreLocal,direccionNegocio,
                                        rubro,categoria);
        
        oper.guardarUsuario(comercio);

    }


}
