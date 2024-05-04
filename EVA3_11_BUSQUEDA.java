
package eva3_11_busqueda;

import java.util.Scanner;


public class EVA3_11_BUSQUEDA {

    public static void main(String[] args) {
      
        // CREAR UN ARREGLO (ENTEROS)
        int arreglo[] = new int[10];
        // LLENARLO CON VALORES ALEATORIOS
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 100) + 1;
        }
        // IMPRIMIRLO
        for (int val : arreglo) {
            System.out.println("[" + val + "]");
        }
        // PREGUNTAR AL USUARIO EL VALOR A BUSCAR
        Scanner captu = new Scanner(System.in);
        System.out.print("¿Qué valor quieres buscar? ");
        int valor = captu.nextInt();
        // BUSCAR
        // RECORRER EL ARREGLO (CICLO FOR)
        // COMPARAR VALOR BUSCANDO CONTRA EL VALOR EN EL ARREGLO (IF)
        // DETENERME SI LO ENCUENTRO, SI NO, SEGUIR BUSCANDO
        // REGRESAR EL RESULTADO: PUEDE VARIAR> PUEDE SER LA POSICION
        // O VERDADERO (SI LO ENCUENTRA) O FALSO (NO LO ENCUENTRA)
        int pos = -1; // una posición que no existe
        for (int i = 0; i < arreglo.length; i++) {
            if (valor == arreglo[i]) {
                pos = i; // almaceno la posición donde está el valor
                break;
            }
        }
        if (pos != -1) {
            System.out.println("El valor " + valor + " se encuentra en la posición " + pos + ".");
        } else {
            System.out.println("El valor " + valor + " no se encuentra en el arreglo.");
        }
        captu.close();
    }
}

    
    

