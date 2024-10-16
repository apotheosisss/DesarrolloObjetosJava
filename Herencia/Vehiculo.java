//Superclase vehiculo 
public class Vehiculo {
    //atributos de la clase vehiculo
    private String idVehiculo;
    private String marcaVehiculo;
    private double precioVehiculo;
    //Constructor de la clase vehiculo
    public Vehiculo(String id, String marca, double precio){
        this.idVehiculo = id;
        this.marcaVehiculo = marca;
        this.precioVehiculo = precio;
    }
    //Método para mostrar la información del vehiculo
    public void mostrarInfo(){
        System.out.println("Id vehiculo: "+ idVehiculo);
        System.out.println("Marca:" + marcaVehiculo);
        System.out.println("Precio de Reparación: " + precioVehiculo);
    }
    //Método para calcular el costo de la reparación con un descuento aplicado
    public double calcularDescuento(double descuento){
        return precioVehiculo - (precioVehiculo * descuento);
    }
}