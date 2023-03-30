package ejercicios;

import java.util.Scanner;

/*Consigna
Realice un programa que calcule y visualice el valor máximo,
el valor mínimo y el promedio de n números (n>0). El valor de
n se solicitará al principio del programa y los números serán
introducidos por el usuario. Realice dos versiones del programa,
una usando el bucle “while” y otra con el bucle “do - while”.

 */
public class guia3_ex07 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de números");
        int num = leer.nextInt();
        int promedio = 0, contador = 0, suma = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        do {
            System.out.println("Ingrese un valor para num:");
            int valor = leer.nextInt();
            contador++;

            if (valor < min) {
                min = valor;
            }
            if (valor > max) {
                max = valor;
            }
           
            suma += valor;
            promedio = suma / num;
           
        } while (contador != num);

        System.out.println("MAXIMO = " + max + "; MINIMO = " + min + "; PROMEDIO = " + promedio);
         
    }
}
