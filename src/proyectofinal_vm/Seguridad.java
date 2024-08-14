package org.example.poyectofinal_vm;

import javax.swing.JOptionPane;

/**
 *
 * @author josechaves
 */
public class Seguridad {
    private String usuario = "gasolina";
    private String contraseña = "fidelitas";

    public boolean validarInfo() {
        String userInput = JOptionPane.showInputDialog("Ingrese el nombre de usuario:");
        String passInput = JOptionPane.showInputDialog("Ingrese la contraseña:");

        if (userInput.equals(usuario) && passInput.equals(contraseña)) {
            JOptionPane.showMessageDialog(null, "Se valido la informacion");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos.");
            return false;
        }
    }
}