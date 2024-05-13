
package eva3_17_bisiesto;

import java.util.Scanner;


public class EVA3_17_BISIESTO {

    public static boolean esBisiesto(int año) {  //Este método estático esBisiesto toma un año como argumento y devuelve un valor booleano (true si es bisiesto, false si no lo es).
        if (año % 100 != 0) { // Si el año no es divisible por 100 (no es un año secular)
            if (año % 4 == 0) //entonces si es divisible por 4, es bisiesto; de lo contrario, no lo es.
                return true;
            else
                return false;
        } else if (año % 400 == 0) //Si el año es divisible por 100, es bisiesto solo si también es divisible por 400.
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce el año"); // Aqui se imprime un mensaje solicitando al usuario ingresar el año

        int año = captu.nextInt(); // Se lee el año ingresado por el usuario

        if (esBisiesto(año))                     //Se llama al método esBisiesto con el año ingresado como argumento, y según el valor devuelto (true o false), se imprime un mensaje indicando si el año es bisiesto o no.
            System.out.println("Bisiesto");
        else
            System.out.println("No Bisiesto");
        
        captu.close(); 
    }
}



    

