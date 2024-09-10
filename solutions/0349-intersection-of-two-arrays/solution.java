import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // Use a HashSet to store the intersection elements
        Set<Integer> intersectionSet = new HashSet<>();

        // Sort both arrays
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        // Remove duplicates from nums1
        int uniqueIndex1 = 0;
        for (int i = 1; i < nums1.length; i++) {
            if (nums1[i] != nums1[uniqueIndex1]) {
                uniqueIndex1++;
                nums1[uniqueIndex1] = nums1[i];
            }
        }

        // Remove duplicates from nums2
        int uniqueIndex2 = 0;
        for (int i = 1; i < nums2.length; i++) {
            if (nums2[i] != nums2[uniqueIndex2]) {
                uniqueIndex2++;
                nums2[uniqueIndex2] = nums2[i];
            }
        }

        // Check for intersections and add them to the set
        int n = uniqueIndex1 + 1;
        int m = uniqueIndex2 + 1;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (nums2[i] == nums1[j]) {
                    intersectionSet.add(nums2[i]);  // Add the intersected element
                    break;  // Move to the next element once intersection is found
                }
            }
        }

        // Convert the result set to an array
        int[] result = new int[intersectionSet.size()];
        int idx = 0;
        for (int num : intersectionSet) {
            result[idx++] = num;
        }

        return result;  // Return the array of intersection elements
    }
}

