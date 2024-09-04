
package ejemplostringfor2;
public class EjemploStringFor2 {
    public static void main(String[] args) {
//Lista o array de palabras
        String[] palabras = {"Java","JavaScript","Python","CSS","Sass","SQL"};
            
        //Iterar sobre cada palabra del arreglo o lista
        //Declaramos un indice, validación, que se vaya sumando de uno en uno
        for ( int i = 0; 1< palabras.length; i++){
            //Argumentamos lo que queremos que pase por cada iteración.
            
            String palabra = palabras[i];
            
            //Obtener la longitud de una palabra
            int longitud = palabra.length();
            System.out.println("La longitud de la palabra es: "+ longitud);
            //Obtener el primer caracter de la palabra
            
            char primerCaracter = palabra.charAt(0);
            System.out.println("El primer caracter de la palabra es: "+ primerCaracter);
            
            //Convertir una palabra en mayusculas
            String palabraEnMayusculas = palabra.toUpperCase();
            System.out.println("La palabra en mayúsculas es: "+ palabraEnMayusculas);
            
            //Convertir una palabra en minisculas
            String palabraEnMinusculas = palabra.toLowerCase();
            System.out.println("La palabra en minusculas es: "+palabraEnMinusculas);
            
            //Verificar si una palabra comienza con una letra especifica. "J"
            
            if (palabra.startsWith("J")){
                System.out.println("La palabra "+palabra+ "comienza con la letra J.");
            }else{
                System.out.println("La palabra "+palabra+"no comienza con la letra J.");
            }
            
            //Verificar si la palabra finaliza con una letra especifica
            if (palabra.endsWith("s")){
                System.out.println("La palabra "+palabra+"finaliza con la letra s.");
           
            }else{
                System.out.println("La palabra "+palabra+"no finaliza con la letra s.");
            }
            
            //Vamos a crear una subcadena de una palabra de los 3 primeros caracteres
            //Si longitud es mayor o igual a 3 // Longitud tiene el total de caracteres
            if (longitud >=3){
                //Almacenando la subcadena  (3 Caracteres)en una variable
                String subcadena = palabra.substring(0,3);
                //Jav
                System.out.println("La subcadena de la palabra "+ palabra + " Es: " + subcadena);
            }
            
            //Reemplazar un caracter especifico por otro caracter
            String palabraReemplazada = palabra.replace("a","@");
            System.out.println("La palabra reemplazada con el @ "+ palabraReemplazada);
            
            //Comparar una palabra es igual a la de la lista ignorando mayusculas y minusculas
            // java = true
            if(palabra.equalsIgnoreCase("java")){
                System.out.println("La palabra java se encuentra en la lista, ignorando mayusculas y minusculas.");
                
            }else{
                System.out.println("La palabra java no se encuentra en la lista.");
            }
            
            //Remover los espacios en blanco de una cadena trim();
            
            String palabraConEspacios = "     "+palabra+"     ";
            String palabraSinEspacios = palabraConEspacios.trim();
            
            System.out.println("Palabra con espacios: "+palabraConEspacios);
            System.out.println("Palabra sin espacios: "+palabraSinEspacios);
            System.out.println("------------------------------------------");
        }
    }
    
}
