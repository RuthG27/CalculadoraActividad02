package javabean;

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
}