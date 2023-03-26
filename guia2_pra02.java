package ejercicios;
import java.util.Scanner;
/*Consigna
Escribir un programa que pida tu nombre, lo guarde en una variable
y lo muestre por pantalla.
 */
public class guia2_pra02 {
    public static void main(String[] args) {
    
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese tu nombre");
        String minombre = leer.nextLine();
        System.out.println("Tu nombre es " + minombre);

    }

}
