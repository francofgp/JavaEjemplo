package ModelosPA;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import ModelosPA.Admin;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "usuario")
public class Usuario extends Admin implements Serializable {

    public Usuario(String password, String nombre, String apellido, String email, String direccion, String telefono, Date fechaNac) {
        super(password, nombre);
        //this.password = password;
        //this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaNac = fechaNac;
    }

    public Usuario() {

    }

    @Column(columnDefinition = "TEXT")
    private String apellido;

    @Column(columnDefinition = "TEXT")
    private String email;

    @Column(columnDefinition = "TEXT")
    private String direccion;

    @Column(columnDefinition = "TEXT")
    private String telefono;


    private Date fechaNac;

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public Date getFechaNac() {
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

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

}
