import java.util.StringTokenizer;

public class WordWrapper {
    public String wrap(final String input, final int length) {
        final var tokenizer = new StringTokenizer(input);
        final var currentLine = new StringBuilder();
        final var resultBuilder = new StringBuilder();

        while (tokenizer.hasMoreTokens()) {
            final var currentWord = tokenizer.nextToken();

            if (currentLine.length() + currentWord.length() > length) {
                resultBuilder.append(getLineString(currentLine) + "\n");
                currentLine.delete(0, currentLine.length());
                currentLine.append(currentWord + " ");
            } else {
                currentLine.append(currentWord + " ");
            }
        }

        resultBuilder.append(getLineString(currentLine));

        return resultBuilder.toString();
    }

    private static String getLineString(final StringBuilder lineBuilder) {
        final var line = lineBuilder.toString();

        return line.trim();
    }
}
