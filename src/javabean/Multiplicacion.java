package javabean;

import java.util.Scanner;

/**
 * Esta clase permite realizar operaciones de multiplicación y calcular potencias.
 * También incluye un menú para ejecutar las diferentes operaciones y manejo de excepciones.
 * 
 * <p>La clase Multiplicacion utiliza métodos sobrecargados para:</p>
 * <ul>
 *   <li>Multiplicar dos números reales.</li>
 *   <li>Multiplicar dos números enteros.</li>
 *   <li>Multiplicar tres números reales.</li>
 *   <li>Calcular la potencia de un número real con exponente entero.</li>
 * </ul>
 * 
 * <h2>Casos especiales:</h2>
 * <ul>
 *   <li><b>No se permiten números negativos en las operaciones de multiplicación.</b> Se lanza una excepción {@code IllegalArgumentException}.</li>
 *   <li><b>Potencia con base 0 y exponente negativo:</b> Lanza una excepción porque no está definida.</li>
 *   <li><b>Multiplicación con 0:</b> El resultado siempre será 0.</li>
 *   <li><b>Potencia con exponente 0:</b> Siempre devuelve 1, excepto si la base es 0 (genera excepción).</li>
 *   <li><b>Potencia con exponente 1:</b> El resultado será igual a la base.</li>
 *   <li><b>Potencia con números grandes:</b> Puede devolver {@code Infinity} si el resultado es demasiado grande para representarse.</li>
 * </ul>
 * 
 * @author Adexe Hernandez
 * @see <a href="https://github.com/adexeHernandez">GitHub Personal</a>
 * @version 1.0
 * @since 2025
 */
public class Multiplicacion {

    /**
     * Multiplica dos números reales.
     * @param a Primer número real.
     * @param b Segundo número real.
     * @return El producto de a y b.
     * @throws IllegalArgumentException si a o b son negativos.
     */
    public double multiplicar(double a, double b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("No se permiten números negativos.");
        }
        return a * b;
    }

    /**
     * Multiplica dos números enteros.
     * @param a Primer número entero.
     * @param b Segundo número entero.
     * @return El producto de a y b.
     * @throws IllegalArgumentException si a o b son negativos.
     */
    public int multiplicar(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("No se permiten números negativos.");
        }
        return a * b;
    }

    /**
     * Multiplica tres números reales.
     * @param a Primer número real.
     * @param b Segundo número real.
     * @param c Tercer número real.
     * @return El producto de a, b y c.
     * @throws IllegalArgumentException si alguno de los parámetros es negativo.
     */
    public double multiplicar(double a, double b, double c) {
        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalArgumentException("No se permiten números negativos.");
        }
        return a * b * c;
    }

    /**
     * Calcula la potencia de un número real.
     * @param base La base de la potencia.
     * @param exponente El exponente al que se eleva la base.
     * @return El resultado de base elevado a exponente.
     * @throws IllegalArgumentException si la base es 0 y el exponente es negativo.
     */
    public double potencia(double base, int exponente) {
        if (base == 0 && exponente < 0) {
            throw new IllegalArgumentException("La potencia con base 0 y exponente negativo no está definida.");
        }
        return Math.pow(base, exponente);
    }

    /**
     * Muestra el menú de operaciones de multiplicación.
     * @param scanner Objeto Scanner para leer la entrada del usuario.
     */
    public void mostrarMenuMultiplicacion(Scanner scanner) {
        int opcion;
        do {
            System.out.println("\n****** Menú de Multiplicación ******");
            System.out.println("1. Multiplicar dos números reales");
            System.out.println("2. Multiplicar dos números enteros");
            System.out.println("3. Multiplicar tres números reales");
            System.out.println("4. Calcular una potencia");
            System.out.println("5. Volver al menú principal");
            System.out.print("Seleccione una opción (1-5): ");

            while (!scanner.hasNextInt()) {
                System.out.println("Error: Debe ser un número entero.");
                scanner.next();
            }
            opcion = scanner.nextInt();

            try {
                switch (opcion) {
                    case 1 -> multiplicarDosReales(scanner);
                    case 2 -> multiplicarDosEnteros(scanner);
                    case 3 -> multiplicarTresReales(scanner);
                    case 4 -> calcularPotencia(scanner);
                    case 5 -> System.out.println("¡Gracias por usar el programa!");
                    default -> System.out.println("Opción incorrecta. Elija un número entre 1 y 5.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (opcion != 5);
    }

    private void multiplicarDosReales(Scanner scanner) {
        System.out.print("Introduce el primer número real: ");
        double num1 = validarDouble(scanner);
        System.out.print("Introduce el segundo número real: ");
        double num2 = validarDouble(scanner);
        System.out.printf("El resultado es: %.2f%n", multiplicar(num1, num2));
    }

    private void multiplicarDosEnteros(Scanner scanner) {
        System.out.print("Introduce el primer número entero: ");
        int num1 = validarEntero(scanner);
        System.out.print("Introduce el segundo número entero: ");
        int num2 = validarEntero(scanner);
        System.out.println("El resultado es: " + multiplicar(num1, num2));
    }

    private void multiplicarTresReales(Scanner scanner) {
        System.out.print("Introduce el primer número real: ");
        double num1 = validarDouble(scanner);
        System.out.print("Introduce el segundo número real: ");
        double num2 = validarDouble(scanner);
        System.out.print("Introduce el tercer número real: ");
        double num3 = validarDouble(scanner);
        System.out.printf("El resultado es: %.2f%n", multiplicar(num1, num2, num3));
    }

    private void calcularPotencia(Scanner scanner) {
        System.out.print("Introduce la base de la potencia: ");
        double base = validarDouble(scanner);
        System.out.print("Introduce el exponente (entero): ");
        int exponente = validarEntero(scanner);
        System.out.printf("El resultado es: %.2f%n", potencia(base, exponente));
    }

    private double validarDouble(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.println("Error: Introduce un número real válido.");
            scanner.next();
        }
        return scanner.nextDouble();
    }

    private int validarEntero(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Error: Introduce un número entero válido.");
            scanner.next();
        }
        return scanner.nextInt();
    }
}
