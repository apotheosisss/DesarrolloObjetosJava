package Prueba2;
public class EnemigoMinecraft implements Atacable {
    // Atributos
    private String nombre;
    private int fuerzaAtaque;

    // Constructor
    public EnemigoMinecraft(String nombre, int fuerzaAtaque) {
        this.nombre = nombre;
        this.fuerzaAtaque = fuerzaAtaque;
    }

    // Implementación del método abstracto atacar
    @Override
    public void atacar() {
        if (fuerzaAtaque > 50) {
            System.out.println("El enemigo " + nombre + " ataca, causando 40 de daño.");
        } else {
            System.out.println("El enemigo " + nombre + " ataca, causando 20 de daño.");
        }
    }
}


    
