package ejercicios;
import java.util.Scanner;
/*Consigna
Escriba un programa que pida una frase o palabra y valide si la primera letra
de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá  
imprimir “INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
 */
public class guia3_pra04 {
    public static void main(String[] args) {
    
       Scanner leer = new Scanner(System.in);
  
        System.out.println("Ingrese una frase que empiece con la letra A");
     
           String frase = leer.nextLine();
           String letra = frase.substring(0,1);
        
        if (letra.equalsIgnoreCase("a")) {
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        } 
     

    }

}
