package ejercicios;

import java.util.Scanner;

/*Consigna:
Escriba un programa que averigue si dos vectores de N enteros
son iguales (la comparacion debera detenerse en cuanto se detecte 
alguna diferencia en los elementos).
 */
public class guia5_ex02 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la dimension del vector");
        int num = leer.nextInt();

        int[] vector1 = new int[num];
        int[] vector2 = new int[num];

        for (int i = 0; i < (num * 2); i++) {
            System.out.println("Ingrese valores para el vector 1 =");
            vector1[i] = leer.nextInt();
            System.out.println("Ingrese valores para el vector 2 =");
            vector2[i] = leer.nextInt();

            if (vector1[i] != vector2[i]) {
                System.out.println("LOS NUMEROS INGRESADOS NO COINCIDEN");
                return;
            }
        }
    }
}
