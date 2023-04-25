package ejercicios;

import java.util.Scanner;

/*Consigna:
Realice un programa que compruebe si una matriz es
antisimetrica, es decir, cuando una matriz es igual a
su transpuesta pero cambiando de signo. Es decir, A = -AT
 */
public class guia5_pra05 {

    public static boolean anti(int[][] matriz, int[][] transpuesta, int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {

                if (transpuesta[i][j] != -matriz[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la dimension de la matriz");
        int num = leer.nextInt();
        int[][] matriz = new int[num][num];
        int[][] transpuesta = new int[num][num];

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                matriz[i][j] = (int) (Math.random() * 10);

                if (i == j) {
                    matriz[i][j] = 0;
                }

            }
        }

        String aux = "";

        System.out.println("MATRIZ ORIGINAL");
        for (int[] fila : matriz) {
            aux = "";
            for (int elemento : fila) {
                aux += "  " + elemento;
            }
            System.out.println(aux);
        }

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                transpuesta[i][j] = matriz[j][i];
            }
        }

        System.out.println("MATRIZ TRANSPUESTA");
        for (int[] fila : transpuesta) {
            aux = "";
            for (int elemento : fila) {
                aux += "  " + elemento;
            }
            System.out.println(aux);
        }

        boolean retorno = anti(matriz, transpuesta, num);

        if (retorno) {
            System.out.println("LA MATRIZ ES ANTISIMETRICA");
        } else {
            System.out.println("LA MATRIZ NO ES ANTIMETRICA");
        }

    }

}
