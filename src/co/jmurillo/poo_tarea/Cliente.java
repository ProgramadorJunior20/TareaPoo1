package co.jmurillo.poo_tarea;

public class Cliente extends Persona {
    // Atributos de la clase hija de Persona
    private int clienteId;

    // Inicializando constructor de la clase cliente
    public Cliente(){
        System.out.println("Cliente: Inicializando Constructor...");
    }

    // Sobre escritura de constructores
    public Cliente(String nombre, String apellido, String numeroFiscal) {
        super(nombre, apellido, numeroFiscal);
    }

    public Cliente(String nombre, String apellido, String numeroFiscal, int clienteId){
        super(nombre, apellido, numeroFiscal);
        this.clienteId = clienteId;
    }

    // Método Getter
    public int getClienteId(){
        return clienteId;
    }

    // Método toString
    @Override
    public String toString() {
        return super.toString() +
                "\nclienteId=" + clienteId;
    }
}
