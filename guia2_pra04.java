package ejercicios;
import java.util.Scanner;
/*Consigna
Dada una cantidad de grados centígrados se debe mostrar su equivalente
en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
public class guia2_pra04 {
    public static void main(String[] args) {
    
       Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la temperatura en centígrados:");
        double centigrado = leer.nextDouble();
        double fahrenheit = 32 + (9 * centigrado /5 );
        
        System.out.println("La temperatura ingresada convertida es " + fahrenheit + " Fahrenheit");
    }

}
