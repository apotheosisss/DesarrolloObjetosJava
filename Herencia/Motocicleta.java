public class Motocicleta extends Vehiculo {
    //Atributo adicional para la clase Motocicleta
    private boolean tieneMaletero;


    //Constructor que llama al constructor de la superClase
    public Motocicleta(String idVehiculo, String marcaVehiculo, double precioVehiculo, boolean tieneMaletero){
        super(idVehiculo, marcaVehiculo, precioVehiculo);
        this.tieneMaletero = tieneMaletero;
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();//llama al metodo mostrar info
        System.out.println("Maletero: " + (tieneMaletero ? "Si":"No"));
    }
}
