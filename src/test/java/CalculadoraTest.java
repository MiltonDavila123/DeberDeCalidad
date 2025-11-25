import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    Calculadora calc = new Calculadora();

    @Test
    void testSuma() {
        Assertions.assertEquals(5, calc.sumar(2, 3));
    }

    @Test
    void testResta() {
        Assertions.assertEquals(1, calc.restar(3, 2));
    }

    @Test
    void testMultiplicacion() {
        Assertions.assertEquals(6, calc.multiplicar(2, 3));
    }

    @Test
    void testDivision() {
        Assertions.assertEquals(2, calc.dividir(6, 3));
    }

    @Test
    void testDivisionPorCero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> calc.dividir(5, 0));
    }
}
