//1. Hacer un programa que calcule e imprima la suma de tres calificaciones.

package algoritmos.p01.operadoresExpresiones;

import java.util.Scanner;

/**
 *
 * @author Akin Ramirez
 */
public class Ejercicio1 {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    float nota1, nota2, nota3, suma;

    System.out.print("Digite 3 calificaciones: ");
    nota1 = entrada.nextFloat(); //Guardamos las 3 calificaciones
    nota2 = entrada.nextFloat();
    nota3 = entrada.nextFloat();

    suma = nota1 + nota2 + nota3; //Sumamos las 3 calificaciones

    System.out.println("\nLa suma es: " + suma);
  }
}
