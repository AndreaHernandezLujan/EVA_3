
package eva3_19_referencias;

/**
 *
 * @author andyl
 */
public class EVA3_19_REFERENCIAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo = new int[5];
        int x = 100;
        System.out.println ("Antes de llamar al metodo. X= " + x);
        //---------------------------------------
        sumarUno (x); // Le estoy enviando una copia de la x
        System.out.println ("Despues de llamar al metodo. x = " + x); // pero no cambia al original
        System.out.println("----------------------------");


        for (int i = 0; i < arreglo.length; i++) {
    System.out.print("["+ arreglo[i] + "]");
   }
       System.out.println("");

        // AL TENER NUMEROS ALEATORIOS
        modificarArreglo(arreglo);
        for (int i = 0; i < arreglo.length; i++) {
             System.out.print("["+ arreglo[i] + "]");
            
        }
}
       public static void sumarUno (int valor) { //MODIFICA LA COPIA
       
        System.out.println("Antes de la operacion. Valor:" + valor);
        valor ++;
        System.out.println("Despues de la operacion. Valor: " + valor);
        }
      public static void modificarArreglo (int[] arreglo) {
          for (int i = 0; i < arreglo.length; i++) {
              arreglo[i] = (int) (Math.random()* 100);
          }
    
    
}
        
}