package poyectofinal_vm;

/**
 *
 * @author sc966
 */
public class NodoListaSimple {
    private Vehiculo dato;
    private NodoListaSimple siguiente;
    
    public NodoListaSimple(){
        this.siguiente=null;
    }

    public Vehiculo getDato() {
        return dato;
    }

    public void setDato(Vehiculo dato) {
        this.dato = dato;
    }

    public NodoListaSimple getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoListaSimple siguiente) {
        this.siguiente = siguiente;
    }
}
