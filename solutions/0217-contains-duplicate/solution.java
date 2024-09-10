class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int d =0;
        for(int i=1;i<n;i++){
            if(nums[d] != nums[i]){
                d++;
            }
           else if(nums[d] == nums[i]){
            return true;
            
           }

        }
        return false;
    }
}
