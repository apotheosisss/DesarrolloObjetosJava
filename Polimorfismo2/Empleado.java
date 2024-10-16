
//Es no puede ser instanciada directamente
//Sirven como una plantillla 
public abstract class Empleado {
    protected String IdEmpleado;
    protected String nombre;
    protected double sueldo;
    //Constructor
    public Empleado(String IdEmpleado, String nombre, double sueldo){
        this.IdEmpleado = IdEmpleado;
        this.nombre = nombre;
        this.sueldo = sueldo;

    }
    //Método abstracto
    //Defino una estructura pero la implementación se realizará en las sub clases (Clases hijas)
    //Reglas que las clases hijas deben implementar pero a su manera
    public abstract double calcularSalario();
    //Método de tipo Final
    // Final = fijo = quer no cambia
    public final void mostrarInfo(){
        System.out.println("Id empleado: "+ IdEmpleado);
        System.out.println("Nombre empleado: "+ nombre);
        System.out.println("Sueldo : "+sueldo);
    } 
}