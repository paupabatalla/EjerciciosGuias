package ejercicios;
import java.util.Scanner;
/*Consigna:
Realizar un programa que llene una matriz de 4x4 de
valores aleatorios y muestre la transpuesta de la matriz.
La matriz transpuesta de una matriz A se denota por B y se
obtiene cambiando filas x columnas o viceversa.
 */
public class guia5_pra04 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int [][] matriz = new int [3][3];
        int [][] transpuesta = new int [3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = (int) (Math.random() * 10);                
            }       
        }
        
        String aux = "";
        
        System.out.println("MATRIZ ORIGINAL");
        for(int[] fila : matriz ) {
            aux = "";
            for (int elemento: fila) {
                aux += "  " + elemento;
            }
            System.out.println(aux);
        }
        
        System.out.println("MATRIZ TRANSPUESTA");
        
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                transpuesta[j][i] = matriz [i][j];
            }          
        }

        for(int[] fila : transpuesta ) {
            aux = "";
            for (int elemento: fila) {
                aux += "  " + elemento;
            }
            System.out.println(aux);
        }
    }
}
