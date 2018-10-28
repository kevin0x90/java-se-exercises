public class SpaceCompressor {
    public StringBuilder compressSpace(final StringBuilder input) {

        boolean previousWhitespace = false;
        for (int i = 0; i < input.length(); ++i) {

            if (Character.isWhitespace(input.charAt(i))) {
                if (previousWhitespace) {
                    input.deleteCharAt(i);
                    --i;
                } else {
                    previousWhitespace = true;
                }
            } else {
                previousWhitespace = false;
                if (input.charAt(i) == '\t') {
                    input.deleteCharAt(i);
                    --i;
                }
            }
        }

        return input;
    }
}
