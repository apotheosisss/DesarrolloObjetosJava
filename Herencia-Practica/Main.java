public class Main {
    public static void main(String[] args) {
        // Creamos algunos productos
        Electronico laptop = new Electronico("E001", "Laptop", 1000.0, "Dell", 12);
        Ropa camiseta = new Ropa("R001", "Camiseta", 20.0, "M", "Azul");

        // Creamos un cliente
        Cliente cliente = new Cliente("C001", "Juan Pérez");

        // Creamos un pedido y agregamos productos
        Pedido pedido = new Pedido();
        pedido.agregarProducto(laptop);
        pedido.agregarProducto(camiseta);

        // Agregamos el pedido al cliente
        cliente.agregarPedido(pedido);

        // Mostramos la información del cliente y sus pedidos
        cliente.mostrarPedidos();
    }
}
