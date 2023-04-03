package ejercicios;
import java.util.Scanner;
/*Consigna:

 */
public class guia5_ej13_14 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Bienvenido!");
        String [] equipo = new String[6];
        
        for (int i = 0; i < equipo.length; i++) {
            System.out.println("Ingrese el nombre del integrante nº " + (i+1) + " del equipo");
            equipo[i] = leer.nextLine();
        }
    }

}
