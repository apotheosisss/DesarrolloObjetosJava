import java.util.ArrayList;

public class Reparacion {
    //ATR para la clase 
    private ArrayList<Vehiculo> vehiculos;
    private double total;
    
    ///CTR para inicializar
    public Reparacion(){
        this.vehiculos = new ArrayList<>();
        this.total = 0;//inicializar en cero
    }

    //Método para agregar un vehiculo a la reparación
    public void agregarVehiculo(Vehiculo vehiculo){
        vehiculos.add(vehiculo);//añade el vehiculo a la lista
        total += vehiculo.calcularDescuento(0);
    }

    //Método para calcular el total de la reparacion

    public double calcularTotal(){
        return total;
    }

    //Método para mostrar la info de la reparación 
    public void mostrarInfo(){
        System.out.println("Vehículos en la reparación: ");
        for (Vehiculo vehiculo : vehiculos){
            vehiculo.mostrarInfo();//llama 

        }
        System.out.println("Total de la reparación : " + total);
    }


}
