import java.util.ArrayList;

public class Departamento {
    //Atributos idDepartamento, nombre, lista de empleados
    
    private String idDepartamento;
    private String nombre;
    private ArrayList<Empleado> empleados;

    //constructor solo recibe los 2 atributos la lista se declara dentro del constructor como una liasta vacía
    public Departamento(String idDepartamento, String nombre){
        this.idDepartamento = idDepartamento;
        this.nombre = nombre;
        this.empleados = new ArrayList<>();//inicializo mi lista como vacía
    }

    //Método para agregar empleado a la lista //+Empleados = Departamento
    public void agregarEmpleado(Empleado empleado){//empleado= el último empleado que se agrego a la lista
        empleados.add(empleado);
    }
    //Método para calcular el total de los sueldos
    public double calcularCostoTotalSalarios(){
        //declarar una variable total y la inicializo en = 0
        double total=0;
        for(Empleado empleado : empleados){
            //Sumando y asignado a la misma vez 
            total += empleado.calcularSalario();
        }
        return total;
    }
}
