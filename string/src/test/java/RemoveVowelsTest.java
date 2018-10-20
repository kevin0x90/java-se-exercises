import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RemoveVowelsTest {

    @Test
    @DisplayName("should remove vowel a")
    public void shouldRemoveVowelA() {
        final var input = "Nachbar";

        final var result = new VowelRemover().remove(input);

        assertThat(result).isEqualTo("Nchbr");
    }

    @Test
    @DisplayName("should remove vowel e")
    public void shouldRemoveVowelE() {
        final var input = "Nett";

        final var result = new VowelRemover().remove(input);

        assertThat(result).isEqualTo("Ntt");
    }

    @Test
    @DisplayName("should remove vowel i")
    public void shouldRemoveVowelI() {
        final var input = "Ich";

        final var result = new VowelRemover().remove(input);

        assertThat(result).isEqualTo("ch");
    }

    @Test
    @DisplayName("should remove vowel o")
    public void shouldRemoveVowelO() {
        final var input = "Obwohl";

        final var result = new VowelRemover().remove(input);

        assertThat(result).isEqualTo("bwhl");
    }

    @Test
    @DisplayName("should remove vowel u")
    public void shouldRemoveVowelU() {
        final var input = "Ulk";

        final var result = new VowelRemover().remove(input);

        assertThat(result).isEqualTo("lk");
    }
}
