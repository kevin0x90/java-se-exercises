import java.util.HashMap;
import java.util.Map;

public class CaesarCode {

    public String encrypt(final String input, final int rotation) {
        final var resultBuilder = new StringBuilder(input.length());

        for (int i = 0; i < input.length(); ++i) {
            final var currentCharacter = input.charAt(i);

            final var index = charIndexMap.get(Character.toLowerCase(currentCharacter));
            if (index == null) {
                resultBuilder.append(currentCharacter);
                continue;
            }

            final var rotatedCharacter = getRotatedCharacterFromAlphabet(index, rotation);

            resultBuilder.append(Character.isUpperCase(currentCharacter) ?
                    Character.toUpperCase(rotatedCharacter) : rotatedCharacter);
        }

        return resultBuilder.toString();
    }

    private static char getRotatedCharacterFromAlphabet(final int index, final int rotation) {
        return alphabet[index + rotation % alphabet.length];
    }

    private final static char[] alphabet = {
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
            'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
            's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
    };

    private final static Map<Character, Integer> charIndexMap;

    static {
        charIndexMap = new HashMap<>();
        charIndexMap.put('a', 0);
        charIndexMap.put('b', 1);
        charIndexMap.put('c', 2);
        charIndexMap.put('d', 3);
        charIndexMap.put('e', 4);
        charIndexMap.put('f', 5);
        charIndexMap.put('g', 6);
        charIndexMap.put('h', 7);
        charIndexMap.put('i', 8);
        charIndexMap.put('j', 9);
        charIndexMap.put('k', 10);
        charIndexMap.put('l', 11);
        charIndexMap.put('m', 12);
        charIndexMap.put('n', 13);
        charIndexMap.put('o', 14);
        charIndexMap.put('p', 15);
        charIndexMap.put('q', 16);
        charIndexMap.put('r', 17);
        charIndexMap.put('s', 18);
        charIndexMap.put('t', 19);
        charIndexMap.put('u', 20);
        charIndexMap.put('v', 21);
        charIndexMap.put('w', 22);
        charIndexMap.put('x', 23);
        charIndexMap.put('y', 24);
        charIndexMap.put('z', 25);
    }
}
