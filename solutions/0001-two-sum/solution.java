class Solution {
    public int[] twoSum(int[] nums, int tar) {
       HashMap<Integer, Integer> map=new HashMap<>();
       for(int i=0;i<nums.length;i++){
        int need=tar-nums[i];
        if(map.containsKey(need)){
            return new int[]{map.get(need), i};
        }
        map.put(nums[i],i);
       }
        return new int[]{};
    }
}
