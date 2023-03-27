package ejercicios;

import java.util.Scanner;

/*Consigna
Ejercicio 10
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima
el número ingresado seguido de tantos asteriscos como indique su valor.
Por ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
public class guia3_ej10 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int num;
        
        System.out.println("Ingrese un numero entre 1 y 20");
        //Ingreso 4 numeros
        for (int i = 0; i < 4; i++) {
            num = leer.nextInt();

            //Muestro el numero(esto no es obligatorio)
            System.out.print(num + " ");

            //Asteriscos segun numero ingresado
            for (int j = 0; j < num; j++) {
                String ast = "*";
                System.out.print(ast);
            }
        }

    }
}
