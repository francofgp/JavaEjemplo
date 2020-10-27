package ModelosPA;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

public class DetallePedido {
    
    @Id @GeneratedValue(strategy=javax.persistence.GenerationType.AUTO)
    private long id;
       
    @Column(columnDefinition = "TEXT")
    private String cantidad;     
    
    @Column(columnDefinition = "TEXT")
    private String total;
    
    @OneToOne (targetEntity = Producto.class, cascade= CascadeType.ALL,fetch=FetchType.LAZY)
    private Producto producto;

    public long getId() {
        return id;
    }

    public String getCantidad() {
        return cantidad;
    }

    public String getTotal() {
        return total;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}