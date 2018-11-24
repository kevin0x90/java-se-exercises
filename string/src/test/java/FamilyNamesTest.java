import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class FamilyNamesTest {
    @Test
    @DisplayName("should read family names from an input stream")
    public void shouldReadFamilyNameFromInputStream() {
        final var sampleInput = "Hinson\n" +
                "Hinton\n" +
                "Hinton-Smith\n" +
                "Hinz\n" +
                "Hipp\n" +
                "Hippert\n" +
                "Hipson\n" +
                "Hirakawa";

        final InputStream input = new ByteArrayInputStream(sampleInput.getBytes());

        try (final Stream<String> names = new FamilyNamesReader(input).getNameStream()) {
            assertThat(names.collect(Collectors.toList())).isEqualTo(List.of(
                    "Hinson",
                    "Hinton",
                    "Hinton-Smith",
                    "Hinz",
                    "Hipp",
                    "Hippert",
                    "Hipson",
                    "Hirakawa"));
        }
    }

    @Test
    @DisplayName("should sort names ascending by their length")
    public void shouldSortNamesAscendingByLength() {
        final var sampleInput = List.of("Hinz", "Hirakawa", "Hans").stream();

        final var sortedNames = sampleInput.sorted(FamilyNamesReader::sortByNameLength).collect(Collectors.toList());

        assertThat(sortedNames).isEqualTo(List.of("Hinz", "Hans", "Hirakawa"));
    }
}
