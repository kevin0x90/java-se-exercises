public class SimpleCompression {

    public String compress(final String input) {
        final var resultBuilder = new StringBuilder();

        for (int i = 0; i < input.length(); ++i) {
            final var currentCharacter = input.charAt(i);
            resultBuilder.append(currentCharacter);

            int charCount = 1;
            for (int k = i + 1; k < input.length() && input.charAt(k) == currentCharacter; ++k, ++charCount);

            if (charCount > 1) {
                resultBuilder.append(charCount);
                i += charCount - 1;
            }
        }

        return resultBuilder.toString();
    }

    public String decompress(final String input) {
        final var resultBuilder = new StringBuilder();
        final var digitBuilder = new StringBuilder();

        for (int i = 0; i < input.length(); ++i) {
            final var currentChar = input.charAt(i);
            resultBuilder.append(currentChar);
            digitBuilder.delete(0, digitBuilder.length());

            for (int k = i + 1; k < input.length() && Character.isDigit(input.charAt(k)); ++k) {
                digitBuilder.append(input.charAt(k));
            }

            if (digitBuilder.length() > 0) {
                final var repeats = Integer.parseInt(digitBuilder.toString()) - 1;

                for (int k = 0; k < repeats; ++k) {
                    resultBuilder.append(currentChar);
                }

                i += digitBuilder.length();
            }
        }

        return resultBuilder.toString();
    }
}
