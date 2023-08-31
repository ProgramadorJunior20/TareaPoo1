package co.jmurillo.poo_tarea;

public class Empleado extends Persona{
    // Atributos de la clase hija de persona
    private double remuneracion;
    private int empleadoold;

    // Inicializando constructor
    public Empleado(){
        System.out.println("Empleado: Inicializando Constructor");
    }

    //Sobre escritura de constructores
    public Empleado(String nombre, String apellido, String numeroFiscal){
        super(nombre, apellido, numeroFiscal);
    }

    public Empleado(String nombre, String apellido, String numeroFiscal, double remuneracion, int empleadoold){
        super(nombre, apellido, numeroFiscal);
        this.remuneracion = remuneracion;
        this.empleadoold = empleadoold;
    }

    // Métodos Getters de Empleado
    public double getRemuneracion() {
        return remuneracion;
    }

    public int getEmpleadoold() {
        return empleadoold;
    }

    // Métodos de la clase
    public double aumentarPorsentaje(int porcentaje){
        return porcentaje;
    }

    // Método toString


    @Override
    public String toString() {
        return super.toString() +
                "\nremuneracion=" + this.getRemuneracion() +
                ", empleadoold=" + this.getEmpleadoold();
    }
}
