import java.io.InputStream;
import java.util.Scanner;

public class FileReader {
    public long getLongestLineLength(final InputStream inputStream) {
        long longestLine = 0L;

        try (final var scanner = new Scanner(inputStream)) {
            while (scanner.hasNextLine()) {
                final var currentLine = scanner.nextLine();
                longestLine = Math.max(longestLine, currentLine.length());
            }
        }

        return longestLine;
    }
}
