package ejercicios;
import java.util.Scanner;
/*Consigna
Ejercicio 4
Define una variable que aloje tu nombre y otra que guarde tu edad. Imprime ambas
variables por pantalla.
Recomendamos que hagan el siguiente experimento: tipear en minúsculas la palabra
sout y apenas terminamos de escribirla tocar el botón tab o mejor dicho tabular.
Esto nos va a generar un System.out.println() para poder escribir lo que queramos.

 */
public class guia2_ej04 {
    public static void main(String[] args) {
    
       Scanner leer = new Scanner(System.in);
        System.out.println("Cual es tu nombre");
        String nombre = leer.next();
        System.out.println("Cual es tu edad");
        int edad = leer.nextInt();
        
        System.out.println("El nombre ingresado es " + nombre + " y la edad ingresada es " + edad);

    }

}
