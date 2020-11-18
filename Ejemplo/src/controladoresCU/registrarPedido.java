/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoresCU;

import Hibernate.GestorHibernate;
import ModelosPA.Comercio;
import ModelosPA.Pedido;
import ModelosPA.Producto;
import ModelosPA.Usuario;
import java.util.List;

/**
 *
 * @author CrapBoy
 */
public class registrarPedido {
    
     GestorHibernate oper;

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
     
     

    
    public void guardarPedido(Usuario usuario, Comercio comercio, List<Producto> producto, float total, String descripcion){
        
        Pedido pedido= new Pedido(usuario, comercio,producto,total,descripcion);
        this.getOper().guardarObjeto(pedido);
    }
    
}
