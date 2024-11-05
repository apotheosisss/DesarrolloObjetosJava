package Prueba2;

public abstract class PersonajeMinecraft {
    //Atributos protegidos
    protected String nombre;
    protected int salud, nivel;
    //Constructor
    public PersonajeMinecraft(String nombre, int salud, int nivel) {
        this.nombre = nombre;
        this.salud = salud;
        this.nivel = nivel;
    }
    //Método abstracto accion
    public abstract void accion();
    
    //Método final perderVida
    public final int perderVida(){
        if(salud >10){
            salud-=10;
        }
        return salud;
    }
    public final int ganarExperiencia(){
        nivel++;
        System.out.println("Has ganado un nivel de experiencia!");
        return nivel;
    }
    //Método para mostrar salud del personaje
    public void mostrarSalud(){
        System.out.println("Salud del personaje " + nombre + ": " +salud);
    }
}
