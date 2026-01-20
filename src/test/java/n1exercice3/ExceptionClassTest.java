package n1exercice3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptionClassTest {

    @Test
    void shouldThrowArrayIndexOutOfBoundsException() {
        ExceptionClass obj = new ExceptionClass();

        assertThrows(
                ArrayIndexOutOfBoundsException.class,
                obj::makingException
        );
    }

}
