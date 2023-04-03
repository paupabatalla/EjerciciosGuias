package ejercicios;

import java.util.Scanner;

/*Consigna:
Un cuadrado magico es una matriz de 3x3 formada por
numeros del 1 al 9 donde la suma de las filas, columnas
y diagonales son identicas. Crea un programa que permita
introducir un cuadrado por teclado y determine si ese cuadrado
es magico o no. El programa debera comprobar que los numeros
introducidos son correctos, es decir, esten del 1 al 9.
 */
public class guia5_pra06 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        //realizar matriz de numeros aleatorios
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }

        //mostrar matriz
        String aux = "";
        System.out.println("MATRIZ");
        for (int[] fila : matriz) {
            aux = "";
            for (int elemento : fila) {
                aux += "  " + elemento;
            }
            System.out.println(aux);
        }

        //calcular suma de filas, columnas y diagonales
        int[] vectorf = new int[3];
        int[] vectorc = new int[3];
        int[] vectord = new int[2];
        int i,j, suma, suma2;
        boolean logf = false, logc = false, logd = false;

        //Suma de filas 
        for (i = 0; i < 3; i++) {
            suma = 0;
            for (j = 0; j < 3; j++) {
                suma += matriz[i][j];
                vectorf[i] = suma;
            }

            System.out.println("La suma de la fila " + (i + 1) + " es " + vectorf[i]);
            if (i != 0) {
                if (vectorf[i] == vectorf[i - 1] && vectorf[i] == vectorf[0]) {
                    logf = true;
                } 
            }
        }   
        System.out.println(logf);
        
        //suma de columnas
        for (j = 0; j < 3; j++) {
            suma2 = 0;
            for (i = 0; i < 3; i++) {
                suma2 += matriz[i][j];
                vectorc[j] = suma2;
            }

            System.out.println("La suma de la fila " + (j+1) + " es " + vectorc[j]);
            if (j != 0) {
                if (vectorc[j] == vectorc[j - 1] && vectorc[j] == vectorc[0]) {
                    logc = true;
                }
            }
        }   
        System.out.println(logc);
        
        //suma de diagonales
        int diagonal1 = 0;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if (i == j) {
                    diagonal1 += matriz[i][j];
                }  
            }  
        }
        
        System.out.println("La suma de la diagonal principal es " + diagonal1);
        
        int diagonal2 = 0; j = 2;
        for ( i = 0; i < 3; i++) {
            diagonal2 += matriz[i][j]; 
            j = j-1;
        }
        
        System.out.println("La suma de la diagonal invertida es " + diagonal2);
        if (diagonal1 == diagonal2) {
            logd = true;
        }
        
        System.out.println(logd);
    
        if (logf == true && logc == true && logd == true) {
            System.out.println("ES UNA MATRIZ MÁGICA");
        } else{
            System.out.println("NO ES UNA MATRIZ MÁGICA");
        }
    }
}
