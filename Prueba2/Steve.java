package Prueba2;

public class Steve extends PersonajeMinecraft {
    //Atributo único herramienta
    private String herramienta;
    //Constructor
    public Steve(String nombre, int salud, int nivel, String herramienta) {
        super(nombre, salud, nivel);
        this.herramienta = herramienta;
    }
    //Acción de Steve
    @Override
    public void accion() {
        //Si el nivel de Steve es mayor a 5, recolecta el doble de bloques.
        if (nivel>5){
            System.out.println(nombre + " es mayor a nivel 5 y recolecta un bloque y otro adicional.");

        }else
            System.out.println(nombre + " recolecta un bloque usando " + herramienta);
    }

}
