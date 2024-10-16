import java.util.ArrayList;

// Clase Cliente
public class Cliente {
    // Atributos de la clase Cliente
    private String idCliente;
    private String nombre;
    private ArrayList<Pedido> pedidosRealizados;

    // Constructor de la clase Cliente
    public Cliente(String idCliente, String nombre) {
        this.idCliente = idCliente; // Inicializa el idCliente
        this.nombre = nombre; // Inicializa el nombre del cliente
        this.pedidosRealizados = new ArrayList<>(); // Inicializa la lista de pedidos
    }

    // Método para agregar un pedido a la lista
    public void agregarPedido(Pedido pedido) {
        pedidosRealizados.add(pedido); // Añade el pedido a la lista
    }

    // Método para mostrar la información del cliente y sus pedidos
    public void mostrarPedidos() {
        System.out.println("Cliente: " + nombre);
        for (Pedido pedido : pedidosRealizados) {
            pedido.mostrarInfo(); // Llama al método mostrarInfo() de cada pedido
        }
    }
}
