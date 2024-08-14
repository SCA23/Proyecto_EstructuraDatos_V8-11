package org.example.poyectofinal_vm;

import javax.swing.JOptionPane;

/**
 *
 * @author josechaves
 */
public class ColaVehiculos {
    private NodoListaSimple frente;
    private NodoListaSimple finalCola;

    public ColaVehiculos() {
        this.frente = null;
        this.finalCola = null;
    }

    public boolean vacia() {
        return frente == null;
    }

    public void agregarVehiculo(Vehiculo v) {
        NodoListaSimple nuevo = new NodoListaSimple();
        nuevo.setDato(v);
        if (vacia()) {
            frente = finalCola = nuevo;
        } else {
            finalCola.setSiguiente(nuevo);
            finalCola = nuevo;
        }
        JOptionPane.showMessageDialog(null, "Se agrego un vehiculo a la cola: " + v.getMarca());
    }

    public Vehiculo atenderVehiculo() {
        if (!vacia()) {
            Vehiculo atendido = frente.getDato();
            frente = frente.getSiguiente();
            JOptionPane.showMessageDialog(null, "Este vehiculo fue atendido: " + atendido.getMarca());
            return atendido;
        } else {
            JOptionPane.showMessageDialog(null, "Ya no hay vehiculos en la cola.");
            return null;
        }
    }
public void mostrarVehiculos() {
    if (vacia()) {
    JOptionPane.showMessageDialog(null,"No hay vehiculos en la cola.");
    return;
    }
}
    public void mostrarCola() {
        if (vacia()) {
            JOptionPane.showMessageDialog(null, "No hay vehículos en la cola.");
            return;
        }

        String s = "Vehículos en la cola:\n\n";
        NodoListaSimple aux = frente;

        while (aux != null) {
            s += "Marca: " + aux.getDato().getMarca() + "|Modelo: " + aux.getDato().getAño() + "\n";
            aux = aux.getSiguiente();
        }

        JOptionPane.showMessageDialog(null, s, "Vehículos en cola.", JOptionPane.INFORMATION_MESSAGE);
    }
}

