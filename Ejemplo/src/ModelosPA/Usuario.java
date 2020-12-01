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
import ModelosPA.Admin;
import java.io.Serializable;

/**
 *
 * @author CrapBoy
 */
@Entity
@Table (name="usuario") 
public class Usuario extends Admin implements Serializable{

    //IMPLEMENTAR AL MENOS 1 HERENCIA DE OBJETO
    public Usuario(String password, String nombre, String apellido, String email, String direccion, String telefono, String fechaNac) {
        super(password,nombre);
        //this.password = password;
        //this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaNac = fechaNac;
    }


    
    public Usuario(){
        
    }
    
//    @Id @GeneratedValue(strategy=javax.persistence.GenerationType.AUTO)
//    private long id;
    
    //@SuppressWarnings("FieldNameHidesFieldInSuperclass")
    //private String password;
    
    //@Column(columnDefinition = "TEXT")
    //private String nombre;       
   
    @Column(columnDefinition = "TEXT")
    private String apellido;  
    
    @Column(columnDefinition = "TEXT")
    private String email;
    
    @Column(columnDefinition = "TEXT")
    private String direccion;
    
    @Column(columnDefinition = "TEXT")
    private String telefono;
    
    @Column(columnDefinition = "TEXT")
    private String fechaNac;  
/*
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
*/
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
  
//       public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
    /*    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }*/

    public String getEmail() {
        return email;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }
    
    
}
