package n1exercice2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class CalculateDniTest {

    @ParameterizedTest
    @CsvSource({
            "76_234_981, D",
            "54_918_672, P",
            "81_507_344, J",
            "39_846_215, A",
            "67_102_593, R",
            "92_430_168, E",
            "58_769_402, D",
            "44_315_790, B",
            "71_684_229, Z",
            "83_950_617, L"
    })
    void calculateDniLetterValidation(int dni, char letter) {
        CalculateDni obj = new CalculateDni();

        assertEquals(letter, obj.calculateCharacterDni(dni));
    }

    @Test
    void shouldThrowExceptionWhenDniIsNegative() {
        CalculateDni obj = new CalculateDni();

        try {
            obj.calculateCharacterDni(-1);
            fail("Expected IllegalArgumentException for negative DNI");
        } catch (IllegalArgumentException ignored) {
        }
    }

    @Test
    void shouldThrowExceptionWhenDniIsGreaterThanMaxAllowed() {
        CalculateDni obj = new CalculateDni();

        try {
            obj.calculateCharacterDni(100_000_000);
            fail("Expected IllegalArgumentException for DNI greater than 99_999_999");
        } catch (IllegalArgumentException ignored) {
        }
    }
}
