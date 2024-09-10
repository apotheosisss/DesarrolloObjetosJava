package gestiondeempleados;
import java.util.Scanner;
public class GestionDeEmpleados {
    
    public static void main(String[] args) {
        //Creando un objeto de la clase Empresa = en una variable
        Empresa empresa = new Empresa();
        
        //Crear un objeto de la clase Scanner
        Scanner scanner = new Scanner(System.in);
        //Una variable que me almacene la opción escogida por el usuario
        int opcion;
        
        while (true){
            //Impresiones de mi Menú
            System.out.println("Escoge una opción del menú ");
            System.out.println("1 - Agregar un empleado. ");
            System.out.println("2 - Buscar empleados ");
            System.out.println("3 - Salir del sistema por nombre ");
            System.out.println("Escoge una opción digitando el número  ");
            opcion = scanner.nextInt();
            scanner.nextLine();//elimino el salto de linea provocado por la tecla enter
            
            //Agregamos un switch para poder ejecutar cada instrucción según la selección del menú
            
            switch(opcion){
                case 1:
                    //Solicitando los datos al user nombre, id, departamento
                    System.out.println("Ingresa el nombre del empleado");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingresa el id del empleado");
                    String id = scanner.nextLine();
                    System.out.println("Ingresa el departamento del empleado");
                    String departamento = scanner.nextLine();
                    
                    //Validación
                    //Si el nombre, id, departamento no están vacios
                    if(!nombre.isEmpty() && !id.isEmpty() && !departamento.isEmpty()){
                        //
                        Empleado empleado1 = new Empleado(nombre, id, departamento);
                        empresa.agregarEmpleado(empleado1);
                        
                    }else{
                        System.out.println("Todos los datos son obligatorios.");
                    }
                    break;
                case 2:
                    //Buscar un empleado por nombre
                    System.out.println("Ingresa el nombre del empleado a buscar");
                    String nombreBuscar = scanner.nextLine();
                    empresa.buscarEmpleadoPorNombre(nombreBuscar);
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Ingresa una opción valida");
                    
            }
        }
        
    }
    
}
