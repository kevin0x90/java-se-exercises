import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SpeekLikeAChineseTest {
    @Test
    @DisplayName("Should replace r with l in a given string")
    public void shouldReplaceCorrectly() {
        final var input = "I like to eat Springrolls";

        final var result = new SpeekLikeAChinese().getSpokenText(input);

        assertThat(result).isEqualTo("I like to eat Splinglolls");
    }

    @Test
    @DisplayName("Should replace R with L in a given string")
    public void shouldReplaceCaseSensitive() {
        final var input = "I like Rock n Roll";

        final var result = new SpeekLikeAChinese().getSpokenText(input);

        assertThat(result).isEqualTo("I like Lock n Loll");
    }
}
