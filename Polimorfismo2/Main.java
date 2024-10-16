public class Main {
   public static void main(String[] args) {
    //Polimorfismo utilizamos la referencia tipo empleado pero con las clases hijas
    //String IdEmpleado, String nombre, double sueldo
    Empleado empleado1 = new EmpleadoAsalariado("12.345.678-9", "Matías", 600000.0);
//String IdEmpleado, String nombre, int horasTrabajadas, double pagoPorHora
    Empleado empleado2 = new EmpleadoPorHora("12.567.890-1", "Raúl", 50, 5000.0 );
    //Crear un departamento 
    Departamento departamento1 = new Departamento("D001", "Finanzas");
    departamento1.agregarEmpleado(empleado1);
    departamento1.agregarEmpleado(empleado2);
    empleado1.mostrarInfo();
    System.out.println("Salario o sueldo del empleado1: " + empleado1.calcularSalario());
    empleado2.mostrarInfo();
    System.out.println("Salario o sueldo del empleado1: " +empleado2.calcularSalario());
    System.out.println(" Costo total del departamento en sueldos: "+ departamento1.calcularCostoTotalSalarios());
   }
}
