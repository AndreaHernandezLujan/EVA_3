
package eva3_18_temperaturas;

import java.util.Scanner;


public class EVA3_18_TEMPERATURAS {

   
    public static void main(String[] args) { //METODO PRINCIPAL DONDE COMIENZA LA EJECUCION DEL PROGRAMA 
      
        Scanner scanner = new Scanner(System.in); //SE CREA UN OBJETO SCANNER PARA LEER LA ENTRADA DEL USUARIO EN CONSOLA 
        
        System.out.println("Seleccione una opción de conversión:"); //SE IMPRIME EL MENU DE OPCIONES PARA EL USUARIO
        System.out.println("1. Convertir centígrados a Fahrenheit (convertirCaf)");
        System.out.println("2. Convertir centígrados a Kelvin (convertirCaK)");
        System.out.println("3. Convertir Fahrenheit a centígrados (ConvertirFaC)");
        System.out.println("4. Convertir Kelvin a Fahrenheit (ConvertirKaF)");
        System.out.println("5. Convertir Fahrenheit a Kelvin (ConvertirFaK)");
        
        int opcion = scanner.nextInt(); //LEE LA OPCION SELECCIONADA POR EL USUARIO
        
        double temperatura; //Declara una variable temperatura de tipo double que se usará para almacenar la temperatura ingresada por el usuario.
        
        switch (opcion) {   //Usa una estructura de control switch para ejecutar diferentes bloques de código dependiendo de la opción seleccionada por el usuario.
            case 1:
                System.out.println("Ingrese la temperatura en grados centígrados:");
                temperatura = scanner.nextDouble();
                System.out.println("Resultado: " + convertirCaf(temperatura));
                break;
            case 2:
                System.out.println("Ingrese la temperatura en grados centígrados:");
                temperatura = scanner.nextDouble();
                System.out.println("Resultado: " + convertirCaK(temperatura));
                break;
            case 3:
                System.out.println("Ingrese la temperatura en grados Fahrenheit:");
                temperatura = scanner.nextDouble();
                System.out.println("Resultado: " + convertirFaC(temperatura));
                break;
            case 4:
                System.out.println("Ingrese la temperatura en grados Kelvin:");
                temperatura = scanner.nextDouble();
                System.out.println("Resultado: " + convertirKaF(temperatura));
                break;
            case 5:
                System.out.println("Ingrese la temperatura en grados Fahrenheit:");
                temperatura = scanner.nextDouble();
                System.out.println("Resultado: " + convertirFaK(temperatura));
                break;
            default:
                System.out.println("Opción inválida.");
        }
        
        scanner.close();
    }
    
    public static double convertirCaf(double celsius) {
        return (celsius * 9/5) + 32;
    }
    
    public static double convertirCaK(double celsius) {
        return celsius + 273.15;
    }
    
    public static double convertirFaC(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
    
    public static double convertirKaF(double kelvin) {
        return (kelvin - 273.15) * 9/5 + 32;
    }
    
    public static double convertirFaK(double fahrenheit) {
        return (fahrenheit - 32) * 5/9 + 273.15;
    }
}

    
    

