public class StringUnderliner {
    public String underline(final String input, final String underline) {
        final var resultBuilder = new StringBuilder(input.length());

        int stringStart = 0;

        while (true) {
            final var previousStart = stringStart;
            final var text = input.substring(stringStart);
            stringStart = text.indexOf(underline);

            resultBuilder.append(repeat(" ", stringStart));

            if (stringStart == -1) {
                if (previousStart < input.length()) {
                    resultBuilder.append(repeat(" ", input.length() - previousStart));
                }
                break;
            } else {
                resultBuilder.append(repeat("-", underline.length()));
                stringStart += underline.length();
            }
        }

        return input + System.getProperty("line.separator") + resultBuilder.toString();
    }

    private static String repeat(final String text, final int repetitions) {
        final var resultBuilder = new StringBuilder();

        for (int i = 0; i < repetitions; ++i) {
            resultBuilder.append(text);
        }

        return resultBuilder.toString();
    }
}
