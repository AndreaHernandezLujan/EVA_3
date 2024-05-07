
package eva3_12_metodos;

/**
 *
 * @author andyl
 */
public class EVA3_12_METODOS {

    
    public static void main(String[] args) {
       //Invocar al metodo --> llamada --> call
       mostrarMensaje("Hola mundo cuel!!!"); // esta cadena de texto se va a ala variable mensaje de tipo string
       mostrarMuchosMensajes("hola!!", 5);   // nuestros metodos tienen que ser staticos
    }
    
    //public static ---> para la materia de POO
    //void ---> (Tipo de dato) valor que regresa el metodo
    //void ---> no regresa nada
    // nombre del metodo --> identificador valido
    //                       empezar en minusculas, debe de ser un verbo
    // () <-- parametros del metodo (argumentos) ---> valores que necesita para funcionar
    // la variable args es un areglo de tipo String
    public static void mostrarMensaje (String mensaje){ //encabezado (nombre del metodo)
        //cuerpo del metodo: aqui va nuestro codigo
        System.out.println(mensaje);
    }
    public static void mostrarMuchosMensajes(String mensaje, int veces) {
        for (int i = 0; i < veces; i++) {
          System.out.println(mensaje);   
        }
    
          
          
          
                
            }
}
    

