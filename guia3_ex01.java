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
        
        int hora = min/60;
        int dia = hora/24;
        
        if (hora < 24 && dia == 0) {
            System.out.println("El equivalente en horas de los minutos ingresados es= " + hora + " horas");
        } else {
            hora -= 24;
         System.out.println("El equivalente en horas y dias de los minutos ingresados es= " + dia + " días, " + hora + " horas");         
        }
        }

}
