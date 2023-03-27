package ejercicios;
import java.util.Scanner;
/*Consigna
Escriba un programa en el cual se ingrese un valor límite positivo, y a
continuación solicite números al usuario hasta que la suma de los nuúmeros
introducidos supere el límite inicial.
usar BREAK O CONTINUE
 */
public class guia3_pra05 {
    public static void main(String[] args) {
    
       Scanner leer = new Scanner(System.in);
       
       int suma = 0;
       
        System.out.println("Ingrese el valor limite positivo");
        int limite = leer.nextInt();
        
       do {
           System.out.println("Ingrese otro numero");
           int num = leer.nextInt();
           suma+=num;
           
           if (suma > limite) {
               System.out.println("La suma ha superado al valor limite inicial");
               break;
           }
            
        } while (suma != limite);
        

    }

}
