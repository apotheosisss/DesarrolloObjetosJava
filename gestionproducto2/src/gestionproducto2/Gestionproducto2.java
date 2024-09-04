
package gestionproducto2;
import java.util.Scanner;

public class Gestionproducto2 {

   
    public static void main(String[] args) {
        //Estoy creando una instancia de la clase Scanner para poder utilizar
        //los datos que ingrese el usuario por consola.
        Scanner scanner = new Scanner(System.in);
        //Solicitamos al user el código del producto
            System.out.println("Ingrese el código del producto: ");
            String codigo = scanner.nextLine();
        //Solicitamos al user el nombre del código
            System.out.println("Ingrese el nombre del producto: ");
            String nombre = scanner.nextLine();
        //Solicitamos al user la disponibilidad del producto
            System.out.println("Ingrese si el producto está disponible (true/false): ");
            Boolean disponible = scanner.nextBoolean();
        //Clase nombre = new Clase("Argumentos del const...","");
        //codigo, nombre y disponible
        producto producto1 = new producto(codigo,nombre,disponible);
        
        //Mostrar la info del producto
        System.out.println("Información del producto");
        System.out.println(producto1.getInfo());
        
        //Mostrar si el producto está disponible o no
        if(producto1.isDisponible()){
            System.out.println("El producto se encuentra disponible y listo para la compra");
    }else{
            System.out.println("Lamentablemente el producto no se encuentra disponible");}
}

    public Gestionproducto2() {
    }
    
}
