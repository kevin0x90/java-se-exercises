public class Abbreviator {
    public String abbreviate(final String input, final int maxLength) {
        if (input.length() <= maxLength) {
           return input;
        }

        return input.substring(0, maxLength - 3) + "...";
    }
}
