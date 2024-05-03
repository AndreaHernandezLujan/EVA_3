
package eva3_10foreach;

public class EVA3_10ForEach {

    
    public static void main(String[] args) {
        String diasSemana [] = {"Domingo","Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"};
        for (String dia : diasSemana) {
            System.out.println(dia);
            
        }
        int salario[] = {50, 1000, 5687, 12314, 7855, 1000000, 35789};
        for (int cant : salario) {
            System.out.println("$" + cant);
            //----------------------
            //MESES DEL AÑO. IMPRIMIR CON FOR-EACH- "Cada un para cada uno"
            
        }
        String meses []= {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Juilo", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        for (String mes : meses) {
            System.out.println("meses" + mes);
            
        }
        }
    }
    


