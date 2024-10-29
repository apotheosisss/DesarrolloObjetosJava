import java.util.ArrayList;

public class Grupo {

    private ArrayList<Personaje> jugadores;

    public Grupo(){
        this.jugadores = new ArrayList<>();
    }

    public void agregarJugador(Personaje jugador){
        jugadores.add(jugador);
    }

    public ArrayList<Personaje> getJugadores() {
        return jugadores;
    }
    public int calcularTotalMonedas(){
        int totalMonedas = 0;
        for (Personaje jugador : jugadores){
            totalMonedas += jugador.monedas;
        }
        if (totalMonedas>100) {
            System.out.println(" El grupo ha ganado 100 monedas extra");
            totalMonedas += 100;
            
        }
        return totalMonedas;
    }

    public void mostrarInformacionGrupo(){
        for (Personaje jugador : jugadores){
            jugador.mostrarInfo();
        }

    }
}