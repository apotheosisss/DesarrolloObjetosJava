
package bibliotecaduocpm;

public class Libro {
    //Atributos de libro titulo y autor
    private String titulo;
    private String autor;
    
    //Constructor

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    //Get y set

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    //Método para acceder a los datos del libro
    public void mostrarInformacion(){
        System.out.println("Titulo: "+titulo);
        System.out.println("Autor: "+autor);
    }
}
