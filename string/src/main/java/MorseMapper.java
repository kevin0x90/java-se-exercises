import java.util.HashMap;
import java.util.Map;

public class MorseMapper {

    private static Map<Character, String> morseCodeMap;

    public String map(final String input) {
        final var resultBuilder = new StringBuilder();
        final var inputLength = input.length();

        for (int i = 0; i < inputLength; ++i) {
            final var normalizedChar = Character.toUpperCase(input.charAt(i));

            if (!morseCodeMap.containsKey(normalizedChar)) {
                continue;
            }

            resultBuilder.append(morseCodeMap.get(normalizedChar));

            if (!isLastIteration(i, inputLength)) {
                resultBuilder.append(" ");
            }
        }

        return resultBuilder.toString();
    }

    private static boolean isLastIteration(final int i, final int inputLength) {
        return i == inputLength - 1;
    }

    static {
        morseCodeMap = new HashMap<>();
        morseCodeMap.put('A', ".-");
        morseCodeMap.put('B', "-...");
        morseCodeMap.put('C', "-.-");
        morseCodeMap.put('D', "-..");
        morseCodeMap.put('E', ".");
        morseCodeMap.put('F', "..-");
        morseCodeMap.put('G', "--.");
        morseCodeMap.put('H', "....");
        morseCodeMap.put('I', "..");
        morseCodeMap.put('J', ".---");
        morseCodeMap.put('K', "-.-");
        morseCodeMap.put('L', ".-..");
        morseCodeMap.put('M', "--");
        morseCodeMap.put('N', "-.");
        morseCodeMap.put('O', "---");
        morseCodeMap.put('P', ".--.");
        morseCodeMap.put('Q', "--.-");
        morseCodeMap.put('R', ".-.");
        morseCodeMap.put('S', "...");
        morseCodeMap.put('T', "-");
        morseCodeMap.put('U', "..-");
        morseCodeMap.put('V', "...-");
        morseCodeMap.put('W', ".--");
        morseCodeMap.put('X', "-..-");
        morseCodeMap.put('Y', "-.--");
        morseCodeMap.put('Z', "--..");
        morseCodeMap.put('0', "-----");
        morseCodeMap.put('1', ".----");
        morseCodeMap.put('2', "..---");
        morseCodeMap.put('3', "...--");
        morseCodeMap.put('4', "....-");
        morseCodeMap.put('5', ".....");
        morseCodeMap.put('6', "-....");
        morseCodeMap.put('7', "--...");
        morseCodeMap.put('8', "---..");
        morseCodeMap.put('9', "----.");
    }
}
