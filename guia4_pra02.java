package ejercicios;

import java.util.Scanner;

/*Consigna
Diseño una función que pida el nombre y la edad de N personas e imprima
los datos de las personas ingresadas por teclado e indique si son mayores o 
menores de edad. Después de cada persona, el programa debe preguntarle
al usuario si quiere seguir mostrando personas y frenar cuando el usuario
ingrese la palabra "no".
 */
public class guia4_pra02 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String respuesta = "";

        do {
            nombreEdad(leer);
            System.out.println("Desea ingresar a otra persona? si o no.");
            respuesta = leer.next();

        } while (!(respuesta.equalsIgnoreCase("no")));

    }

    public static void nombreEdad(Scanner leer) {

        System.out.println("Ingrese un nombre");
        String nombre = leer.next();
        System.out.println("Ingrese la edad");
        int edad = leer.nextInt();
        System.out.println("Es mayor de edad?");
        comprobar(edad);
    }

    public static void comprobar(int edad) {

        if (edad >= 18) {
            System.out.println("Sí, es mayor de edad.");
        } else {
            System.out.println("No, no es mayor de edad.");
        }
    }

}
