/*
CLASE Cliente
 */
package tienda.de.ropa;


public class Cliente {
    //Atributos
    private String numeroCliente;//id cliente
    private String nombre;
    private String prendasAdquiridas; //Prendas adquiridas por el cliente.
    
    //Constructor 

    public Cliente(String numeroCliente, String nombre) {
        this.numeroCliente = numeroCliente;
        this.nombre = nombre;
        this.prendasAdquiridas = "";
    }
    //Métodos
    public void realizarCompra(PrendaDeVestir prenda){
        prenda.vender();//Llamando al método vender de PDV para la prenda quede en estado no disponible.
        prendasAdquiridas = prenda.getInfo();//Guardamos la info de la Prenda adquirida
        System.out.println( nombre + " ha comprado " + prendasAdquiridas);
    }
    public void devolverPrenda(PrendaDeVestir prenda){
        if (!prendasAdquiridas.isEmpty()){
            prenda.reponerInventario();//llama al método reponerInventario para dejar la prenda como disponible
            System.out.println(nombre + " ha devuelto " + prendasAdquiridas);
            prendasAdquiridas = "";//Reseteamos la prenda desúés de su devolución.
        }else{
            System.out.println( nombre +" no tiene prendas para devolve, compre algo primero ");
        }
    }
    
    public String getInfo(){
        return "Número cliente: " + numeroCliente + ", Nombre: " + nombre + ", Prendas Adquiridas: " + prendasAdquiridas ;
    }
    
}
