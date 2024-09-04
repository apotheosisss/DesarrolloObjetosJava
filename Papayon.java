//Programa Principal MAIN
package papayon;


public class Papayon {

    public static void main(String[] args)
    {   //Imprimir el primer mensaje por consola
        System.out.println("Bienvenido al papayon");
        System.out.println("Bienvenido 2");
        
        //Instanciamos la clase, para crear un objeto.
        //NombreClase + nombreObjeto = new + NombreClase("atributoClase1","atributoClase2")
        // Objeto pizza1 pepperoni
        Pizza pizza1 = new Pizza("pepperoni","grande","gruesa");
        //Objeto pizza2 vegetariana
        Pizza pizza2 = new Pizza("vegetariana","familiar","delgada");
                
        //Obtener el dato con Get pizza1 pepperoni
        String nombreGet = pizza1.getNombre();
        System.out.println("El nombre de la pizza es: " + nombreGet);
        //Obtener el dato con Get pizza2 vegetariana
        String nombreGet2 = pizza2.getNombre();
        System.out.println("El nombre de la pizza es: " + nombreGet2);
        
        //Setear cualquier dato del objeto SET
        pizza1.setMasa("Extra queso");
        //Almacenamos el dato cambiado seteado en una variable
        String tamanoSet = pizza1.getMasa();
        //Imprimimos el dato seteado
        System.out.println("Ahora el tipo de masa es: "+ tamanoSet);
        
    }
    
} 
