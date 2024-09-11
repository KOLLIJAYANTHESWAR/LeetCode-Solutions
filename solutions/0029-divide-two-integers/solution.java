class Solution {
    public int divide(int dividend, int divisor) {
        // Handle overflow case
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE; // Clamp to Integer.MAX_VALUE
        }

        // Perform normal division
        return dividend / divisor;
    }
}

