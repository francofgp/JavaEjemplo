package ModelosPA;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

public class Pedido {

    public Pedido() {
    }

    public Pedido(Usuario usuario, Comercio comercio, List<Producto> producto, float total, float descripcion) {
        this.usuario = usuario;
        this.comercio = comercio;
        this.producto = producto;
        this.total = total;
        this.descripcion = descripcion;
    }
    
    
   
    @OneToOne (targetEntity = Usuario.class, cascade= CascadeType.ALL,fetch=FetchType.LAZY)
    private Usuario usuario;
    
    @OneToOne (targetEntity = Comercio.class, cascade= CascadeType.ALL,fetch=FetchType.LAZY)
    private Comercio comercio;
    
    @OneToMany(targetEntity = DetallePedido.class, cascade= CascadeType.ALL, fetch=FetchType.LAZY )
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
    private float descripcion;

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


    public float getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(float descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
    
    
}
