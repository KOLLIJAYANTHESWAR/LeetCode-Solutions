class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int result[] = new int[n];
        for(int i=0;i<n;i++){
            int idx=(i+nums[i])%n;
            result[i]=nums[idx<0?idx+n:idx];
        }
        return result;
    }
}
