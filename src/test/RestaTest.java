package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javabean.Resta;

/**
 * Clase de prueba para la clase Resta utilizando JUnit 5.
 */
class RestaTest {

    private Resta resta;

    @BeforeEach
    void setUp() {
        resta = new Resta();
    }

    @Test
    void testRestarDouble() {
        assertEquals(3.5, resta.restar(5.5, 2.0), 0.001);
    }

    @Test
    void testRestarInt() {
        assertEquals(3, resta.restar(5, 2));
    }

    @Test
    void testRestarTresInt() {
        assertEquals(0, resta.restar(5, 3, 2));
    }

    @Test
    void testRestarAcumulado() {
        resta.restarAcumulado(5);
        assertEquals(-5, resta.getValorAcumulado());
    }

    @Test
    void testValorAcumuladoInicial() {
        assertEquals(0, resta.getValorAcumulado());
    }
}
