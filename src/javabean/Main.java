package javabean;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

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
                	// TODO: Pendiente sub
                	System.out.println("Opcion pendiente de implementar");
                    break;

                case 2:
                    subMenuResta(scanner, resta);
                    break;

                case 3:
                	// TODO: Pendiente
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

    /**
     * Submenú para probar los métodos de la clase Resta.
     *
     * @param scanner Objeto Scanner para leer la entrada del usuario.
     * @param resta   Instancia de la clase Resta.
     */
    public static void subMenuResta(Scanner scanner, Resta resta) {
        int subOpcion;
        do {
            System.out.println("\n-- Submenú de Resta --");
            System.out.println("1. Restar dos números (double)");
            System.out.println("2. Restar dos números (int)");
            System.out.println("3. Restar tres números (int)");
            System.out.println("4. Restar al valor acumulado");
            System.out.println("5. Volver al menú principal");
            System.out.print("Selecciona una opción: ");
            subOpcion = scanner.nextInt();

            switch (subOpcion) {
                case 1:
                    System.out.print("Introduce el primer número (double): ");
                    double num1Double = scanner.nextDouble();
                    System.out.print("Introduce el segundo número (double): ");
                    double num2Double = scanner.nextDouble();
                    double resultadoDouble = resta.restar(num1Double, num2Double);
                    System.out.println("El resultado de la resta es: " + resultadoDouble);
                    break;

                case 2:
                    System.out.print("Introduce el primer número (int): ");
                    int num1Int = scanner.nextInt();
                    System.out.print("Introduce el segundo número (int): ");
                    int num2Int = scanner.nextInt();
                    int resultadoInt = resta.restar(num1Int, num2Int);
                    System.out.println("El resultado de la resta es: " + resultadoInt);
                    break;

                case 3:
                    System.out.print("Introduce el primer número (int): ");
                    int num1Triple = scanner.nextInt();
                    System.out.print("Introduce el segundo número (int): ");
                    int num2Triple = scanner.nextInt();
                    System.out.print("Introduce el tercer número (int): ");
                    int num3Triple = scanner.nextInt();
                    double resultadoTriple = resta.restar(num1Triple, num2Triple, num3Triple);
                    System.out.println("El resultado de la resta es: " + resultadoTriple);
                    break;

                case 4:
                    System.out.print("Introduce la cantidad a restar al valor acumulado: ");
                    double cantidad = scanner.nextDouble();
                    resta.restarAcumulado(cantidad);
                    System.out.println("El nuevo valor acumulado es: " + resta.getValorAcumulado());
                    break;

                case 5:
                    System.out.println("Volviendo al menú principal...");
                    break;

                default:
                    System.out.println("Opción inválida. Por favor, selecciona una opción válida.");
            }
        } while (subOpcion != 5);
    }
}
