import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;
import java.util.stream.Stream;

public class FamilyNamesReader implements AutoCloseable {

    private final Scanner scanner;

    public FamilyNamesReader(final InputStream input) {
        this.scanner = new Scanner(input);
    }

    public Stream<String> getNameStream() {
        return Stream.generate(() -> {
            if (scanner.hasNextLine()) {
                return scanner.nextLine();
            }

            return "";
        }).takeWhile(name -> !name.equals(""));
    }

    public static int sortByNameLength(final String name1, final String name2) {
        return name1.length() - name2.length();
    }

    @Override
    public void close() {
        if (scanner != null) {
            scanner.close();
        }
    }

    public static void main(final String[] args) throws Exception {
        final var classLoader = FamilyNamesReader.class.getClassLoader();
        final var inputFile = classLoader.getResource("familyNames.txt").getFile();

        try (final var inputStream = new FileInputStream(inputFile);
             final var familyNameReader = new FamilyNamesReader(inputStream)) {

            familyNameReader.getNameStream()
                    .sorted(FamilyNamesReader::sortByNameLength)
                    .forEach(name -> System.out.println(name));
        }
    }
}
