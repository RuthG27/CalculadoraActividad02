package javabean;

<<<<<<< HEAD:src/javabean/main.java
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
=======
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
>>>>>>> main:src/javabean/Main.java

        // Instancias de las clases
        Suma suma = new Suma();
        Resta resta = new Resta();
        Multiplicacion multiplicacion = new Multiplicacion();

        do {
            // Menú principal
            System.out.println("\n--- Menú de Operaciones ---");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                	suma.mostrarMenuSuma(scanner);
                    break;

                case 2:
                    Resta.subMenuResta(scanner, resta);
                    break;

                case 3:
                	// TODO: Pendiente de rellenar por ADEXE
                	System.out.println("Opcion pendiente de implementar");
                    break;

                case 4:
                    System.out.println("\nSaliendo del programa...");
                    break;

                default:
                    System.out.println("\nOpción inválida. Por favor, selecciona una opción válida.");
            }
        } while (opcion != 4);

        scanner.close();
    }

    
}
