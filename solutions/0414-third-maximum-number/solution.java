class Solution {
    public int thirdMax(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        if(n<3){
            return nums[n-1];
        }

        List<Integer> listWithDuplicates = new ArrayList<>();
        for (int value : nums) {
            listWithDuplicates.add(value);
        }

        // Use a LinkedHashSet to remove duplicates while preserving order
        Set<Integer> set = new LinkedHashSet<>(listWithDuplicates);

        // Convert set back to array
        int[] a = new int[set.size()];
        int index = 0;
        for (int value : set) {
            a[index++] = value;
        }

        int m = a.length;

        if(m<3){
            return a[m-1];
        }

        return a[m-3];
    }
}
