import java.util.ArrayList;

// Clase Pedido
public class Pedido {
    // Atributos de la clase Pedido
    private ArrayList<Producto> productos;
    private double total;

    // Constructor de la clase Pedido
    public Pedido() {
        this.productos = new ArrayList<>(); // Inicializa la lista de productos
        this.total = 0; // Inicializa el total a 0
    }

    // Método para agregar un producto al pedido
    public void agregarProducto(Producto producto) {
        productos.add(producto); // Añade el producto a la lista
        total += producto.calcularDescuento(0); // Actualiza el total
    }

    // Método para calcular el total del pedido
    public double calcularTotal() {
        return total; // Devuelve el total del pedido
    }

    // Método para mostrar la información del pedido
    public void mostrarInfo() {
        System.out.println("Productos en el pedido:");
        for (Producto producto : productos) {
            producto.mostrarInfo(); // Llama al método mostrarInfo() de cada producto
        }
        System.out.println("Total del pedido: " + total);
    }
}
