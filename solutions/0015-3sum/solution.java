class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        int n = nums.length;
        
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++){
            int tar=-nums[i];
            int left = i+1, right=n-1;
            if(i>0&&nums[i]==nums[i-1])continue;
            while(left<right){
            int sum = nums[left]+nums[right];
            if(sum == tar){
                list.add(Arrays.asList(nums[left],nums[right],nums[i]));
                while(left<right&&nums[left]==nums[left+1])left++;
                while(left<right&&nums[right]==nums[right-1])right--;
                left++;
                right--;
            }
            else if(sum<tar){
                left++;
            }
            else{
                right--;
            }
        }       
        }
        return list;
    }
 
}
