package ejercicios;
import java.util.Scanner;
/*Consigna
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben
llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de
largo, el primer carácter tiene que ser X y el último tiene que ser una O.

Las secuencias leídas que respeten el formato se consideran correctas, la
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda
secuencia distinta de FDE, que no respete el formato se considera incorrecta.

Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar
cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().
 */
public class guia3_pra07 {
    public static void main(String[] args) {
    
       Scanner leer = new Scanner(System.in);
          String cadena = "";
          int correcta = 0;
          int incorrecta = 0;
          
        do {
            System.out.println("Ingrese una cadena");
            cadena = leer.nextLine();
            
            int longitud = cadena.length();
            String primera = cadena.substring(0,1);
            String ultima = cadena.substring(longitud-1,longitud);
            
            if (longitud == 5 && primera.equalsIgnoreCase("x") && ultima.equalsIgnoreCase("o")) {
           correcta++;
                System.out.println("correcta = " + correcta);
            } else {
                incorrecta++;
                System.out.println("incorrecta = " + incorrecta);   
            }
      
        } while (!(cadena.equalsIgnoreCase("&&&&&")));
        
        System.out.println("La cantidad de cadenas correctas ingresadas es " + correcta);
        System.out.println("La cantidad de cadenas incorrectas ingresadas es " + incorrecta);
        
    }
}
