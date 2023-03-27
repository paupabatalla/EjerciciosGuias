package ejercicios;

import java.util.Scanner;

/*Consigna
Ejercicio 6
Implementar un programa que le pida dos números enteros al usuario y
determine si ambos o alguno de ellos es mayor a 25.

 */
public class guia3_ej06 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un número");
        int num = leer.nextInt();
        System.out.println("Ingrese otro número");
        int num1 = leer.nextInt();

        if (num > 25 && num1 > 25) {
            System.out.println("Ambos números son mayores que 25");
        } else if (num > 25) {
            System.out.println("El 1º número ingresado es mayor que 25");
        } else if (num1 > 25) {
            System.out.println("El 2º número ingresado es mayor que 25");
        } else {
            System.out.println("Ninguno de los números ingresadoses mayor a 25");
        }
    }

}
