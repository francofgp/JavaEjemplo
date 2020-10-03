/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelosPA;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Chelo
 */

@Entity
@Table (name="producto")
public class Producto {
    
    @Id @GeneratedValue(strategy=javax.persistence.GenerationType.AUTO)
    private long id;
       
    @Column(columnDefinition = "TEXT")
    private String nombre;       
   
    @Column(columnDefinition = "TEXT")
    private String descripcion;
    
    @Column(columnDefinition = "TEXT")
    private float precio;
    
    @OneToOne (targetEntity = Categoria.class, cascade= CascadeType.ALL,fetch=FetchType.LAZY)
    private Categoria categoria;

    @Column(columnDefinition = "TEXT")
    private float imagen;
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public float getImagen() {
        return imagen;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setImagen(float imagen) {
        this.imagen = imagen;
    }
    
    
}
