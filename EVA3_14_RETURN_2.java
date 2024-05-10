
package eva3_14_return_2;

import java.util.Scanner;


public class EVA3_14_RETURN_2 {

    
    public static void main(String[] args) {
        
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Base: ");
        int base = captu.nextInt();
        System.out.println("Potencia: ");
        int pot = captu.nextInt();
        int resu = calcularPot(base, pot);
        System.out.println("El resultado es = "+resu);
    }
    
    //CREAR UNA FUNCIÓN POTENCIA QUE CALCULE LA POTENCIA DE UN VALOR ENTERO
    public static int calcularPot(int base, int potencia){
        //Necesitamos un acumulador 
        //suma = suma * valor;
        //suma *= valor;
        int resu = 1;
        for (int i = 0; i < potencia; i++) {
            resu = resu * base;
        }
        return resu;
    }
               
}
