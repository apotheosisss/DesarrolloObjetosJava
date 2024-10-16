package PolimorfismoMinecraft;
public abstract class Jugador{
    //Atributos

    protected String nombre;
    protected int salud;
    //Constructor
    public Jugador(String nombre, int salud){
        this.nombre = nombre;
        this.salud = salud;
    }

    //Método abstracto
    public abstract int calcularPuntos();

    //Método de tipo final(No cambia)
    public final void mostrarInfo(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Salud: " +salud);
    }
}