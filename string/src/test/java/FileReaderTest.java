import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.assertj.core.api.Assertions.assertThat;

public class FileReaderTest {

    @Test
    @DisplayName("should read an input and output the longest line")
    public void shouldOutputLongestLine() {
        final var input = "this is just some text\n" +
                "i think that today might be a good day\n" +
                "some more random text as it can never be enough";
        final InputStream inputStream = new ByteArrayInputStream(input.getBytes());

        final var output = new FileReader().getLongestLineLength(inputStream);

        assertThat(output).isEqualTo(47L);
    }
}
