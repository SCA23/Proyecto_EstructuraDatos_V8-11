package org.example.poyectofinal_vm;

import javax.swing.JOptionPane;

/**
 *
 * @author sc966
 */
public class ListaSimple {
    private NodoListaSimple inicio;

    public ListaSimple() {
        this.inicio = null;
    }

    public boolean vacia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public void agregar() {
        Vehiculo v = new Vehiculo();
        v.setMarca(JOptionPane.showInputDialog("Ingrese la marca del vehículo: "));
        v.setAño(Integer.parseInt(
                JOptionPane.showInputDialog("Digite el modelo: ")));
        NodoListaSimple nuevo = new NodoListaSimple();
        nuevo.setDato(v);

        if (vacia()) {
            inicio = nuevo;

        } else if (v.getAño() < inicio.getDato().getAño()) {

            nuevo.setSiguiente(inicio);
            inicio = nuevo;

        } else if (inicio.getSiguiente() == null) {
            inicio.setSiguiente(nuevo);
        } else {
            NodoListaSimple aux = inicio;
            while ((aux.getSiguiente() != null)
                    && (aux.getSiguiente().getDato().getAño() < v.getAño())) {
                aux = aux.getSiguiente();
            }
            
            nuevo.setSiguiente(aux.getSiguiente());
            
            aux.setSiguiente(nuevo);
        }
    }

    public void extraer() {
        if (!vacia()) {
            System.out.println("Dato extraído: " + inicio.getDato().getMarca());
            inicio = inicio.getSiguiente();
            JOptionPane.showMessageDialog(null, "Dato extraído con éxito!");
        } else {
            JOptionPane.showMessageDialog(null, "Error: imposible extraer",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void mostrar() {
        if (!vacia()) {
            String s = "";
            NodoListaSimple aux = inicio;
            while (aux != null) {
                s += aux.getDato().getMarca() + " / "
                        + aux.getDato().getAño() + " → ";
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "La lista contiene: \n\n" + s,
                    "Lista Llena", JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Error: imposible mostrar",
                    "Lista Vacía", JOptionPane.ERROR_MESSAGE);
        }
    }

}

