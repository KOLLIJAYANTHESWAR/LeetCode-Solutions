class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int[] result = new int[m + n]; // Create a temporary array to store the result
        int i = 0, j = 0, k = 0; // Initialize pointers for nums1, nums2, and result

     
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                result[k] = nums1[i];
                i++;
            } else {
                result[k] = nums2[j];
                j++;
            }
            k++;
        }

      
        while (i < m) {
            result[k] = nums1[i];
            i++;
            k++;
        }

     
        while (j < n) {
            result[k] = nums2[j];
            j++;
            k++;
        }


        for (int x = 0; x < m + n; x++) {
            nums1[x] = result[x];
        }

       
        System.out.println(Arrays.toString(nums1));
    }
}
