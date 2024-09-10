package gestiondeempleados;
public class Empresa {
    //Trabajar de manera colaborativa entre clases
    //Empleado es un atributo de tipo clase
    //empleado = instanciando la clase= objeto
    private Empleado empleado;
    
    //Metodo para agregar un empleado
    public void agregarEmpleado(Empleado empleado){
        this.empleado = empleado;
        System.out.println("Empleado fue agregado exitosamente");
        
    }
    
    //Buscar a un empleado por su nombre
    public void buscarEmpleadoPorNombre(String nombre){
        //Si empleado no está vacio
        //&& nombre del empleado es igual al nombre obtenido por consola
        //Ignorando mayúsculas y minúsculas.
        if(empleado != null && empleado.getNombre().equalsIgnoreCase(nombre)){
            System.out.println(empleado.toString());
        }else{
            System.out.println("El empleado no fue encontrado.");
        }
    }
        
    
}   
    