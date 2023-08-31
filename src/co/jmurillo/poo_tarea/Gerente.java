package co.jmurillo.poo_tarea;

public class Gerente extends Empleado {
    // Atrubutos de Gerente clase hija de empleado y a su vez nieta de Persona
    private double presupuesto;

    // Inicializando constructores
    public Gerente () {
        System.out.println("Gerente: Inicializado Gerente....");
    }

    // Sobreescribiendo constructores
    public Gerente(String nombre, String apellido, String numeroFiscal){
        super(nombre, apellido, numeroFiscal);
    }

    public Gerente(String nombre, String apellido, String numeroFiscal, double remuneracion, int empleadoold){
        super(nombre, apellido, numeroFiscal, remuneracion, empleadoold);
    }

    public Gerente(String nombre, String apellido, String numeroFiscal, double remuneracion, int empleadoold, double presupuesto){
        super(nombre, apellido, numeroFiscal, remuneracion, empleadoold);
        this.presupuesto = presupuesto;
    }

    // Métodos Getters y Setters
    public double getPresupuesto(){
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto){
        this.presupuesto = presupuesto;
    }

    //Método toString
    @Override
    public String toString() {
        return super.toString() +
                "\npresupuesto=" + presupuesto;
    }
}
