package org.example.poyectofinal_vm;

/**
 *
 * @author sc966
 */
public class Producto {
    
    private String categoria;
    private String nombre;
    private int precio;
    
    public Producto(String categoria, String nombre, int precio) {
        this.categoria = categoria;
        this.nombre = nombre;
        this.precio = precio;
    }
    
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    
}
