package proyectofinal_vm;

/**
 *
 * @author sc966
 */
public class Vehiculo {
    private String marca;
    private int Año;
    private Vehiculo siguiente;
    public Vehiculo() {
        this.marca = "";
        this.Año = 0;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAño() {
        return Año;
    }

    public void setAño(int año) {
        this.Año = año;
    }


    public Vehiculo getSiguiente() {
        return siguiente;}

    public void setSiguiente(Vehiculo siguiente) {
        this.siguiente = siguiente;
    }
}
