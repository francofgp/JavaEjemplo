package ModelosPA;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table (name="pedido") 
public class Pedido {

    public Pedido() {
    }

    public Pedido(Usuario usuario, Comercio comercio, List<Producto> producto, float total, String descripcion) {
        this.usuario = usuario;
        this.comercio = comercio;
        this.producto = producto;
        this.total = total;
        this.descripcion = descripcion;
    }
    
    @Id @GeneratedValue(strategy=javax.persistence.GenerationType.AUTO)
    private long id;
   
    @OneToOne (targetEntity = Usuario.class, cascade= CascadeType.ALL,fetch=FetchType.LAZY)
    private Usuario usuario;
    
    @OneToOne (targetEntity = Comercio.class, cascade= CascadeType.ALL,fetch=FetchType.LAZY)
    private Comercio comercio;
    
    //@ManyToMany(targetEntity = DetallePedido.class, cascade= CascadeType.ALL, fetch=FetchType.LAZY )
    
    @ManyToMany
    private List<Producto> producto;
    
    @Column(columnDefinition = "TEXT")
    private float total;
    
    //@Column(columnDefinition = "TEXT")
    //private float subtotal;

    public List<Producto> getProducto() {
        return producto;
    }

    public void setProducto(List<Producto> producto) {
        this.producto = producto;
    }

    
    
    @Column(columnDefinition = "TEXT")
    private String descripcion;

    public Usuario getUsuario() {
        return usuario;
    }

    public Comercio getComercio() {
        return comercio;
    }


    public float getTotal() {
        return total;
    }


    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setComercio(Comercio comercio) {
        this.comercio = comercio;
    }



    public void setTotal(float total) {
        this.total = total;
    }


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
    
    
}
