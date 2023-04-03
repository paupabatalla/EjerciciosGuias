package ejercicios;
import java.util.Scanner;
/*Consigna
Diseño una función que pida el nombre y la edad de N personas e imprima
los datos de las personas ingresadas por teclado e indique si son mayores o 
menores de edad. Después de cada persona, el programa debe preguntarle
al usuario si quiere seguir mostrando personas y frenar cuando el usuario
ingrese la palabra "no".
 */
public class guia4_pra02 {

    
    public static void main(String[] args) {
    
       Scanner leer = new Scanner(System.in);
       String respuesta = "", nombre = "", maymen = "";
       int edad = 0;
    
        do {
            System.out.println("Ingrese un nombre");
            nombre = leer.nextLine();
            System.out.println("");
            System.out.println("Ingrese la edad");
            edad = leer.nextInt();
            
            System.out.println("Es mayor de edad?");
            
          if (edad >= 18) {
                System.out.println("Sí. " + nombre + " es mayor de edad.");
            }else{
                System.out.println("No. " + nombre + " no es mayor de edad.");
            }

            System.out.println("Desea ingresar a otra persona? si o no.");
            respuesta = leer.nextLine();
            
            
            
        } while (!(respuesta.equalsIgnoreCase("no")));
        
    }

}
