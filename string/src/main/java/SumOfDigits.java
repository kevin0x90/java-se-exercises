public class SumOfDigits {
    public long calculateSum(final long input) {

        long result = 0;

        for (long remaining = input; remaining > 0; remaining /= 10L) {
            result += remaining % 10L;
        }

        return result;
    }

    public long calculateSum(final String input) {
        return calculateSum(Long.valueOf(input));
    }
}
