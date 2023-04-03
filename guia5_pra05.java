package ejercicios;
import java.util.Scanner;
/*Consigna:
Realice un programa que compruebe si una matriz es
antisimetrica, es decir, cuando una matriz es igual a
su transpuesta pero cambiando de signo. Es decir, A = -AT
 */
public class guia5_pra05 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int [][] matriz = new int [3][3];
        int [][] transpuesta = new int [3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = (int) (Math.random() * 10);                
            }       
        }
        
        String aux = "";
        
        System.out.println("MATRIZ ORIGINAL");
        for(int[] fila : matriz ) {
            aux = "";
            for (int elemento: fila) {
                aux += "  " + elemento;
            }
            System.out.println(aux);
        }
        
        System.out.println("MATRIZ ANTISIMETRICA");
        
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                transpuesta[j][i] = -matriz [i][j];
            }          
        }

        for(int[] fila : transpuesta ) {
            aux = "";
            for (int elemento: fila) {
                aux += "  " + elemento;
            }
            System.out.println(aux);
        }
        
        
    }

}
