package ejercicios;
import java.util.Scanner;
/*Consigna
Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se mantienen sin cambios.
a = @
e = #
i = $
o = % 
u = *

Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación correspondiente. Utilice la estructura “según” para la transformación. 
Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.

 */
public class guia4_ej11 {
    public static void main(String[] args) {
    
       Scanner leer = new Scanner(System.in);
       String letra = "";
       String frase = "";
       
            System.out.println("Ingrese un frase");
            frase = leer.nextLine();
        
        int  longitud = frase.length();
        System.out.println("frase = " + frase + " y su longitud es de " + longitud);
       
        String retorno =codi(letra, frase, longitud);
        
        System.out.println("La frase retornada es: " + retorno);
        
    }
    
    public static String codi (String letra, String frase, int longitud) {
        String codif = "";
        
        for (int i = 0; i < longitud; i++) {
            letra = frase.substring(i,i+1);
            letra = frase.toLowerCase();
            
            switch (letra) {
                case "a":
                    letra = "@";
                    break;
                case "e":
                    letra = "#";
                    break;
                case "i":
                    letra = "i";
                    break;
                case "o":
                    letra = "%";
                    break;
                case "u":
                    letra = "*";
                    break;
                default:
                    letra = letra;   
            }
        }
       
        
        
        return codif;
    }

}
