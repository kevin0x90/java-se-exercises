import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringUnderlinerTest {

    @Test
    @DisplayName("should underline all occurences of a given word")
    public void shouldUnderlineAllOccurences() {
        final var input = "Man wird nicht dadurch besser, dass man andere schlecht macht.";
        final var underline = "besser";

        final var result = new StringUnderliner().underline(input, underline);

        assertThat(result).isEqualTo(
                "Man wird nicht dadurch besser, dass man andere schlecht macht." + System.getProperty("line.separator") +
                "                       ------                                 ");
    }
}
