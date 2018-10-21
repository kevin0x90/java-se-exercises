import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AbbreviatorTest {

    @Test
    @DisplayName("should abbreviate a text with ... when it is longer than a given size")
    public void shouldAbbreviate() {
        final var input = "Pimpels are ugly";

        final var result = new Abbreviator().abbreviate(input, 6);

        assertThat(result).isEqualTo("Pim...");
    }

    @Test
    @DisplayName("should not abbreviate a text that is within the specified length")
    public void shouldNotAbbreviateShortText() {
        final var input = "Hello, World";

        final var result = new Abbreviator().abbreviate(input, 12);

        assertThat(result).isEqualTo("Hello, World");
    }
}
