import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WordExtractor {
    public List<String> getWords(final String input) {

        final var words = input.split("[^a-zA-ZäöüßÄÜÖ]");

        return Arrays.asList(words).stream()
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());
    }
}
