import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SimpleCompressionTest {

    @Test
    @DisplayName("should compress a string")
    public void shouldCompress() {
        final var input = "...-----.-....";

        final var result = new SimpleCompression().compress(input);

        assertThat(result).isEqualTo(".3-5.-.4");
    }

    @Test
    @DisplayName("should decompress a string")
    public void shouldDecompress() {
        final var input = ".3-5.-.4";

        final var result = new SimpleCompression().decompress(input);

        assertThat(result).isEqualTo("...-----.-....");
    }
}
