package PolimorfismoMinecraft;

public class Main {
    public static void main(String[] args) {
        Jugador minero = new Minero("Minero1", 100, 20);
        Jugador cazador = new Cazador("Cazador1", 100, 20);
        
        //Crear un clan
        Clan clan = new Clan("Minecraft");
        clan.agregarJugador(minero);
        clan.agregarJugador(cazador);

        minero.mostrarInfo();
        System.out.println("Puntos obtenidos: "+minero.calcularPuntos());
        cazador.mostrarInfo();
        System.out.println("Puntos obtenidos: "+cazador.calcularPuntos());

        //Mostrar el total de puntos obtenidos

        System.out.println("Total de puntos Clan: "+clan.calcularTotalPuntos()+" puntos ");
    }
}