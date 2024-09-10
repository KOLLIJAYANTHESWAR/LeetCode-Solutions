class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        // Traverse the array from the last digit (right to left)
        for (int i = n - 1; i >= 0; i--) {
            // If current digit is less than 9, simply add 1 and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // If current digit is 9, set it to 0 (carry over)
            digits[i] = 0;
        }
        
        // If we are here, it means all digits were 9 (e.g., 999 + 1 = 1000)
        // Create a new array with an additional digit
        int[] a = new int[n + 1];
        a[0] = 1; // Set the first element to 1, others default to 0
        return a;
       
    }
}
