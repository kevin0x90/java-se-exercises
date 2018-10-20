import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SumOfDigitsTest {

    @Test
    @DisplayName("should correctly calculate the sum of digits from a number")
    public void shouldSumUpTheDigitsOfANumber() {
       final var input = 123456L;

       final var result = new SumOfDigits().calculateSum(input);

       assertThat(result).isEqualTo(21L);
    }

    @Test
    @DisplayName("should correctly calculate the sum of digits from a string number")
    public void shouldSumUpTheDigitsOfStringNumber() {
        final var input = "1234";

        final var result = new SumOfDigits().calculateSum(input);

        assertThat(result).isEqualTo(10L);
    }
}
