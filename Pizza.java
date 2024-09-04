
package papayon;


public class Pizza {
    
    
    //Atributos...
    private String nombre, tamano, masa;

    public Pizza(String nombre, String tamano, String masa) {
        this.nombre = nombre;
        this.tamano = tamano;
        this.masa = masa;
    }
        //Getters y Set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }
    
    //Métodos
    public void preparar(){
        System.out.println("Se está preparando la pizza");
    }
    public void calentar(){
        System.out.println("Se está calentando la pizza");
    }
}
