package tienda.de.ropa;


//Clase de Prenda de vestir
public class PrendaDeVestir {
    //Agregamos los atributos de la clase
    private String codigo;
    private String nombre;
    private String marca;
    private String categoria;
    private Boolean disponibilidad;
    
    // Constructor
    public PrendaDeVestir(String codigo, String nombre, String marca, String categoria, Boolean disponibilidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.categoria = categoria;
        this.disponibilidad = disponibilidad;
    }
    // Método vender
    public void vender(){
        if (disponibilidad){
            System.out.println("La prenda está disponible" + nombre);
            // Pasa a ser false por que si pasa por aquí, es que la prenda se vendió
            disponibilidad = false;
        }else{
            System.out.println("La prenda no se encuentra disponible.");            
        }        
    }
    // Método de reponer inventario
    public void reponerInventario(){
        disponibilidad = true;
        System.out.println("La prenda está disponible nuevamente" + nombre );        
    }
    //Consultar todos los datos de la prenda.
    public String getInfo(){
        return "Código: "+codigo + ", Nombre: "+nombre + ",Marca: "+marca + ",Categoría: "+categoria + ",Disponibilidad: "+(disponibilidad ? "Si" : "No");
    }    
}
