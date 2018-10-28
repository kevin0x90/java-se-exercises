import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class WordExtractorTest {

    @Test
    @DisplayName("should extract all words from a string")
    public void shouldExtractWords() {
        final var input = "Hallöchen Welt! Toll";

        final var output = new WordExtractor().getWords(input);

        assertThat(output).isEqualTo(List.of("Hallöchen", "Welt", "Toll"));
    }
}
