import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PalindromTesterTest {

    @Test
    @DisplayName("should check if a given string is a palindrom")
    public void isPalindrom() {
       final var input = "otto";

       final var output = new PalindromTester().isPalindrom(input);

       assertThat(output).isTrue();
    }

    @Test
    @DisplayName("should recognize palindroms case insensitive")
    public void isPalindromCaseInsensetive() {
        final var input = "Otto";

        final var output = new PalindromTester().isPalindromCaseInsensitive(input);

        assertThat(output).isTrue();
    }

    @Test
    @DisplayName("should recognize palindroms regardless of spaces and casing")
    public void isPalindromIgnoringSpaces() {
        final var input = "A man a plan a canal Panama";

        final var output = new PalindromTester().isPalindromSpaceIrrelevant(input);

        assertThat(output).isTrue();
    }
}
