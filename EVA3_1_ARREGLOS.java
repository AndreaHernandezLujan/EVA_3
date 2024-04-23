
package eva3_1_arreglos;


public class EVA3_1_ARREGLOS {

    public static void main(String[] args) {
        // TODO code application logic here
        //LOS ARREGLOS EN JAVA SON OBJETOS.
        //TENEMOS QUE CREARLOS ANTES DE USUARLOS
        //[]--> manejar los indices: arreglo [3]acceso a la posicion
        //declaracion = creacion (new) [tamaño del arreglo]
        int arreglo[] = new int [10]; // un arreglo de 10 enteros
        //a traves de indices:
        //conocer las posiciones de los valores:
        //LA PRIMER POSICION DE UN ARREGLO ES CERO ---> 0
        //ULTIMA POSICION DE UN ARREGLO ES ---> N-1, donde
        //N ES EL TAMAÑO DEL ARREGLO
        arreglo [1] = 100;
        System.out.println("Valor de arreglo[1 =]"+ arreglo [1]);
        System.out.println(arreglo);
        System.out.println(arreglo.length);//length es la cantidad de elementos
    }
    
}
