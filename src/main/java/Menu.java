import java.util.Scanner;


public class Menu {

    private EjemploJuegoDados juego;
    private Scanner scanner;
    private int opcion;

    public Menu() {
        juego = new EjemploJuegoDados();
        scanner = new Scanner(System.in);
    }

    private int pedirOpcion(){
        int entero = 0;
        boolean esEntero = false;

        do {
            try {
                System.out.println("Ingrese una opción: ");
                entero = Integer.parseInt(scanner.nextLine());
                esEntero = true;
            } catch (NumberFormatException e) {
                System.out.println("Por favor ingrese una opcion valida");
            }
        } while (!esEntero);

        return entero;
    }

    private void mostrarMenu() {
        System.out.println("1. Jugar");
        System.out.println("2. Salir");
    }

    private void salir() {
        limpiarPantalla();
        System.out.println("Adios");
    }

    private void limpiarPantalla() {
        for (int i = 0; i < 40; i++) System.out.println();
    }

    private void jugar() {
        limpiarPantalla();
        juego.lanzarDados();
        juego.mostrarResultado();
        if (juego.esVictoria()) {
            System.out.println("Usted a GANDADO!!!!");
        } else {
            System.out.println("Usted PERDIO :C");
        }
    }

    private void opcionIvalida() {
        System.out.println("Opcion invalida");
    }

    public void mainloop(){
        do {
            mostrarMenu();
            opcion = pedirOpcion();
            switch (opcion) {
                case 1:
                    jugar();
                    break;
                case 2:
                    salir();
                    break;
                default:
                    opcionIvalida();
            }
        } while (opcion != 2);
        scanner.close();
    }
}
