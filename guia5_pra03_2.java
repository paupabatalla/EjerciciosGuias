
package ejercicios;
import java.util.Scanner;
/*Consigna:

*/
public class guia5_pra03_2 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la dimensión del vector");
        int num = leer.nextInt();
        String [] vector = new String[num];
        int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0;
        
        
        for (int i = 0; i < num; i++) {
            System.out.println("Ingrese un valor para vector " + (i+1));
            vector[i] = leer.nextLine();

            int longitud = vector[i].length();
            
            switch (longitud) {
                case 1:
                    cont1++;
                    break;
                    case 2:
                    cont2++;
                    break;
                    case 3:
                    cont3++;
                    break;
                    case 4:
                    cont4++;
                    break;
                    case 5:
                    cont5++;
                    break;
           }  
        }
        System.out.println("Se han encontrado " + cont1 + " de 1 digito");
        System.out.println("Se han encontrado " + cont2 + " de 2 digitos");
        System.out.println("Se han encontrado " + cont3 + " de 3 digitos");
        System.out.println("Se han encontrado " + cont4 + " de 4 digitos");
        System.out.println("Se han encontrado " + cont5 + " de 5 digitos");
        
    }

}
