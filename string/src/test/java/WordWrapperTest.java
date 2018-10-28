import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WordWrapperTest {

    @Test
    @DisplayName("should wrap the words in a string by the given length")
    public void shouldWrapWords() {
        final var input = "Der Sehnsucht entgegen, sie erleben. Wer kann das schon. Den Träumen entgegen, \n" +
                "sie erleben. Wer macht das schon. Den Gefühlen entgegen, sie erleben. Wer wagt das schon. \n" +
                "Der Liebe entgegen, sie erleben. Wer darf das schon.";

        final var output = new WordWrapper().wrap(input, 20);

        assertThat(output).isEqualTo("Der Sehnsucht\n" +
                "entgegen, sie\n" +
                "erleben. Wer kann\n" +
                "das schon. Den\n" +
                "Träumen entgegen,\n" +
                "sie erleben. Wer\n" +
                "macht das schon. Den\n" +
                "Gefühlen entgegen,\n" +
                "sie erleben. Wer\n" +
                "wagt das schon. Der\n" +
                "Liebe entgegen, sie\n" +
                "erleben. Wer darf\n" +
                "das schon.");
    }
}
