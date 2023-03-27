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
        int num = leer.nextInt();
        System.out.println("Ingrese el segundo número");
        int num1 = leer.nextInt();
        int opcion;

        do {
            System.out.println("Elija una opcion");
             System.out.println("1. SUMAR");
            System.out.println("2. RESTAR");
            System.out.println("3. MULTIPILICAR");
            System.out.println("4. DIVIDIR");
            System.out.println("5. SALIR");
           
            opcion = leer.nextInt();
            
             switch (opcion) {
            case 1:
                int suma = num + num1;
                System.out.println("La suma de los números ingresados es " + suma);
                break;
            case 2:
                int resta = num + num1;
                System.out.println("La resta de los números ingresados es " + resta);
                break;
            case 3:
                int multi = num * num1;
                System.out.println("La multiplicación entre los números ingresados es " + multi);
                break;
            case 4:
                int divi = num / num1;
                System.out.println("La división entre los números ingresados es " + divi);
                break;
            case 5:
                System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                String respuesta = leer.nextLine();

                if (respuesta.equalsIgnoreCase("N")) {   
                    System.out.println("HA DECIDIDO SALIR DEL SISTEMA");
                    break; 
      
                } 
            }

        } while (opcion>0 && opcion ==5);


    }

}
