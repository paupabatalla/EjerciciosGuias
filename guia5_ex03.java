package ejercicios;

import java.util.Scanner;
/*Consigna:
Crear una función rellene un vector con números aleatorios, 
pasándole un arreglo por parámetro. Después haremos otra función
o procedimiento que imprima el vector.
 */
public class guia5_ex03 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la dimensión del vector");
        int n = leer.nextInt();
        int[] retorno = new int[n];

        retorno = llenarVector(n);
        mostrarVector(retorno, n);
    }

    public static int[] llenarVector(int n) {
        int[] llenar = new int[n];

        for (int i = 0; i < n; ++i) {
            llenar[i] = (int) (Math.random() * 100);
        }
        return llenar;
    }

    public static void mostrarVector(int[] retorno, int n) {
        
        System.out.println("VECTOR");
        for (int i = 0; i < n; ++i) {
            System.out.print("   " + retorno[i]);
        }
    }

}
