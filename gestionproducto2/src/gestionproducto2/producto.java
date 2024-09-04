
package gestionproducto2;


public class producto {
    //ATRIBUTOS código nombre  dispinible
    public String codigo;
    public String nombre;
    public Boolean disponible;
    
    //Constructor

    public producto(String codigo, String nombre, Boolean disponible) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.disponible = disponible;
    }
    //Métodos
    public String getInfo(){
        return "Codigo: "+codigo+", Nombre: "+nombre+", Disponible: "+(disponible ? "Si está disponible":"No está disponible");
    }
    //Método para ver si el produto está disponible
    public Boolean isDisponible(){
        return disponible;
    }
}
