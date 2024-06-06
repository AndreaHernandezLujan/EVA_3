 
package Modelo; //PAQUETE AL QUE PERTENECE ESTA CLASE

//La clase Automovil permite crear objetos que representan automóviles con varias propiedades 
public class Automovil { //Aqui creamos una clase llamada Automovil, es publica porque es accesible desde otras clases
    
    private int id;  //ESTOS SON LOS ATRIBUTOS
    private String modelo;  //son del tripo "Private" ya que no pueden ser accedidos directamente desde fuera de la clase
    private String marca; //se acceden atraves de los metodos Getters y Setters
    private String motor; 
    private String color;   //Como color es de tipo String su metodo get devolvera un String su retorno sera un String
    private String patente;
    private int cantPuertas;

    public Automovil() { //Este es un constructor por defecto y se utiliza cuando quieres crear un objeto
    } //automovil sin inicializarlo con valores especificos
    
//Los valores que insertas al constructor como estos, se guardan en los atributos de la clase automovil
//Un constructor es un metodo especial que se llama cuando cuando se crea un objeto clase
    
    public Automovil(int id, String modelo, String marca, String motor, String color, String patente, int cantPuertas) { //ESTOS SON LOS CONSTRUCTORES
        this.id = id;  //Al Id de "este" auto asignale el valor que te acabo de pasar ("parametro")
        this.modelo = modelo;
        this.marca = marca;
        this.motor = motor;  //Este contructor toma parametros para inicializar todos los atributos del objeto "automovil"
        this.color = color;  //La palabra "this" se utiliza para referirise al atributo de la instancia actual de la clase
        this.patente = patente;
        this.cantPuertas = cantPuertas;
    }                                           //Getter and Setter, se utilizan para acceder y modificar los atributos privados
                                                // De la clase desde fuera de la clase
    
    public int getId() {  //Devuelve el atributo "id"
        return id;
    }

    public void setId(int id) { // establece el valor del atributo "id" 
        this.id = id;
    }

    public String getModelo() {  //Devuelve el atributo "modelo"
        return modelo;
    }

    public void setModelo(String modelo) {  //establece el valor del atributo modelo
        this.modelo = modelo;
    }

    public String getMarca() {   //Getters es para traer los valores de cada uno de los atributos de la clase una vez creado un objeto
        return marca;            //Setters es para setear valores a esos objetos que vayamos creando
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getCantPuertas() {
        return cantPuertas;
    }

    public void setCantPuertas(int cantPuertas) {
        this.cantPuertas = cantPuertas;
    }
}
