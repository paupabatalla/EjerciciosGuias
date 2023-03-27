package ejercicios;
import java.util.Scanner;
/*Consigna
Ejercicio 8
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0
y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
 */
public class guia3_ej08 {
    public static void main(String[] args) {
    
       Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese su nota");
        int nota = leer.nextInt();
        
        while (nota > 10 || nota < 0) {
            System.out.println("Nota incorrecta. Ingresela nuevamente");
           nota = leer.nextInt();
           
        }
    }

}
