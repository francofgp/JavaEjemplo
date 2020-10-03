package ModelosPA;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

public class Pedido {
   
    @OneToOne (targetEntity = Usuario.class, cascade= CascadeType.ALL,fetch=FetchType.LAZY)
    private Usuario usuario;
    
    @OneToOne (targetEntity = Comercio.class, cascade= CascadeType.ALL,fetch=FetchType.LAZY)
    private Comercio comercio;
    
    @OneToMany(targetEntity = DetallePedido.class, cascade= CascadeType.ALL, fetch=FetchType.LAZY )
    private DetallePedido detallePedido;
    
    @Column(columnDefinition = "TEXT")
    private float total;
    
    @Column(columnDefinition = "TEXT")
    private float subtotal;

    
    @Column(columnDefinition = "TEXT")
    private float descripcion;

    public Usuario getUsuario() {
        return usuario;
    }

    public Comercio getComercio() {
        return comercio;
    }

    public DetallePedido getDetallePedido() {
        return detallePedido;
    }

    public float getTotal() {
        return total;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setComercio(Comercio comercio) {
        this.comercio = comercio;
    }

    public void setDetallePedido(DetallePedido detallePedido) {
        this.detallePedido = detallePedido;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public float getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(float descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
    
    
}
