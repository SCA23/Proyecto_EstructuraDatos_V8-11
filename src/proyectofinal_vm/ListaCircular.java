package proyectofinal_vm;

import javax.swing.JOptionPane;

/**
 *
 * @author sc966
 */
public class ListaCircular {
    private NodoListaCricular inicio;
    private NodoListaCricular fin;

    public ListaCircular() {
        this.inicio = null;
        this.fin = null;
    }

    public boolean vacia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public void insertar(Producto p) {
        if (vacia()) {
            inicio = new NodoListaCricular(p);
            fin = inicio;
            fin.setSiguiente(inicio);
        } else if (p.getPrecio() < inicio.getDato().getPrecio()) {
            NodoListaCricular aux = new NodoListaCricular(p);
            aux.setSiguiente(inicio);
            inicio = aux;
            fin.setSiguiente(inicio);
        } else if (fin.getDato().getPrecio() <= p.getPrecio()) {
            fin.setSiguiente(new NodoListaCricular(p));
            fin = fin.getSiguiente();
            fin.setSiguiente(inicio);
        } else {
            NodoListaCricular aux = inicio;
            while (aux.getSiguiente().getDato().getPrecio() < p.getPrecio()) {

                aux = aux.getSiguiente();
            }
            NodoListaCricular temp = new NodoListaCricular(p);
            temp.setSiguiente(aux.getSiguiente());
            aux.setSiguiente(temp);
        }
        fin.setSiguiente(inicio);
    }

    public void extraer() {
        if (!vacia()) {
            System.out.println("Extraído: " + inicio.getDato().getNombre());
            inicio = inicio.getSiguiente();
            fin.setSiguiente(inicio);
            JOptionPane.showMessageDialog(null, "Elemento extraído con éxito");
        } else {
            JOptionPane.showMessageDialog(null, "Error:imposible extraer, Lista Vacía");
        }
    }

    public String toString() {
        NodoListaCricular aux = inicio;
        String s = "Lista"
                + "\n-----\n";
        do {
            s += aux.getDato().getPrecio() + ", "
              + aux.getDato().getNombre() + " → "
              + aux.getDato().getCategoria() + " → ";
            aux = aux.getSiguiente();
        } while (aux != inicio);
        return s;
    }
}
