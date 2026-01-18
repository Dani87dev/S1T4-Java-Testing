package n1exercice2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;


public class CalculateDniTest {

    @ParameterizedTest
    @CsvSource({
            "12_345_678, Z",
            "23_456_789, S",
            "34_567_890, W",
            "45_678_901, P",
            "56_789_012, M",
            "67_890_123, Y",
            "78_901_234, D",
            "89_012_345, J",
            "90_123_456, B",
            "21_987_654, X"
    })

    void calculateDniLetterValidation(int dni, char letter) {
        CalculateDni obj = new CalculateDni();

        assertEquals(letter, obj.calculateCharacterDni(dni));
    }


}
