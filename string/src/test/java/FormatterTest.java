import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FormatterTest {

    @Test
    @DisplayName("should formatDate a date in the formatDate day/month/year")
    public void shouldFormatDateInDayMonthYear() {

        final var formatter = new Formatter();

        final var formattedDate = formatter.formatDate(2015, 12, 11);

        assertThat(formattedDate).isEqualTo("11/12/2015");
    }

    @Test
    @DisplayName("should format a decimal with two places")
    public void shouldFormatDecimalWithTwoPlaces() {
        final double number = 1234567.1234;

        final var formattedNumber = new Formatter().formatNumberWithTwoPlaces(number);

        assertThat(formattedNumber).isEqualTo("1234567,12");
    }

    @Test
    @DisplayName("should format a decimal with two decimals and group separators")
    public void shouldFormatDecimalWithGroupsAndTwoPlaces() {
        final double number = 1234567.1234;

        final var formattedNumber = new Formatter().formatNumberWithTwoPlacesAndGroups(number);

        assertThat(formattedNumber).isEqualTo("1.234.567,12");
    }
}
