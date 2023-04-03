package ejercicios;

import java.util.Scanner;

/*Consigna
Crea una aplicacion que le pida dos numeros al usuario y este pueda
elegir entre sumar, restar, multiplicar y dividir. La aplicacion 
debe tener una funcion para cada una de las operaciones matematicas y
deben devolver sus resultados para imprimirlos en main.
 */
public class guia4_pra01 {

    public static int sumar(int num, int num1) {
        int suma = num + num1;
        return suma;
    }

    public static int restar(int num, int num1) {
        int resta = num - num1;
        return resta;
    }

    public static int dividir(int num, int num1) {
        float division;
        division = num / num1;
        return (int) division;
    }

    public static int multiplicacion(int num, int num1) {
        int multi;
        multi = num * num1;
        return multi;
    }

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int num = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num1 = leer.nextInt();

        while (true) {
            System.out.println("--- MENÚ ---");
            System.out.println("1- SUMAR");
            System.out.println("2- RESTA");
            System.out.println("3. MULTIPLICACIÓN");
            System.out.println("4- DIVISIÒN");
            System.out.println("------------");

            System.out.println("ELIJA UNA OPERACIÓN");
            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    int retorno = sumar(num, num1);
                    System.out.println("LA SUMA ENTRE AMBOS NÚMEROS ES " + retorno);
                    break;
                case 2:
                    int retorno1 = restar(num, num1);
                    System.out.println("LA RESTA ENTRE AMBOS NÚMEROS ES " + retorno1);
                    break;
                case 3:
                    int retorno2 = multiplicacion(num, num1);
                    System.out.println("LA MULTIPLICACIÓN ENTRE AMBOS NÚMEROS ES " + retorno2);
                    break;
                case 4:
                    int retorno3 = dividir(num, num1);
                    System.out.println("LA DIVISIÓN ENTRE AMBOS NÚMEROS ES " + retorno3);
                    break;

                default:
                    System.out.println("LA OPCIÓN INGRESADA NO ES CORRECTA");
            }
        }

    }

}
