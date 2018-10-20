import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MorseMapperTest {

    @Test
    @DisplayName("should map a given text into correct morse code")
    public void shouldMapTextIntoMorseCode() {
        final var input = "Hello";

        final var result = new MorseMapper().map(input);

        assertThat(result).isEqualTo(".... . .-.. .-.. ---");
    }
}
