import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    @Test
    void testSumar() {
        Calculadora calc = new Calculadora();

        int resultado = calc.sumar(2, 3);

        assertEquals(5, resultado);
    }

    @Test
    void testRestar() {
        Calculadora calc = new Calculadora();

        int resultado = calc.restar(5, 2);

        assertEquals(3, resultado);
    }
}
