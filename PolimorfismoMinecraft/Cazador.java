package PolimorfismoMinecraft;

public class Cazador extends Jugador implements AccionBonus{
    //Atributo único
    private int enemigosCazados;
    //cs
    public Cazador(String nombre, int salud, int enemigosCazados){
        super(nombre, salud);
        this.enemigosCazados = enemigosCazados;
    }
}
