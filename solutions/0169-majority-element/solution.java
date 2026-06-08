class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int max=Integer.MIN_VALUE;
        int ele=0;
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            int val=e.getKey();
            int freq=e.getValue();
            if(max<freq){
                ele=val;
                max=freq;
            }
        }
        return ele;
    }
}
