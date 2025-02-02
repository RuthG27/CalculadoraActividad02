package javabean;

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
}
