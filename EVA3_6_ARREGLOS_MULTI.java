
package eva3_6_arreglos_multi;


public class EVA3_6_ARREGLOS_MULTI {

   
    public static void main(String[] args) {
        int matriz [][] = new int [3][2];
        matriz[0][0] = 100;
        matriz[0][1] = 400;
        matriz[1][0] = 200;
        matriz[1][1] = 500;
        matriz[2][0] = 300;
        matriz[2][1] = 600;
        //-----------------
        System.out.println("matriz.length =" + matriz.length);
        //voy a recorrer la primer dimension
        for (int i = 0; i < matriz.length; i++) { //FILAS
            for (int j = 0; j < matriz[i].length; j++) {//COLUMNAS
               System.out.println("matriz[" + i +"] [" + j + "] =" + matriz [i] [j]);
                
            }
            
        }
    }
    
}
