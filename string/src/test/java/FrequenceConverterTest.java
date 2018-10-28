import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FrequenceConverterTest {

    @Test
    @DisplayName("should return only numbers with alloed +- and ,. from a string")
    public void shouldReturnOnlyNumbersFromString() {
        final var input = "ABC 12,324 ZB";

        final var output = new FrequenceConverter().onlyNumbers(input);

        assertThat(output).isEqualTo("12,324");
    }

    @Test
    @DisplayName("should return multiple matches")
    public void shouldReturnMultipleNumbersFromString() {
        final var input = "ABC 12,324 hello wie geht es dir? 123.56";

        final var output = new FrequenceConverter().onlyNumbers(input);

        assertThat(output).isEqualTo("12,324123.56");
    }

    @Test
    @DisplayName("should convert a valid string number into a double")
    public void shouldConvertToDouble() {
        final var input = "12,324";

        final var output = new FrequenceConverter().stringDoubleToDouble(input);

        assertThat(output).isEqualTo(12.324d);
    }

    @Test
    @DisplayName("should convert a given frequence string to a double")
    public void shouldConvertFrequenceToNumber() {
        final var input = "12,3 Mhz";

        final var output = new FrequenceConverter().toFrequence(input);

        assertThat(output).isEqualTo(12.3d);
    }
}
