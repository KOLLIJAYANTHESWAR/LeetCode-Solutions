class Solution {
    public int findClosestNumber(int[] nums) {
        int n = nums.length;
        int close = nums[0];
        for(int i=0;i<n;i++){
            int crr = nums[i];
            if(Math.abs(crr) < Math.abs(close) || Math.abs(crr) == Math.abs(close) && crr > close){
                close = crr;
            }
        }
        return close;
    
 }
}
