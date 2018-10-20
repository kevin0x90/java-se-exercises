public class PasswordChecker {
    public boolean isGoodPassword(final String input) {
        if (input.length() < 8) {
            return false;
        }

        var hasOneDigit = false;
        var hasOneSpecialCharacter = false;
        var hasLetter = false;

        for (int i = 0; i < input.length(); ++i) {
            final var currentCharacter = input.charAt(i);
            final var isDigit = Character.isDigit(currentCharacter);
            final var isLetter = Character.isLetter(currentCharacter);

            if (isDigit) {
                hasOneDigit = true;
            } else if (isLetter) {
                hasLetter = true;
            } else {
                hasOneSpecialCharacter = true;
            }

            if (hasLetter && hasOneDigit && hasOneSpecialCharacter) {
                break;
            }
        }

        return hasLetter && hasOneDigit && hasOneSpecialCharacter;
    }
}
