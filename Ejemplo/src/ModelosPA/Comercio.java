package ModelosPA;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table (name="comercio")
public class Comercio {

    public Comercio(String nombre, String apellido, String fechaNac, String password, String direccion,
                    String correo, String cuil, String telefono, String nombreLocal, String direccionNegocio,
                    Rubro rubro, Categoria categoria) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.password = password;
        this.direccion = direccion;
        this.correo = correo;
        this.cuil = cuil;
        this.telefono = telefono;
        this.nombreLocal = nombreLocal;
        this.direccionNegocio = direccionNegocio;
        this.rubro = rubro;
        this.categoria=categoria;
    }

    public Comercio() {
    }
    
    
    
    @Id @GeneratedValue(strategy=javax.persistence.GenerationType.AUTO)
    private long id;
       
    @Column(columnDefinition = "TEXT")
    private String nombre;     
    
    @Column(columnDefinition = "TEXT")
    private String apellido;
    
    @Column(columnDefinition = "TEXT")
    private String fechaNac;
   
    @SuppressWarnings("FieldNameHidesFieldInSuperclass")
    private String password;
    
    @Column(columnDefinition = "TEXT")
    private String direccion;
    
    @Column(columnDefinition = "TEXT")
    private String correo;
    
    @Column(columnDefinition = "TEXT")
    private String cuil;
    
    @Column(columnDefinition = "TEXT")
    private String telefono;
    
    //@Column(columnDefinition = "TEXT")
    //private String imagen;
        
    @Column(columnDefinition = "TEXT")
    private String nombreLocal;
    /*
    @OneToOne (targetEntity = Categoria.class, cascade= CascadeType.ALL,fetch=FetchType.LAZY)
    private Categoria categoria;
    */
    @ManyToOne (targetEntity = Rubro.class, cascade= CascadeType.ALL,fetch=FetchType.LAZY)
    private Rubro rubro;
    
    
    
    @ManyToOne (targetEntity = Categoria.class, cascade= CascadeType.ALL,fetch=FetchType.LAZY)
    private Categoria categoria;
    
    
    @Column(columnDefinition = "TEXT")
    private String direccionNegocio;

    /*
    ////////////////////////////////////
    @OneToMany(targetEntity = Calificacion.class, cascade= CascadeType.ALL, fetch=FetchType.LAZY )
    private Calificacion calificacionIndividual;
    
    @Column(columnDefinition = "TEXT")
    private String calificacion;
    ////////////////////////////////////////
    */
    
    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public String getPassword() {
        return password;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public String getCuil() {
        return cuil;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getNombreLocal() {
        return nombreLocal;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Rubro getRubro() {
        return rubro;
    }
    

    public String getDireccionNegocio() {
        return direccionNegocio;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setCuil(String cuil) {
        this.cuil = cuil;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setNombreLocal(String nombreLocal) {
        this.nombreLocal = nombreLocal;
    }
/*
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
*/
    public void setRubro(Rubro rubro) {
        this.rubro = rubro;
    }

    public void setDireccionNegocio(String direccionNegocio) {
        this.direccionNegocio = direccionNegocio;
    }
    /*
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }


    public String getImagen() {
        return imagen;
    }
    
    */
}
