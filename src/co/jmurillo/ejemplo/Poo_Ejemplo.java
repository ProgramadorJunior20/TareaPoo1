package co.jmurillo.ejemplo;

import co.jmurillo.poo_tarea.*;

public class Poo_Ejemplo {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Jeff", "Tristan","334499", 1);
        Gerente gerente1 = new Gerente("Perz", "Marzon", "1233349");
        gerente1.setPresupuesto(12.0000);
        Empleado empleado1 = new Empleado("Jeffer", "Trees", "1123098", 12,2);

        System.out.println("Cliente" + cliente1);
        System.out.println("Gerente" + gerente1);
        System.out.println("Empleado" + empleado1);
    }
}
