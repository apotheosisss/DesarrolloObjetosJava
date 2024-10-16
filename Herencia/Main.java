public class Main {
    public static void main(String[] args) {
        Auto auto1 = new Auto("V001","Honda", 2000.0,4,  true);
        Motocicleta moto1 = new Motocicleta("V002", "Honda", 200.0, true);

        //creamos un cliente
        Cliente cliente1 = new Cliente("C001", "Tío Rene");

        // Creamos una reparación y agregamos vehículos
        Reparacion reparacion = new Reparacion();
        reparacion.agregarVehiculo(auto1);
        reparacion.agregarVehiculo(moto1);

        // Agregamos la reparación al cliente
        cliente1.agregarReaparacion(reparacion);

        // Mostramos la información del cliente y sus reparaciones
        cliente1.mostrarReparaciones();
    }
}
