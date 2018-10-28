import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SpaceCompressorTest {

    @Test
    @DisplayName("should remove consecutive spaces and tabs")
    public void shouldRemoveSpacesAndTabs() {
        final var input = new StringBuilder("Hallo  \t   Welt   :)");

        final var output = new SpaceCompressor().compressSpace(input);

        assertThat(output.toString()).isEqualTo("Hallo Welt :)");
    }
}
