package ModeloDAO; //Indica que la clase petenece al paquete "ModeloDAO"

import GestorBD.Conexion;
import Modelo.Automovil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**                                         //METODOS (EVALUACION 3)
 *
 * @author andyl
 */
public class AutomovilDAO { //Define la clase AutomovilDAO

    Conexion cn = new Conexion();//Instancia para la conexion a la base de datos
    Connection con; //Objeto de la clase "connection" que representa la conexion a la base de datos
    PreparedStatement ps;  //Ejecutar consultas SQL
    ResultSet rs; //Almacena los resultados de una consulta SQL
    
    
   
    public List listarAutomovil() {                      //METODO LISTAR AUTOMOVIL, duvuelve una lista de objetos "Automovil"
        //(ARREGLOS EVALUACION 3)
        List<Automovil> automoviles = new ArrayList();//ARREGLO DINAMICO (crea una lista dinamica para almacenar los objetos) puede crecer segun sea necesario
        String sql = "select * from automovil"; //esta es la sentencia SQL  para seleccionar todos los registros de la tabla automovil
        try { //maneja excepciones
            con = cn.getConnection(); //Instancia de la clase conexion del paquete GestorBd (obtiene la conexion ala base de datos 
            ps = con.prepareStatement(sql); //prepara la consulta sql para su ejecucion
            rs = ps.executeQuery(); //ejecuta la consulta y almacena el resultado en "resultset"
            while (rs.next()) {//El while recorre cada registro del resultset
                Automovil a = new Automovil(); //Aqui creamos el objeto automovil y esta vacio (WHILE EVALUACION 2)
                a.setId(rs.getInt(1));
                a.setModelo(rs.getString(2)); //Cada vez que el bucle while (rs.next()) itera, obtiene una nueva fila del ResultSet. Para cada fila, se crea un nuevo objeto Automovil y se llenan sus atributos con los valores correspondientes de las columnas de la fila actual.
                a.setMarca(rs.getString(3)); //asigna valores a los atributos del objeto
                a.setMotor(rs.getString(4));
                a.setColor(rs.getString(5));
                a.setPatente(rs.getString(6));
                a.setCantPuertas(rs.getInt(7));
                automoviles.add(a);
            }
        } catch (Exception e) { //captura las excepciones
            System.out.println("Error: " + e);//imprime un mensaje de error en la consola
        }
        return automoviles;// devuelve la lista "automoviles" de todos los automoviles que contiene todos los objetos "automovil" de la base de datos
    }

    public int guardarAutomovil(Automovil auto) {           //METODO GUARDAR AUTOMOVIL, el parametro auto representa el objeto "automovil" que se guarda en la base de datos
        int i = 0;
        String sql = "insert into automovil(modelo,marca,motor,color,patente,cantpuertas) values(?,?,?,?,?,?)"; //sentencia sql para insertar un nuevo registro en la tabla automovil
        try { //posible excepciones
            con = cn.getConnection();// obtiene la conexion a la base de datos
            ps = con.prepareStatement(sql); //prepara la sentencia sql para su ejecucion

            ps.setString(1, auto.getModelo());//aqui se asingan los valores de los atributos del objeto "automovil" utilizando el ps
            ps.setString(2, auto.getMarca());
            ps.setString(3, auto.getMotor());
            ps.setString(4, auto.getColor());
            ps.setString(5, auto.getPatente());
            ps.setInt(6, auto.getCantPuertas());

            i = ps.executeUpdate();//ejecuta la sentencia sql

        } catch (Exception e) {//captura cualquier excepcion
            System.out.println("Error: " + e.getMessage());
        }
        return i;//devuelve valor de i (1 si la inserccion fue exitosa, 0 si no lo fue)
    }

    public int modificarAutomovil(Automovil auto) {                 //METODO MODIFICAR AUTOMOVIL
        int i = 0; //estoy agregando un entero para verificar si se puedo modificar el registro
        String sql = "update automovil set modelo=?, marca=?, motor=?, color=?, patente=?, cantpuertas=? WHERE idAuto=?";//sentencia sql para modificar un registro de la tabla automovil

        try { //posibles excepciones

            con = cn.getConnection(); //obtiene la conexion a la base de datos
            ps = con.prepareStatement(sql); //prepara la sentencia sql

            ps.setString(1, auto.getModelo()); //ps es para hacer envio de la sentecia SQL
            ps.setString(2, auto.getMarca());
            ps.setString(3, auto.getMotor());
            ps.setString(4, auto.getColor());
            ps.setString(5, auto.getPatente());
            ps.setInt(6, auto.getCantPuertas());
            ps.setInt(7, auto.getId());
            i = ps.executeUpdate();    //Cuando ejecutas el executeUpdate y todo esta ok devuelve un valor entero de 1 y si no lo ejecuta devuelve 0
            
        } catch (Exception e) { //captura posibles excepciones
            System.out.println("Error: " + e.getMessage());
        }
        return i;//devuelve valor de i
    }
 
    public Automovil buscarAutomovil(int id) {                //METODO BUSCAR AUTOMOVIL
        Automovil a = null;// lo inicializo en null
        String sql = "SELECT * FROM automovil WHERE idAuto=" + id;//sentencia sql para buscar registro de la tabla automovil

        try { //posibles excepciones

            con = cn.getConnection();// Devuelve la conexion    
            ps = con.prepareStatement(sql);//es para preparar la sentencia sql para que sea ejecutada
            rs = ps.executeQuery(); //y esta linea lo ejecuta como su nombre lo dice Execute (ejecutar) y al ejecutar va devolver un valor y ese valor se guarda en el RS 
            //(IF EVALUACION 2)
            if (rs.next()) {  //(resultSet es para capturar el resultado de la sentencia SQL //if
                //si lo encontro empieza a setear los valores del automovil
                a = new Automovil();
                a.setId(rs.getInt(1));
                a.setModelo(rs.getString(2));
                a.setMarca(rs.getString(3));
                a.setMotor(rs.getString(4));
                a.setColor(rs.getString(5));
                a.setPatente(rs.getString(6));
                a.setCantPuertas(rs.getInt(7));
            }

        } catch (Exception e) { //captura posibles excepciones
            System.out.println("Error: " + e.getMessage());
        }
        // si lo encontro hace lo que esta dentro del if y si no lo encontro simplemente queda con valor nulo
        return a; //Devuelve la lista "automoviles" de la base de datos

    }

    public void eliminarAutomovil(int id) {
        String sql = "DELETE FROM automovil WHERE idAuto=" + id; //sentecia sql para eliminar un automovil por su id desde la tabla "automovil"

        try { //posibles excepciones

            con = cn.getConnection(); //devuelve la conexion 
            ps = con.prepareStatement(sql); //prepara la sentecia sql
            ps.executeUpdate();//ejecuta la sentecia sql

        } catch (Exception e) { //captura excepciones
            System.out.println("Error: " + e.getMessage());
        }
    }
}



