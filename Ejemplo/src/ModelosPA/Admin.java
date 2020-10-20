package ModelosPA;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="admin") 
public class Admin {
    
    @Id @GeneratedValue(strategy=javax.persistence.GenerationType.AUTO)
    private long id;
    @SuppressWarnings("FieldNameHidesFieldInSuperclass")
    private String password;
    @Column(columnDefinition = "TEXT")
    private String nombre;  

    public Admin(String password, String nombre) {
        this.password = password;
        this.nombre = nombre;
    }
    
    public Admin(){
        
    }

    public long getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    

}
