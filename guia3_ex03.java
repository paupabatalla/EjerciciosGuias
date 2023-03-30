package ejercicios;
import java.util.Scanner;
/*Consigna
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata
de una vocal. Caso contrario mostrar un mensaje. Nota: investigar la función
equals() de la clase String.
 */
public class guia3_ex03 {
    public static void main(String[] args) {
    
       Scanner leer = new Scanner(System.in);
       
        System.out.println("Ingrese una letra");
        String vocal = leer.nextLine();
        
        if (vocal.equalsIgnoreCase("a") || vocal.equalsIgnoreCase("e") || vocal.equalsIgnoreCase("i") || vocal.equalsIgnoreCase("o") || vocal.equalsIgnoreCase("u")) {
            System.out.println("La letra ingresada es vocal");
        } else {
            System.out.println("La letra ingresa no es vocal");
        }
        

    }

}
