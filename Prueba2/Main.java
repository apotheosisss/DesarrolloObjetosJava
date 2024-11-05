package Prueba2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Inicializar scanner
        Scanner scanner = new Scanner(System.in);
        //Creación de personajes y enemigos
        PersonajeMinecraft Steve = new Steve("Steve", 100, 7, "Pico de hierro");
        PersonajeMinecraft Alex = new Alex("Alex", 100, 4, "Ladrillo");
        EnemigoMinecraft Creeper = new EnemigoMinecraft("Creeper", 100); 
        EnemigoMinecraft Zombie = new EnemigoMinecraft("Zombie", 40);
        boolean continuar = true;
        //Creación del bucle principal para seleccionar opciones.
        while (continuar) {
            System.out.println("Seleccione una opción");
            System.out.println("1. Realizar una acción cómo Steve");
            System.out.println("2. Realizar una acción cómo Alex");
            System.out.println("3. Un enemigo ataca.");
            System.out.println("4. Mostrar la salud restante de Steve y Alex");
            System.out.println("5. Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                //Steve realiza una acción
                case 1:
                    Steve.accion();
                    break;
                //Alex realiza una acción
                case 2:
                    Alex.accion();
                    break;
                //Enemigo atacan a Steve y a Alex
                case 3:
                    Creeper.atacar();
                    Zombie.atacar();
                    break;
                //Mostrar la salud restante de Steve y Alex
                case 4:
                    Steve.mostrarSalud();
                    Alex.mostrarSalud();
                    break;
                //Salir del programa
                case 5:
                    continuar = false;
                    break;
                //Opción inválida
                default:
                    System.out.println("Opción incorrecta, ingresa una opción válida.  ");
                    break;
            }
        }
        //Cerrar el scanner para liberar recursos
        scanner.close();
    }
}