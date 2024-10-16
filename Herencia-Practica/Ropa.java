// Clase Ropa que hereda de Producto
public class Ropa extends Producto {
    // Atributos adicionales para la clase Ropa
    private String talla;
    private String color;

    // Constructor que llama al constructor de la superclase
    public Ropa(String idProducto, String nombre, double precio, String talla, String color) {
        super(idProducto, nombre, precio); // Llamada al constructor de la superclase
        this.talla = talla; // Inicializa la talla de la prenda
        this.color = color; // Inicializa el color de la prenda
    }

    // Método específico para ajustar la talla de la prenda
    public void ajustarTalla(String nuevaTalla) {
        this.talla = nuevaTalla; // Cambia la talla de la prenda
    }

    // Sobreescribimos el método mostrarInfo() para agregar más detalles
    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // Llama al método mostrarInfo() de la superclase
        System.out.println("Talla: " + talla);
        System.out.println("Color: " + color);
    }
}

