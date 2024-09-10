class Solution {
    public int searchInsert(int[] nums, int target) {
        int i=0;
        int n = nums.length;
        for(i=0;i<n;i++){
            if(nums[i]==target){
                break;
            }
            else if(nums[i] > target){
                
                break;
            }
        }
        
        return i;
    }
}
