import java.util.regex.Pattern;

public class FrequenceConverter {

    public String onlyNumbers(final String input) {
        final var resultBuilder = new StringBuilder();

        for (int i = 0; i < input.length(); ++i) {
            final var currentChar = input.charAt(i);

            if (Character.isDigit(currentChar) || isNumberPrefix(currentChar) || isDecimalSeparator(currentChar)) {
                resultBuilder.append(currentChar);
            }
        }

        return resultBuilder.toString();
    }

    public double stringDoubleToDouble(final String input) {
        final var normalizedInput = input.replaceAll(",", ".");
        return Double.parseDouble(normalizedInput);
    }

    public double toFrequence(final String input) {
        return stringDoubleToDouble(onlyNumbers(input));
    }

    private static boolean isNumberPrefix(final char character) {
        return character == '+' || character == '-';
    }

    private static boolean isDecimalSeparator(final char character) {
        return character == '.' || character == ',';
    }
}
