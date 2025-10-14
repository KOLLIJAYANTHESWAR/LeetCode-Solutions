class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n = nums.size();
        boolean first = false;
        boolean secound = false;
        for(int i=0;i<n;i++){
            first = check(nums,i,k,n);
            if(first){
                secound = check(nums, i+k,k,n);
            }
            if(first&&secound){
                return true;
            }
        }
        return false;
    }
    public static boolean check(List<Integer> nums,int index,int k, int n){
        boolean is = false;
        if(index+k > n){
            return false;
        }
        for(int i = index;i<index+k-1;i++){
            if(nums.get(i)>=nums.get(i+1)){
                return false;
            }
        }
        return true;
    }
}
