package proyectofinal_vm;

/**
 *
 * @author sc966
 */
public class NodoListaCricular {
    private Producto dato;
    private NodoListaCricular siguiente;

    public NodoListaCricular(Producto dato) {
        this.dato = dato;
    }

    public Producto getDato() {
        return dato;
    }

    public void setDato(Producto dato) {
        this.dato = dato;
    }

    public NodoListaCricular getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoListaCricular siguiente) {
        this.siguiente = siguiente;
    }
}
