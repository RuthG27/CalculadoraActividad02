package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javabean.Multiplicacion;

class MultiplicacionTest {

    private Multiplicacion multiplicacion;

    @BeforeEach
    void setUp() {
        multiplicacion = new Multiplicacion();
    }

    @Test
    void testMultiplicarDoubleDouble() {
        double numero1 = 2.5;
        double numero2 = 4.0;
        double resultadoEsperado = 10.0;
        double precision = 0.0001;

        double resultadoObtenido = multiplicacion.multiplicar(numero1, numero2);
        assertEquals(resultadoEsperado, resultadoObtenido, precision);
    }

    @Test
    void testMultiplicarIntInt() {
        int numero1 = 3;
        int numero2 = 7;
        int resultadoEsperado = 21;

        int resultadoObtenido = multiplicacion.multiplicar(numero1, numero2);
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    void testMultiplicarDoubleDoubleDouble() {
        double numero1 = 1.5;
        double numero2 = 2.0;
        double numero3 = 3.0;
        double resultadoEsperado = 9.0;
        double precision = 0.0001;

        double resultadoObtenido = multiplicacion.multiplicar(numero1, numero2, numero3);
        assertEquals(resultadoEsperado, resultadoObtenido, precision);
    }

    @Test
    void testPotencia() {
        double base = 2.0;
        int exponente = 3;
        double resultadoEsperado = 8.0;
        double precision = 0.0001;

        double resultadoObtenido = multiplicacion.potencia(base, exponente);
        assertEquals(resultadoEsperado, resultadoObtenido, precision);
    }

    @Test
    void testMultiplicarDoubleDoubleConNumeroNegativo() {
        double numero1 = -2.0;
        double numero2 = 3.0;

        assertThrows(IllegalArgumentException.class, () -> {
            multiplicacion.multiplicar(numero1, numero2);
        });
    }

    @Test
    void testPotenciaConBaseCeroYExponenteNegativo() {
        double base = 0.0;
        int exponente = -2;

        assertThrows(IllegalArgumentException.class, () -> {
            multiplicacion.potencia(base, exponente);
        });
    }

    @Test
    void testMultiplicarDoubleConCero() {
        double numero1 = 0.0;
        double numero2 = 5.0;
        double resultadoEsperado = 0.0;

        double resultadoObtenido = multiplicacion.multiplicar(numero1, numero2);
        assertEquals(resultadoEsperado, resultadoObtenido, 0.0001);
    }

    @Test
    void testPotenciaExponenteCero() {
        double base = 5.0;
        int exponente = 0;
        double resultadoEsperado = 1.0;

        double resultadoObtenido = multiplicacion.potencia(base, exponente);
        assertEquals(resultadoEsperado, resultadoObtenido, 0.0001);
    }

    @Test
    void testPotenciaExponenteUno() {
        double base = 7.5;
        int exponente = 1;
        double resultadoEsperado = 7.5;

        double resultadoObtenido = multiplicacion.potencia(base, exponente);
        assertEquals(resultadoEsperado, resultadoObtenido, 0.0001);
    }

    @Test
    void testPotenciaNumerosGrandes() {
        double base = 10.0;
        int exponente = 1000;

        double resultadoObtenido = multiplicacion.potencia(base, exponente);
        assertEquals(Double.POSITIVE_INFINITY, resultadoObtenido, "El resultado debería ser infinito.");
    }
}