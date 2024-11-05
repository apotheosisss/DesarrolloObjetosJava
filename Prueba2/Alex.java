package Prueba2;

public class Alex extends PersonajeMinecraft {
    //Atributo único materialConstruccion
    private String materialConstruccion;
    //Constructor
    public Alex(String nombre, int salud, int nivel, String materialConstruccion){
        super(nombre, salud, nivel);
        this.materialConstruccion = materialConstruccion;
    }
    //Acción de Alex
    @Override
    public void accion(){
        if (nivel>3){
            System.out.println(nombre + " construye un castillo con "+ materialConstruccion);
    }else
        System.out.println(nombre + " construye una casa con madera.");
    }
}
