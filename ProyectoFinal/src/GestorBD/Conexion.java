
package GestorBD; //DEFINE EL PAQUETE

//El código define una clase Conexion dentro del paquete GestorBD que se encarga de manejar la conexión a una base de datos MySQL.

import java.sql.Connection; //Aqui se importan las clases necesarias para la conexion
import java.sql.DriverManager;


public class Conexion { //CLASE CONEXION
    
    Connection con; //Variable de tipo "connection" que almacenara la conexion a la base de datos
    String url = "jdbc:mysql://localhost:3306/concesionaria"; //Incluye el protocolo,el local host, el puerto y el nombre de la base de datos
    String user = "root";  //El nombre de usuario para poder conectarse a la base.
    String pass = "";   //Contraseña
    
    public Connection getConnection(){  //METODO PARA QUE SE REALICE LA CONEXION
        try { //Para posibles excepciones
            //Class.forName("com.mysql.jdbc.Driver");//aqui se carga el controlador MYSQl
            con = DriverManager.getConnection(url, user, pass); //La conexion de alamcena en "con" 
        } catch (Exception e) {  //captura cualquier excepcion que ocurra al momento de la conexion
            System.out.println("Error: " + e.getMessage());
        }
        return con;//devuelve la conexion establecida 
    }
}
 