class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length, r=0;
        for(int i=0;i<n;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                r=nums[i];
                break;
            }
        }
        return r;
    }
}
