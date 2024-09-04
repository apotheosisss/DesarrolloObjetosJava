//Clase SistemaDeGestionDeInventarios
package tienda.de.ropa;


public class SistemaDeGestionDeInventarios {
    //Atributos
    private String catalogoPrendas;
    private String clientesRegistrados;
    private String proveedorActivos;
    
    // Métodos
    public void registrarPrenda(PrendaDeVestir prenda){
        catalogoPrendas = prenda.getInfo();//Guardando la información de las prendas
        System.out.println("Prenda regisrada: "+ catalogoPrendas);
        }
    //Método registrar cliente
    public void registrarCliente(Cliente cliente){
        clientesRegistrados= "Cliente: "+ cliente.getInfo();
        System.out.println("Cliente registrado: "+ clientesRegistrados);
    }
    //Método para registrar un proveedor
    public void registrarProveedor(ProveedorDeModa proveedor){
        proveedorActivos = "Proveedor: "+ proveedor.getInfo();
        System.out.println("Proveedor Registrado: "+ proveedorActivos);
    }
    //Método para verificar la disponibilidad de una prenda
    public void verificarDisponibilidad(PrendaDeVestir prenda){
        System.out.println("Verificando disponibilidad:... "+ prenda.getInfo());
    }
    //Método para generar un informe de ventas
    public void generarInformeVentas(){
        System.out.println("Generando el informe...");
        //Acá va la lógica para crear un informe de ventas...
    }
}
