package proyectofinal_vm;

/**
 *
 * @author josechaves
 */
public class Reportes {
    public void reporte(Vehiculo vehiculo) {
        if (vehiculo != null) {
            System.out.println("Marca: " + vehiculo.getMarca() + " | Año: " + vehiculo.getAño());
            reporte(vehiculo.getSiguiente()); // Recursión
        } else {
            System.out.println("Final del reporte.");
        }
    }

    public void reporteCompleto(NodoListaSimple nodo) {
        if (nodo != null) {
            System.out.println("Vehiculo: " + nodo.getDato().getMarca() + " | Año: " + nodo.getDato().getAño());
            reporteCompleto(nodo.getSiguiente());
        }
    }
}
