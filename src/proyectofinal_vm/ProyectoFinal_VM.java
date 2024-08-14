package proyectofinal_vm;

import javax.swing.JOptionPane;

/**
 *
 * @author sc966
 */
public class ProyectoFinal_VM {

    public static void main(String[] args) {
        Seguridad seguridad = new Seguridad();
        if (!seguridad.validarInfo()) {
            System.exit(0);
        }
        ColaVehiculos colaVehiculos = new ColaVehiculos();
          
    //Carrito de Compras (LISTA CIRCULAR)
        ListaCircular c = new ListaCircular();
        c.insertar(new Producto("Refresco", "Coca-Cola", 1000));
        c.insertar(new Producto("Snack", "Tronaditas", 1200));
        c.insertar(new Producto("Comida", "Sandwich", 1500));
        c.insertar(new Producto("Bebidas", "Cerveza", 1700));

        int op = 1;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite la opción deseada:"
                    + "\n1- Agregar al Carrito"
                    + "\n2- Extraer del Carrito"
                    + "\n3- Mostrar Carrito"
                    + "\n4- Agregar Vehiculo a la cola"
                    + "\n5- Atender Vehiculo"
                    + "\n6- Mostrar Vehiculos en la cola"
                    + "\n0- Volver"
                    + "\n---------------------\n"));
            switch (op) {
                case 1:
                    String categoria = JOptionPane.showInputDialog("Digite la categoria del producto: ");
                    String nombre = JOptionPane.showInputDialog("Digite el nombre del producto: ");
                    int precio = Integer.parseInt(JOptionPane.showInputDialog("Digite el precio del producto: "));
                    Producto p = new Producto(categoria, nombre, precio);
                    c.insertar(p);
                    break;
                case 2:
                    c.extraer();
                    JOptionPane.showMessageDialog(null, c.toString());
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, c.toString());
                    break;
                case 4:
                    Vehiculo v = new Vehiculo();
                    v.setMarca(JOptionPane.showInputDialog("Digite la marca del vehiculo: "));
                    v.setAño(Integer.
                            parseInt(JOptionPane.showInputDialog("Digite el año del vehiculo: ")));
                    colaVehiculos.agregarVehiculo(v);
                    break;
                case 5:
                    colaVehiculos.atenderVehiculo();
                    break;
                case 6:
                    colaVehiculos.mostrarCola();
                    break;
                case 0:
                    System.exit(0);
            }
        } while (op != 0);
    }
}
    
    

