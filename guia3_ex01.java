package ejercicios;
import java.util.Scanner;
/*Consigna
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por 
ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
equivalente: 1 día, 2 horas.
 */
public class guia3_ex01 {
    public static void main(String[] args) {
    
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un tiempo en minutos");
        int min = leer.nextInt();
        
        float hora = min/60;
        float dias = 0;
        
        while (hora > 24) {
            dias = hora/60;
            System.out.println("DIAS = " + dias);
            
            
        }
        
        System.out.println("El equivalente en horas y dias de los minutos ingresados es= " + dias + " días, " + hora + " horas."); 
                
       

    }

}
