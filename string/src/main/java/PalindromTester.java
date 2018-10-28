public class PalindromTester {
    public boolean isPalindrom(final String input) {
        return input.equals(reverse(input));
    }

    public boolean isPalindromCaseInsensitive(final String input) {
        final var normalizedInput = input.toLowerCase();
        return normalizedInput.equals(reverse(normalizedInput));
    }

    public boolean isPalindromSpaceIrrelevant(final String input) {
        final var normalizedInput = input.replaceAll(" ", "");

        return isPalindromCaseInsensitive(normalizedInput);
    }

    private static String reverse(final String input) {
        final var resultBuilder = new StringBuilder(input.length());

        for (int i = input.length() - 1; i >= 0; --i) {
            resultBuilder.append(input.charAt(i));
        }

        return resultBuilder.toString();
    }
}
