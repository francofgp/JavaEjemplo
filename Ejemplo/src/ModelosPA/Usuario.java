/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelosPA;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author CrapBoy
 */
@Entity
@Table (name="usuario") 
public class Usuario {

    public Usuario( String nombre, String apellido) {   
        //this.id = id;
        //creamos el constructor para los datos que le vamos a pasar, pero el ID no porque es autoincremental
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public Usuario(){
        
    }
    
    @Id @GeneratedValue(strategy=javax.persistence.GenerationType.AUTO)
    private long id;
    @SuppressWarnings("FieldNameHidesFieldInSuperclass")
    private String password;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    @Column(columnDefinition = "TEXT")
    private String nombre;       
   
    @Column(columnDefinition = "TEXT")
    private String apellido;  
    
       public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
        
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
