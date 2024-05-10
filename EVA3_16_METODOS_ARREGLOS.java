
package eva3_16_metodos_arreglos;

/**
 *
 * @author andyl
 */
public class EVA3_16_METODOS_ARREGLOS {

    
    public static void main(String[] args) { //ARREGLOS
      
        int[] datos = new int [10];
       datos = llenar(datos); //ADQUIERE LOS VALORES DE DATOS
       imprimir(datos);
       
       System.out.println("");
       
       int[] datos2 = new int [15];
       datos2 = llenar(datos2);
       imprimir(datos2); //Imprimir los valores de los areeglos Datos 2
       
    }
    public static void imprimir(int[] arreglo) { //Imprime los arreglos
    
            for (int i = 0; i < arreglo.length; i++) {
                System.out.println("[" + arreglo [i] + "]");
                
            }
            System.out.println("");
            
}
    public static int[] llenar(int[] arreglo){
        
        
            for (int i = 0; i < arreglo.length; i++) {
                arreglo[i] = (int)(Math.random()*100);
                
            }
            return arreglo;
    }
}
