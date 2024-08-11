package poyectofinal_vm;

/**
 *
 * @author sc966
 */
public class Vehiculo {
    private String marca;
    private int modelo;

    public Vehiculo() {
        this.marca = "";
        this.modelo = 0;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
}
