
package ejercicios;
import java.util.Scanner;
/*Consigna:
Realizar un programa que llene una matriz de tamaño NxM con
valores aleatorios y muestre la suma de sus elementos.
*/
public class guia5_ex05 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la dimension de la fila y la columna de la matriz");
        int n = leer.nextInt();
        int m = leer.nextInt();
        int [][] matriz = new int[n][m];
        
        llenarMatriz(matriz,n,m);
        int retorno = sumar(matriz,n,m);
        
        System.out.println("La suma de los números de la matriz es " + retorno);
     
    }

    public static void llenarMatriz (int[][] matriz, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
        
        String aux = "";
        System.out.println("MATRIZ");
        for (int[] fila : matriz) {
            aux = "";
            for (int elemento : fila) {
                aux += "  " + elemento;
            }
            System.out.println(aux);
        }
    }
    
    public static int sumar (int[][] matriz, int n, int m) {
        int suma = 0;
         for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                suma += matriz[i][j];
            }
        }
        
        return suma;
    }
} 
