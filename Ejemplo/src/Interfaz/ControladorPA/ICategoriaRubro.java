/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz.ControladorPA;

/**
 *
 * @author CrapBoy
 */
public interface ICategoriaRubro {
    
    //implementar al menos 1 interfaz
    void guardar(String nombre, String descripcion);
    
     boolean corroborar(String nombre);
     
     void modificar(String nombre, String descripcion, Long ID);
    
}
