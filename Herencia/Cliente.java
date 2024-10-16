import java.util.ArrayList;

public class Cliente {
    //atr clase cliente
    private String idCliente;
    private String nombreCliente;
    private ArrayList<Reparacion> reparacionesRealizadas;


    //ctr
    public Cliente(String idCliente, String nombreCliente){
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.reparacionesRealizadas = new ArrayList<>();

    }

    //agregar reparacion a una lista
    public void agregarReaparacion(Reparacion reparacion){
        reparacionesRealizadas.add(reparacion);//añade la reparación a la lista
    }

    public void mostrarReparaciones(){
        System.out.println("Cliente: "+ nombreCliente);
        for (Reparacion reparacion : reparacionesRealizadas){
            reparacion.mostrarInfo();
        }
        
    }
}
