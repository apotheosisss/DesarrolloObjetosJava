package PolimorfismoMinecraft;
import java.util.ArrayList;
public class Clan {
    private String nombre;
    private ArrayList<Jugador> jugadores;

    //cs
    public Clan(String nombre){
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();//Declaro mi lista vacía
    }

    //Método que agregue jugadores al clan

    public void agregarJugador(Jugador jugador){
        jugadores.add(jugador);//agrego jugador a mi lista jugadores
    }
    //Método que me entrega el total de los puntos del clan

    public int calcularTotalPuntos(){
        //Declarar una variable para almacenar esos puntos
        int total = 0;
        for (Jugador jugador: jugadores){
            //Sumo y asigno a la vez +=
            total += jugador.calcularPuntos();
        }
        return total;
    }
}
