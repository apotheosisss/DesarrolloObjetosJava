
package tienda.de.ropa;


public class ProveedorDeModa {
    //Atributos
    private String codigoProveedor;
    private String nombre;
    private String prendasSuministradas;
    
    //CONSTRUCTOR
    public ProveedorDeModa(String codigoProveedor, String nombre) {
        this.codigoProveedor = codigoProveedor;
        this.nombre = nombre;
        this.prendasSuministradas = "";
    }
    //Métodos para suministro de prenda
    public void suministrarPrenda(PrendaDeVestir prenda) {
        prendasSuministradas = prenda.getInfo();
        System.out.println(nombre + "ha suministrado: "+ prendasSuministradas);
    }
    //Método getInfo
    public String getInfo(){
        return "Código del proveedor: "+ codigoProveedor + "Nombre proveedor: "+ nombre + "Prendas suministradas: "+prendasSuministradas;
        
    }
}
