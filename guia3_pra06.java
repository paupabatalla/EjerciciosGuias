package ejercicios;
import java.util.Scanner;
/*Consigna
Realizar un programa que pida dos números enteros positivos por teclado y
muestre por pantalla el siguiente menú:El usuario deberá elegir una opción y
el programa deberá mostrar el resultado por pantalla y luego volver al menú.

El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta
que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: 

¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
MENU:
1. SUMAR
2. RESTAR
3. MULTIPLICAR
4. DIVIDIR
5. SALIR
ELIJA UNA OPCION
 */
public class guia3_pra06 {
    public static void main(String[] args) {
    
       Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese el primer número");
        float num = leer.nextInt();
        System.out.println("Ingrese el segundo número");
        float num1 = leer.nextInt();
        int opcion;
        String respuesta = " ";

        do {
            System.out.println("Elija una opcion");
             System.out.println("1. SUMAR");
            System.out.println("2. RESTAR");
            System.out.println("3. MULTIPILICAR");
            System.out.println("4. DIVIDIR");
            System.out.println("5. SALIR");
           
            opcion = leer.nextInt();
  
             switch (opcion) {
            case 1: System.out.println("La suma de los números ingresados es " + (num+num1));
                break;
            case 2: System.out.println("La resta de los números ingresados es " + (num-num1));
                break;
            case 3: System.out.println("La multiplicación entre los números ingresados es " + (num*num1));
                break;
            case 4: System.out.println("La división entre los números ingresados es " + (num/num1));
                break;
            case 5: System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                respuesta = leer.next();
                 break;    
                }  
        } while (!(respuesta.equalsIgnoreCase("S")));
        
           System.out.println("HA DECIDIDO SALIR DEL SISTEMA");
    }
}
