class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        // Start by assuming the entire first string is the common prefix
        String prefix = strs[0];
        
        // Compare the prefix with every string in the array
        for (int i = 1; i < strs.length; i++) {
            // Reduce the prefix length while it doesn't match the current string
            while (strs[i].indexOf(prefix) != 0) {
                // Shorten the prefix
                prefix = prefix.substring(0, prefix.length() - 1);
                
                // If prefix becomes empty, return ""
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        
        // Return the longest common prefix found
        return prefix;
        }
        
    }

