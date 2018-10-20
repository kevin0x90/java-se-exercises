import static java.util.stream.IntStream.range;

public class SpeekLikeAChinese {

    public String getSpokenText(final String input) {
        final var resultBuilder = new StringBuilder();

        range(0, input.length()).forEach(i -> {
            var currentChar = input.charAt(i);
            if (currentChar == 'r') {
                resultBuilder.append('l');
            } else if (currentChar == 'R') {
                resultBuilder.append('L');
            } else {
                resultBuilder.append(currentChar);
            }
        });

        return resultBuilder.toString();
    }
}
