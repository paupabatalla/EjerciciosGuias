package ejercicios;
import java.util.Scanner;
/*Consigna
Realizar un programa que solo permita introducir solo frases o palabras de 8
de largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá  
de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario,
se deberá  imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.
 */
public class guia3_pra03 {
    public static void main(String[] args) {
    
       Scanner leer = new Scanner(System.in);
      
        String frase;
        int longitud;
        
        System.out.println("Ingrese una palabra o frase de 8 de longitud");
        do {
        frase = leer.nextLine();
        longitud = frase.length();
        
            if (longitud == 8) {
                System.out.println("CORRECTO");
            } else {
                System.out.println("INCORRECTO. INGRESE UNA NUEVA PALABRA O FRASE");  
            }
        
        } while (longitud != 8);
        
        
  
        
        
        
        

    }

}
