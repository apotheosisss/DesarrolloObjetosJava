
package bibliotecaduocpm;
//Importar Scanner para poder leer los datos del usuario por consola
import java.util.Scanner;
public class BibliotecaDUOCPM {

    public static void main(String[] args) {
    //Objeto de la clase Scanner para poder trabajar con ella
    Scanner scanner = new Scanner(System.in);
    //Crear un objeto de la clase biblioteca,
    //Para trabajar colaborativamente entre clases y objetos
    //Acceder a los métodos agregarLibro, mostrarLibro, buscarPalabraEnTitulo 
    Biblioteca biblioteca = new Biblioteca();
    
    //Variable para almacenar la opción del menú escogida por el user.
    int opcion;
    
    //Menú de opciones, bucle infinito
    while (true){
        //Listado de opciones
        System.out.println("Menú de la biblioteca DUOC UC Puerto Montt");
        System.out.println("1 - Agregar un libro a la biblioteca");
        System.out.println("2 - Mostrar info de un libro");
        System.out.println("3 - Buscar una palabra en el titulo del libro");
        System.out.println("4 - Salir del programa");
        System.out.println("Escoge una opción número y presiona enter.");
        //Leer lo que digita el user y lo almaceno en opcion.
        opcion = scanner.nextInt();
        // \n con scanner.nextline()capturo el salto de linea al presionar
        //la tecla enter y evitamos futuros errores de captura
        scanner.nextLine();
        
        switch (opcion){
            case 1:
                System.out.println("Ingresa el titulo del libro");
                String titulo = scanner.nextLine();
                System.out.println("Ingresa el autor del libro");
                String autor = scanner.nextLine();
                //Llamamos al objeto biblioteca para trabajar con su método.
                biblioteca.agregarLibro(titulo, autor);
                break;
            case 2:
                //Llamamos al objeto biblioteca para trabajar con su método.
                biblioteca.mostrarLibro();
                break;
                
            case 3:
                System.out.println("Ingresa la palabra a buscar en el titulo del libro");
                String palabra = scanner.nextLine();
                biblioteca.buscarPalabraEnTitulo(palabra);
                break;
            case 4:
                System.out.println("Saliendo del programa...");
                //return: termina la ejecución del método main
                return;
            default:
                System.out.println("Ingresa una opción válida");
                break;
        }
        
    }
    }
    
}
