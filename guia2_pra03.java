package ejercicios;
import java.util.Scanner;
/*Consigna
Escribir un programa que pida una frase y la muestre toda en mayúsculas y 
después toda en minúsculas. 
Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
public class guia2_pra03 {
    public static void main(String[] args) {
    
       Scanner leer = new Scanner(System.in);
       
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        
        String minuscula, mayuscula;
        mayuscula = frase.toUpperCase();
        minuscula = frase.toLowerCase();
        
        System.out.println("La palabra ingresa en mayuscula es " + mayuscula);
        System.out.println("La palabra ingresada en minuscula es " + minuscula);
    }

}
