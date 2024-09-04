//Class biblioteca
package bibliotecaduocpm;

public class Biblioteca {
    //Libro: Declarando colaboración entre clases y el tipo de dato
    // libro: instancia del objeto libro
    //private: es que solo podemos acceder a estos datos desde la clase Biblioteca
    private Libro libro;
    //Método para agregar un libro a la biblioteca.
        public void agregarLibro(String titulo, String autor){
        //Almacenando el objeto en una variable que se llama libro
            libro = new Libro(titulo, autor);//Creando un objeto libro
}        
        //Método para mostrar la información del libro
        public void mostrarLibro(){
            if (libro != null)
                libro.mostrarInformacion();
        //Si el libro está vacio
        else{
                System.out.println("No hay libros actualmente en la biblioteca");
        }
    }
    

    //Método para buscar una palabra especifica en el titulo del libro
    public void buscarPalabraEnTitulo(String palabra){
        //Si el libro no está vacio
        //&& y el titulo del libro contiene la palabra (palabra)
        if (libro != null && libro.getTitulo().contains(palabra)){
            System.out.println("El titulo del libro si contiene la palabra: "+palabra);
        //Si la palabra no se encuentra en el titulo
        }else{
            System.out.println("El titulo del libro no contiene la palabra buscada: "+ palabra);
        }
    }



}

