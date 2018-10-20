import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PasswordCheckerTest {

    @Test
    @DisplayName("should have a minimum length of 8 characters")
    public void shouldContain1Digit() {
        final var input = "123";

        final var result = new PasswordChecker().isGoodPassword(input);

        assertThat(result).isFalse();
    }

    @Test
    @DisplayName("should contain at least one digit")
    public void shouldContainOneDigit() {
        final var input = "abcdefghi";

        final var result = new PasswordChecker().isGoodPassword(input);

        assertThat(result).isFalse();
    }

    @Test
    @DisplayName("should contain at least one special character")
    public void shouldContainOneSpecialCharacter() {
        final var input = "abcdefgh1";

        final var result = new PasswordChecker().isGoodPassword(input);

        assertThat(result).isFalse();
    }

    @Test
    @DisplayName("should contain at least one normal letter")
    public void shouldContainOneNormalLetter() {
        final var input = "12345678{";

        final var result = new PasswordChecker().isGoodPassword(input);

        assertThat(result).isFalse();
    }
}
