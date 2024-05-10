
package eva3_15_sumatoria;

import java.util.Scanner;


public class EVA3_15_SUMATORIA {

    
    public static void main(String[] args) {
       //crear un metodo calcularSumatoria
       //Regresar un metodo entero (Por ejemplo si quiero el 5, imprimir el 1+2+3+4+5 = resultado
       Scanner captu = new Scanner (System.in);
       System.out.println ("num: ");
       int num = captu.nextInt();
       
       int suma = calcularSuma (num);
       System.out.println ("El resulatdo es = " + suma);
    }
    public static int calcularSuma (int num) {
        
        //Acumulador
        int suma = 0;
        for (int i = 1; i <= num; i ++) {
            
            suma = suma + i;
        }
        return suma;
    }
}
