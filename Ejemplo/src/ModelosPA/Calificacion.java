package ModelosPA;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="calificacion")
public class Calificacion {
    
    @Id @GeneratedValue(strategy=javax.persistence.GenerationType.AUTO)
    private long id;
       
    @Column(columnDefinition = "TEXT")
    private String numero;       
   
    @Column(columnDefinition = "TEXT")
    private String fecha;
    
    @Column(columnDefinition = "TEXT")
    private String comercio;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public String getFecha() {
        return fecha;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getComercio() {
        return comercio;
    }

    public void setComercio(String comercio) {
        this.comercio = comercio;
    }

    
}