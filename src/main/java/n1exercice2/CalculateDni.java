package n1exercice2;

public class CalculateDni {

    private static final String POSSIBLE_LETTERS = "TRWAGMYFPDXBNJZSQVHLCKE";

    public char calculateCharacterDni(int numDni) {

        if (numDni < 0 || numDni > 99_999_999) {
            throw new IllegalArgumentException("Incorrect DNI number");
        }

        return POSSIBLE_LETTERS.charAt(numDni % 23);

    }
}
