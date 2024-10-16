// Clase Electronico que hereda de Producto
public class Electronico extends Producto {
    // Atributos adicionales para la clase Electronico
    private String marca;
    private int garantiaMeses;

    // Constructor que llama al constructor de la superclase
    public Electronico(String idProducto, String nombre, double precio, String marca, int garantiaMeses) {
        super(idProducto, nombre, precio); // Llamada al constructor de la superclase
        this.marca = marca; // Inicializa la marca del producto
        this.garantiaMeses = garantiaMeses; // Inicializa los meses de garantía
    }

    // Método específico para extender la garantía
    public void extenderGarantia(int mesesExtra) {
        this.garantiaMeses += mesesExtra; // Aumenta los meses de garantía
    }

    // Sobreescribimos el método mostrarInfo() para agregar más detalles
    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // Llama al método mostrarInfo() de la superclase
        System.out.println("Marca: " + marca);
        System.out.println("Garantía (meses): " + garantiaMeses);
    }
}
