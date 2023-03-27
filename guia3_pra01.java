package ejercicios;
import java.util.Scanner;
/*Consigna
Crear un programa que dado un número determine si es par o impar.

 */
public class guia3_pra01 {
    public static void main(String[] args) {
    
       Scanner leer = new Scanner(System.in);
        int num = 0;
       
        do {
            System.out.println("Ingrese un número");
            num = leer.nextInt();
            
            if (num%2 == 0) {
                System.out.println("El número ingresado es PAR");
            } else {
                System.out.println("El número ingresado es IMPAR");
            }
            
        } while (num > 0);
        
    }

}
