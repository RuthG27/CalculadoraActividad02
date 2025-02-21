package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javabean.Suma;

class SumaTest {

	private Suma suma;

	@BeforeEach
	void setUp() {
		suma = new Suma();
	}

	@Test
	void testSumarDoubleDouble() {
		double numero1 = 0.7;
		double numero2 = 0.2;

		double resultadoEsperado = 0.9;
		double precision = 0.0001;

		double resultadoObtenido = suma.sumar(numero1, numero2);
		assertEquals(0, suma.obtenerCantidadAcumulada());
		assertEquals(resultadoEsperado, resultadoObtenido, precision);

	}

	@Test
	void testSumarIntInt() {
		int numero1 = 1;
		int numero2 = 2;
		int resultadoEsperado = 3;

		int resultadoObtenido = suma.sumar(numero1, numero2);
		assertEquals(0, suma.obtenerCantidadAcumulada());
		assertEquals(resultadoEsperado, resultadoObtenido);

	}

	@Test
	void testSumarDoubleDoubleDouble() {
		double numero1 = 0.2;
		double numero2 = 0.3;
		double numero3 = 0.1;
		double resultadoEsperado = 0.6;
		double precision = 0.0001;

		double resultadoObtenido = suma.sumar(numero1, numero2, numero3);
		assertEquals(0, suma.obtenerCantidadAcumulada());
		assertEquals(resultadoEsperado, resultadoObtenido, precision);
	}

	@Test
	void testSumarAcumulado() {
		double numero1 = 0.5;
		double numero2 = 0.3;
		double resultadoEsperado = 0.8;
		double precision = 0.0001;

		suma.sumarAcumulado(numero1);
		suma.sumarAcumulado(numero2);

		double resultadoObtenido = suma.obtenerCantidadAcumulada();

		assertEquals(resultadoEsperado, resultadoObtenido, precision);
	}

	@Test
	void testObtenerCantidadAcumulada() {
		double acumuladoInicial = suma.obtenerCantidadAcumulada();
		assertEquals(0.0, acumuladoInicial, "La cantidad acumulada inicial debe ser 0");

		double numero = 0.4;
		double resultadoEsperado = 0.4;
		double precision = 0.0001;

		suma.sumarAcumulado(numero);
		double resultadoObtenido = suma.obtenerCantidadAcumulada();

		assertEquals(resultadoEsperado, resultadoObtenido, precision);
	}

	@Test
	void testReiniciarAcumulado() {
		double numero = 0.9;
		suma.sumarAcumulado(numero);

		suma.reiniciarAcumulado();
		double resultadoObtenido = suma.obtenerCantidadAcumulada();

		assertEquals(0.0, resultadoObtenido);

	}
}
