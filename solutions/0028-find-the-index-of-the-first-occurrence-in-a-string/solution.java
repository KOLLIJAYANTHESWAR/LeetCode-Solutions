class Solution {
    public int strStr(String haystack, String needle) {
        int n = needle.length();
        int m = haystack.length();
        
        // Edge case: if needle is empty, return 0
        if (n == 0) {
            return 0;
        }
        
        // If haystack length is smaller than needle length, return -1
        if (m < n) {
            return -1;
        }

        // Loop through the haystack and check if needle is a substring
        for (int i = 0; i <= m - n; i++) {
            // Check if the substring starting from i matches the needle
            if (haystack.substring(i, i + n).equals(needle)) {
                return i;
            }
        }

        // If needle is not found, return -1
        return -1;
    }
}

