import java.math.RoundingMode;
import java.text.NumberFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Formatter {

    private static final DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.GERMANY);

    public String formatDate(final int year, final int month, final int day) {
        final var dateTime = ZonedDateTime.now(ZoneId.of("Europe/Berlin"))
                .withYear(year)
                .withMonth(month)
                .withDayOfMonth(day)
                .withHour(0)
                .withMinute(0)
                .withSecond(0)
                .withNano(0);

        return dateTime.format(format);
    }

    public String formatNumberWithTwoPlaces(final double number) {
        numberFormat.setGroupingUsed(false);
        numberFormat.setRoundingMode(RoundingMode.HALF_UP);
        numberFormat.setMaximumFractionDigits(2);

        return numberFormat.format(number);
    }

    public String formatNumberWithTwoPlacesAndGroups(final double number) {
        numberFormat.setGroupingUsed(true);
        numberFormat.setRoundingMode(RoundingMode.HALF_UP);
        numberFormat.setMaximumFractionDigits(2);

        return numberFormat.format(number);
    }
}
