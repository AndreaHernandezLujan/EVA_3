/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectofinal;

import Modelo.Automovil;
import ModeloDAO.AutomovilDAO;
import Vista.Principal;
import java.util.ArrayList;
import java.util.List;
                                                           //METODO MAIN (EVALUACION 3) (PRUEBA)
/**
 *
 * @author andyl
 */
public class ProyectoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        AutomovilDAO adao = new AutomovilDAO();
        //Todo ok con el metodo listar todos los autos                                          //Este bloque de código lista todos los automóviles recuperados de la base de datos utilizando el método listarAutomovil() de la clase AutomovilDAO. Luego, imprime los detalles de cada automóvil en la consola, como el ID, modelo, marca, motor, etc.
        /*List<Automovil> lista = adao.listarAutomovil();
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Id: " + lista.get(i).getId());
            System.out.println("Modelo: " + lista.get(i).getModelo());
            System.out.println("Marca: " + lista.get(i).getMarca());
            System.out.println("Motor: " + lista.get(i).getMotor());
            System.out.println("Color: " + lista.get(i).getColor());
            System.out.println("Patente: " + lista.get(i).getPatente());
            System.out.println("Cant Puertas: " + lista.get(i).getCantPuertas());
            System.out.println("------------------------------------------------");
        }*/

        //Todo ok con el metodo buscar                                                   // 
        /*Automovil auto = adao.buscarAutomovil(3); 
        System.out.println("------------------------------------------------");
        System.out.println("Id: " + auto.getId());
        System.out.println("Modelo: " + auto.getModelo());
        System.out.println("Marca: " + auto.getMarca());
        System.out.println("Motor: " + auto.getMotor());
        System.out.println("Color: " + auto.getColor());
        System.out.println("Patente: " + auto.getPatente());
        System.out.println("Cant Puertas: " + auto.getCantPuertas());
        System.out.println("------------------------------------------------");*/
        
        //Todo ok con el metodo actualizar o editar
        /*Automovil auto = new Automovil();
        auto.setId(3);
        auto.setModelo("Lancruiser");
        auto.setMarca("Toyota"); 
        auto.setMotor("8.0");
        auto.setColor("Verde");
        auto.setPatente("AA23GT");
        auto.setCantPuertas(6);
        adao.modificarAutomovil(auto);*/
        
        //Todo ok con el metodo metodo guardar
        /*Automovil auto = new Automovil();
        auto.setModelo("Yaris");
        auto.setMarca("Toyota"); 
        auto.setMotor("6.0");
        auto.setColor("Gris");
        auto.setPatente("YR45WE");
        auto.setCantPuertas(4);
        adao.guardarAutomovil(auto);*/
        
        //Todo ok con el metodo eliminar ojo "ELIMINAR"
       
        Principal Princ = new Principal();
        Princ.setVisible(true);
        Princ.setLocationRelativeTo(null);
    }

}
