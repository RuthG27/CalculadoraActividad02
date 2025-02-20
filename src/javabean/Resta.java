package javabean;

import java.util.Scanner;

/**
 * Clase Resta que proporciona métodos para realizar operaciones de resta entre números,
 * incluyendo operaciones con números acumulados.
 * 
 * <p>Incluye sobrecarga de métodos para realizar restas con diferentes cantidades de argumentos
 * y permite gestionar un valor acumulado al que se le puede restar cantidades.</p>
 * 
 * @author Carlos Aguilar Bravo (aka aguica)
 * @see <a href="https://github.com/aguica">Mi GitHub</a>
 * @version 1.0
 * @since 2025
 */
public class Resta {

    /**
     * Valor acumulado que se utiliza para realizar operaciones de resta sucesivas.
     */
    private double valorAcumulado;

    /**
     * Constructor por defecto que inicializa el valor acumulado a 0.
     */
    public Resta() {
        this.valorAcumulado = 0;
    }

    /**
     * Realiza la resta entre dos números de tipo double.
     * 
     * @param numero1 Primer número.
     * @param numero2 Segundo número.
     * @return Resultado de la resta (numero1 - numero2).
     */
    public double restar(double numero1, double numero2) {
        return numero1 - numero2;
    }

    /**
     * Realiza la resta entre dos números de tipo int.
     * 
     * @param numero1 Primer número.
     * @param numero2 Segundo número.
     * @return Resultado de la resta (numero1 - numero2).
     */
    public int restar(int numero1, int numero2) {
        return numero1 - numero2;
    }

    /**
     * Realiza la resta entre tres números de tipo int.
     * 
     * @param numero1 Primer número.
     * @param numero2 Segundo número.
     * @param numero3 Tercer número.
     * @return Resultado de la resta (numero1 - numero2 - numero3).
     */
    public double restar(int numero1, int numero2, int numero3) {
        return numero1 - numero2 - numero3;
    }

    /**
     * Resta una cantidad específica al valor acumulado.
     * 
     * @param cantidad Cantidad que se desea restar del valor acumulado.
     */
    public void restarAcumulado(double cantidad) {
        this.valorAcumulado -= cantidad;
    }

    /**
     * Obtiene el valor acumulado actual.
     * 
     * @return Valor acumulado.
     */
    public double getValorAcumulado() {
        return this.valorAcumulado;
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