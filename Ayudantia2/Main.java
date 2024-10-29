import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Grupo grupo = new Grupo();
        boolean continuar = true;

        while (continuar) {
            System.out.println("Sleccione una opción");
            System.out.println("1 Crear un nuevo Mario");

            System.out.println("2 Crear un uevo Yoshi");

            System.out.println("3 Mover un personaje");

            System.out.println("4 Calcular el total de monedas");

            System.out.println("5 Mosttrar información");

            System.out.println("6 salir");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                Personaje personaje = new Mario ("Mario", 2, 100, true);
                    grupo.agregarJugador(personaje);
                    break;
            
                case 2:
                Personaje personaje2 = new Yoshi ("Yoshi", 2, 100, "verde");
                    grupo.agregarJugador(personaje2);
                    break;

                case 3:
                for(Personaje jugador: grupo.getJugadores()){
                    jugador.moverse();
                }
                break;

                case 4:
                int totalMonedas = grupo.calcularTotalMonedas();
                System.out.println("Total monedas: "+ totalMonedas);
                break;

                case 5 :
                grupo.mostrarInformacionGrupo();
                break;

                case 6:
                    continuar= false;
                    System.out.println("saliendo del programa");
                    break;

                default:
                    System.out.println("Ingrese opción valida");
            }




        }
        scanner.close();
    }
}
