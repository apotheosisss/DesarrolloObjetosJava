public class Auto extends Vehiculo {
    //Atributos adicionales para clase Auto
    private int cantidadPuertas;
    private boolean tieneAireAcondicionado;

    //Constructor que llama al constructor de la superclase
    public Auto(String idVehiculo, String marcaVehiculo, double precioVehiculo, int cantidadPuertas, boolean tieneAireAcondicionado){
        super(idVehiculo, marcaVehiculo, precioVehiculo);//Llama al constructor de la superclase
        this.cantidadPuertas= cantidadPuertas;//icicializa la cantidad de puertas
        this.tieneAireAcondicionado = tieneAireAcondicionado;//inicializa si tienen aire acondicionado
    }

    //Sobrescribimos el método mostrarInfo()
    @Override
    public void mostrarInfo(){
        System.out.println("Cantidad de puertas : "+ cantidadPuertas);
        System.out.println("Aire acondicionado :" + tieneAireAcondicionado);
        
    }

}
