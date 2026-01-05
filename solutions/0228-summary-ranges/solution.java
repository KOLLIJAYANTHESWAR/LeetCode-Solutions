class Solution {
    public List<String> summaryRanges(int[] nums) {
        int n = nums.length;
        List<String> list = new ArrayList<>();
        int first =0;
        for(int end =0;end<n;end++){
            if(end==n-1 || nums[end]+1 != nums[end+1]){
                if(first==end){
                    list.add(String.valueOf(nums[first]));
                }
                else{
                    list.add(nums[first] + "->"+ nums[end]);
                }
                first = end+1;
            }
            
        }
        return list;
    }
}
