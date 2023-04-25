package ejercicios;

import java.util.Scanner;
/*Consigna: REVISAR
Realice un programa que compruebe si una matriz dada es antisimétrica.
Se dice que una matriz A es antisimétrica cuando ésta es igual a su
propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si
A = -AT. La matriz traspuesta de una matriz A se denota por AT y se
obtiene cambiando sus filas por columnas (o viceversa).
 */
public class guia5_pra05_2 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar el tamaño N de la matriz");
        int N = leer.nextInt();

        int[][] Matriz = new int[N][N];
        System.out.println("MATRIZ");

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                Matriz[i][j] = leer.nextInt();
            }
            System.out.println(" ");
            
        }
        
        String aux = "";
        
        System.out.println("MATRIZ ORIGINAL");
        for(int[] fila : Matriz ) {
            aux = "";
            for (int elemento: fila) {
                aux += "  " + elemento;
            }
            System.out.println(aux);
            
        }

        int[][] MatrizAntiSim = new int[N][N];
        System.out.println("MATRIZ TRANSPUESTA");

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                MatrizAntiSim[j][i] = Matriz[i][j] * (-1);
                System.out.print("  " + MatrizAntiSim[i][j] + "  ");
            }
            System.out.println(" ");
        }

        System.out.println("Comparamos la matriz original A con la opuesta a su transpuesta");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (MatrizAntiSim[i][j] != Matriz[i][j]) {
                    System.out.print("MATRIZ [" + (i + 1) + "] [" + (j + 1) + "] = " + Matriz[i][j] + " ES DISTINTO A TRANSPUESTA [" + (i+1) + "][" + (j+1) + "] = " + MatrizAntiSim[i][j] );
                }

            }
        }

    }

}
