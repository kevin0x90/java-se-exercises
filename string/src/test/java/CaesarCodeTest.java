import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CaesarCodeTest {

    @Test
    @DisplayName("should encrypt by moving every character by a given position")
    public void shouldEncryptByMovingEveryCharacter() {
        final var input = "Hello";

        final var result = new CaesarCode().encrypt(input, 3);

        assertThat(result).isEqualTo("Khoor");
    }
}
