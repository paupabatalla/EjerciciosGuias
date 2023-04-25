package ejercicios;

import java.util.Scanner;

/*Consigna:
Crea una aplicación que nos pida un número por teclado y con una
función se lo pasamos por parámetro para que nos indique si es o
no un número primo, debe devolver true si es primo, sino false.

Un número primo es aquel que solo puede dividirse entre 1 y sí
mismo. Por ejemplo: 25 no es primo, ya que 25 es divisible entre
5, sin embargo, 17 si es primo.
 */
public class guia4_pra04 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num = leer.nextInt();
        System.out.println("¿Es primo o no es primo?");
        
        boolean retorno = esPrimo(num);
        if (retorno) {
            System.out.println("ES PRIMO");
        } else {
            System.out.println("NO ES PIRMO");
        }
        
    }

    public static boolean esPrimo(int num) {
        int contador = 0;
        
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                contador++;

                if (contador > 2) {
                    return false;
                }
            }
        }
        return true;
    }

}
