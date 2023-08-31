package co.jmurillo.poo_tarea;

public class Persona {
    //Atributos para cualquier subclase que herede de persona
    private String nombre;
    private String apellido;
    private String numeroFiscal;
    private String direccion;

    //Inicializamos un constructor vacio para la clase persona
    public Persona(){
        System.out.println("Inicializando Constructor...");
    }

    //Inicializamos un constructor con parametros para la clase persona
    public Persona(String nombre, String apellido, String numeroFiscal){
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroFiscal = numeroFiscal;
    }

    public Persona(String nombre, String apellido, String numeroFiscal, String direccion){
        this(nombre, apellido, numeroFiscal);
        this.direccion = direccion;
    }

    //Métodos de control Getters de clase persona
    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public String getNumeroFiscal(){
        return numeroFiscal;
    }

    public String getDireccion(){
        return direccion;
    }

    //Método toString

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", numeroFiscal='" + numeroFiscal + '\'' +
                ", direccion='" + direccion + '\'';
    }
}
