package javabean;

import java.util.Scanner;

/**
 * 
 * Esta clase permite sumar números enteros y decimales. También, guarda un
 * total acumulado de las sumas realizadas.
 * 
 * <p>
 * En la clase suma existen varios métodos con el mismo nombre, y a esto se le
 * llama <b>sobrecarga de métodos</b> que nos permitirá la suma de:
 * </p>
 * 
 * <ul>
 * <li>Dos números decimales <a href=
 * "https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html">double</a></li>
 * <li>Dos números enteros <a href=
 * "https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html">int</a></li>
 * <li>Tres números decimales {@code double}</li>
 * </ul>
 * 
 * <p>
 * También tiene una función que guarda el total de las sumas y otra para
 * restablecer el total a su estado inicial {@code 0}
 * </p>
 * 
 * 
 * 
 * <h2>Casos especiales:</h2>
 * <li>Si se introduce números negativos se lanza un excepción
 * {@code IllegalArgumentException}</li>
 * <li>Es posible sumar con {@code 0}, ya que devolverá el otro valor</li>
 * 
 * 
 * @author Ruth Guamán Albarracín (aka RuthG27)
 * @see <a href="https://github.com/RuthG27">Mi GitHub</a>
 * @version 1.0
 * @since 2025
 * 
 */

public class Suma {

	private double cantidadAcumulada;

	public Suma() {
		cantidadAcumulada = 0;
	}
	

	/**
	 * 
	 * Suma dos números decimales
	 *
	 * @param numero1 Primer número
	 * @param numero2 Segundo número
	 * @return La suma de {@code numero1} y {@code numero2}
	 * @throws IllegalArgumentException si algún parámetro es negativo
	 * @see #sumar(double, double, double) Para sumar tres números decimales
	 * 
	 */

	public double sumar(double numero1, double numero2) {
		if (numero1 < 0 || numero2 < 0) {
			throw new IllegalArgumentException("Números negativos no se admiten.");
		}
		return numero1 + numero2;
	}

	/**
	 * 
	 * Suma dos números enteros
	 *
	 * @param numero1 Primer número
	 * @param numero2 Segundo número
	 * @return El resultado de la suma de {@code numero1} y {@code numero2}
	 * @throws IllegalArgumentException si algún parámetro es negativo
	 * 
	 */

	public int sumar(int numero1, int numero2) {
		if (numero1 < 0 || numero2 < 0) {
			throw new IllegalArgumentException("Números negativos no se admiten");
		}
		return numero1 + numero2;
	}

	/**
	 * 
	 * Suma tres números decimales.
	 *
	 * @param numero1 Primer número
	 * @param numero2 Segundo número
	 * @param numero3 Tercer número
	 * @return El resultado de la suma de {@code numero1}, {@code numero2} y
	 *         {@code numero3}
	 * @throws IllegalArgumentException si algún parámetro es negativo
	 * @see #sumar(double, double) Para sumar dos números decimales.
	 * 
	 */

	public double sumar(double numero1, double numero2, double numero3) {
		if (numero1 < 0 || numero2 < 0 || numero3 < 0) {
			throw new IllegalArgumentException("Números negativos no se admiten");
		}
		return numero1 + numero2 + numero3;
	}

	/**
	 * 
	 * Suma un número al total acumulado. <br>
	 * Método de tipo {@code void}, no devuelve ningún valor.
	 * 
	 * @param cantidad
	 * @throws IllegalArgumentException si algún parámetro es negativo
	 * 
	 */

	public void sumarAcumulado(double cantidad) {
		if (cantidad < 0) {
			throw new IllegalArgumentException("No se puede acumular números negativos.");
		}
		cantidadAcumulada += cantidad;
	}

	/**
	 * 
	 * Devuelve el total acumulado hasta el momento
	 * 
	 * @return La cantidad acumulada
	 * 
	 */

	public double obtenerCantidadAcumulada() {
		return cantidadAcumulada;
	}

	/**
	 * 
	 * Restablece el total acumulado a {@code 0}.<br>
	 * Método de tipo {@code void}, no devuelve ningún valor.
	 * 
	 */

	public void reiniciarAcumulado() {
		cantidadAcumulada = 0;
	}

	// Menú

	public void mostrarMenuSuma(Scanner leer) {
		int opcion;
		do {
			System.out.println("******Menú suma******");
			System.out.println("1. Suma dos números enteros");
			System.out.println("2. Suma dos números decimales");
			System.out.println("3. Suma tres números decimales");
			System.out.println("4. Menú principal");
			System.out.print("Seleccione una opción (1-4): ");

			opcion = leer.nextInt();

			switch (opcion) {
			case 1:
				sumarDosEnteros(leer);
				break;
			case 2:
				sumarDosDecimales(leer);
				break;
			case 3:
				sumarTresDecimales(leer);
				break;
			case 4:
				System.out.println("Menú principal");
				break;
			default:
				System.out.println("Opción incorrecta. Introduce un número entre 1 y 4");
			}
		} while (opcion != 4);

	}
	
	private void sumarDosEnteros(Scanner leer) {
		System.out.print("Escribe un número entero: ");

	    while (!leer.hasNextInt()) {
	        System.out.println("No es un número entero");
	        leer.next();
	    }
		int numero1 = leer.nextInt();
		System.out.print("Escribe otro número entero: ");
		int numero2 = leer.nextInt();
		System.out.println("El resultado es: " + sumar(numero1, numero2));
	}
     
	private void sumarDosDecimales(Scanner leer) {
		System.out.print("Escribe un número decimal usando una coma (por ejemplo 1,6): ");
		while (!leer.hasNextDouble()) {
			System.out.println("No es un número décimal");
			leer.next();
		}
		double numero1 = leer.nextDouble();

		System.out.print("Escribe un número decimal usando una coma (por ejemplo 1,6): ");
		while (!leer.hasNextDouble()) {
			System.out.println("No es un número décimal (1,6)");
			leer.next();
		}
		double numero2 = leer.nextDouble();

		System.out.println("El resultado es: " + (numero1 + numero2));

	}

	private void sumarTresDecimales(Scanner leer) {
		System.out.print("Escribe un número decimal usando una coma (por ejemplo 1,6): ");
		while (!leer.hasNextDouble()) {
			System.out.println("No es un número décimal");
			leer.next();
		}
		double numero1 = leer.nextDouble();

		System.out.print("Escribe un número decimal usando una coma (por ejemplo 1,6): ");
		while (!leer.hasNextDouble()) {
			System.out.println("No es un número décimal");
			leer.next();
		}
		double numero2 = leer.nextDouble();

		System.out.print("Escribe un número decimal usando una coma (por ejemplo 1,6): ");
		while (!leer.hasNextDouble()) {
			System.out.println("No es un número décimal");
			leer.next();
		}
		double numero3 = leer.nextDouble();

		System.out.println("El resultado es: " + (numero1 + numero2 + numero3));

	}

}
