package ejercicios;
import java.util.Scanner;
/*Consigna
Una obra social tiene tres clases de socios:

Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50%
de descuento en todos los tipos de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35%
de descuento para los mismos tratamientos que los socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos
sobre dichos tratamientos.

Solicite una letra (carácter) que representa la clase de un socio, y
luego un valor real que represente el costo del tratamiento (previo al
descuento) y determine el importe en efectivo a pagar por dicho socio.

 */
public class guia3_ex05 {
    public static void main(String[] args) {
    
       Scanner leer = new Scanner(System.in);
        
        while (true) {
        System.out.println("TIPOS DE SOCIOS:");
        System.out.println("A- SOCIO TIPO A");
        System.out.println("B- SOCIO TIPO B");
        System.out.println("C- SOCIO TIPO C");
        
        System.out.println("Ingrese que clase de socio es:");
        String opc = leer.next();
                
        switch (opc) {
            case "A": System.out.println("Ingrese un valor el costo del tratamiento:");
                 int tratamiento = leer.nextInt();
                 double descuento = tratamiento*0.5;
                 
                 System.out.println("El valor del tratamiento luego del descuento es " + descuento);
                 
                break;
             case "B": System.out.println("Ingrese un valor el costo del tratamiento:");
                 tratamiento = leer.nextInt();
                 descuento = tratamiento - tratamiento*0.35;
                 
                 System.out.println("El valor del tratamiento luego del descuento es " + descuento);
                 
                break;
             case "C": System.out.println("Ingrese un valor el costo del tratamiento:");
                 tratamiento = leer.nextInt();
                 
                 System.out.println("NO RECIBE DESCUENTO. El valor del tratamiento es " + tratamiento);
                
                break;
            default: System.out.println("INGRESE UN TIPO DE SOCIO CORRECTO");
        }
        }

    }

}
