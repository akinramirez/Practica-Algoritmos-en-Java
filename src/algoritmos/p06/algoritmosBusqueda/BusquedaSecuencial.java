/*
    Búsqueda Secuencial:
 */
package algoritmos.p06.algoritmosBusqueda;

import javax.swing.JOptionPane;

public class BusquedaSecuencial {

  public static void main(String[] args) {
    int arreglo[] = {3, 2, 1, 5, 4, 6};
    int dato;
    boolean band = false;

    dato = Integer.parseInt(JOptionPane.showInputDialog("Digite el número a buscar: "));

    //Algoritmo de la búsqueda Secuencial
    int i = 0;
    while (i < 6 && band == false) {
      if (arreglo[i] == dato) {
        band = true;
      }
      i++;
    }

    if (band == false) {
      JOptionPane.showMessageDialog(null, "El numero no ha sido encontrado");
    } else {
      JOptionPane.showMessageDialog(null, "El numero ha sido encontrado en la posición " + (i - 1));
    }

  }

}
