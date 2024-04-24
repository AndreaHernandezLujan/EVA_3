
package eva3_2_arreglos_2;

public class EVA3_2_ARREGLOS_2 {

   
    public static void main(String[] args) {
        //JAVA: 0 primer elemento
        //      N - 1 ultimo elemento
        //N --> TOTAL DE ELEMENTOS ALMACENADOS EN EL ARREGLO
        
        //vamos a crear un arreglo y llenarlo de  valores alaetorios.
        // int datos[], x, y; --> SOLO datos ES UN ARREGLO
        //int[] datos, x, y; --> TODAS LAS VARIABLES SON ARREGLOS
        int datos[] = new int[20];
        
        //asignar valores aleatorios entre 0 y 99 (1 - 100)
        for(int i = 0; i < datos.length; i++){
            datos[i] = (int) (Math.random()* 100); //0 - 99
    }
    //imprimir los elementos de arreglo:
    for(int i = 0; i < datos.length; i++){
        System.out.print("[" + datos [i] + "]");
            
    }
}
}
    


