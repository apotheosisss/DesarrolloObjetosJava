//Clase principal (MAIN)
package tienda.de.ropa;


public class TiendaDeRopa {

    public static void main(String[] args) {
         //Crear las instancias de las clases = crear objetos.
         //NombreClase nombreObjeto = new NobmreClase("Argumentos..", )
         PrendaDeVestir prenda1 = new PrendaDeVestir("0379410","Polera algodón","HyM","Polera", true);
         PrendaDeVestir prenda2 = new PrendaDeVestir("0574827","Jeans","HyM","Pantalón", true);
         //Clientes
         Cliente cliente1 = new Cliente("CL179543","Negro José");
         Cliente cliente2 = new Cliente("VE175345","Nicolás Maduro");
         //Proveedores
         ProveedorDeModa proveedor1 = new ProveedorDeModa("P84921","Proveedor HyM");
         ProveedorDeModa proveedor2 = new ProveedorDeModa("P48832","Proveedor Dolly");
         
         //Crear un objeto
         SistemaDeGestionDeInventarios sistema = new SistemaDeGestionDeInventarios();
         
         //Registrar prendas
         sistema.registrarPrenda(prenda1);
         sistema.registrarPrenda(prenda2);
         //Registrar clientes
         sistema.registrarCliente(cliente1);
         sistema.registrarCliente(cliente2);
         //Registrar proveedores
         sistema.registrarProveedor(proveedor1);
         sistema.registrarProveedor(proveedor2);
         
         //Simular una compra
         cliente1.realizarCompra(prenda1);
         cliente2.realizarCompra(prenda2);
         
         //Realizar devolución
         cliente1.devolverPrenda(prenda1);
         cliente2.devolverPrenda(prenda2);
         
         //Proveedor suministra prenda
         proveedor1.suministrarPrenda(prenda1);
         proveedor2.suministrarPrenda(prenda2);
         
         //Verificar disponibilidad de una prenda
         sistema.verificarDisponibilidad(prenda1);
         sistema.verificarDisponibilidad(prenda2);
         //Generar informe
         sistema.generarInformeVentas();
    }
    
}
