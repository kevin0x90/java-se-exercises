public class VowelRemover {

    public String remove(final String input) {
        final var resultBuilder = new StringBuilder();

        for (var i = 0; i < input.length(); ++i) {
            final var currentCharacter = input.charAt(i);

            switch (currentCharacter) {
                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'i':
                case 'I':
                case 'o':
                case 'O':
                case 'u':
                case 'U':
                    break;
                default:
                    resultBuilder.append(currentCharacter);
            }
        }

        return resultBuilder.toString();
    }
}
