// Clase base Producto, que será heredada por otras clases
public class Producto {
    // Atributos de la clase Producto
    private String idProducto;
    private String nombre;
    private double precio;

    // Constructor de la clase Producto
    public Producto(String idProducto, String nombre, double precio) {
        this.idProducto = idProducto; // Inicializa el idProducto
        this.nombre = nombre; // Inicializa el nombre del producto
        this.precio = precio; // Inicializa el precio del producto
    }

    // Método para mostrar la información básica del producto
    public void mostrarInfo() {
        System.out.println("ID Producto: " + idProducto);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
    }

    // Método para calcular el precio con descuento
    public double calcularDescuento(double descuento) {
        return precio - (precio * descuento); // Calcula el precio aplicando un descuento
    }
}
