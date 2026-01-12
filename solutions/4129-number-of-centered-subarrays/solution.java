class Solution {
    public int centeredSubarrays(int[] nums) {
        int n = nums.length;
        int sub = 0;
        
        for(int i=0;i<n;i++){
            int sum =0;
            for(int j=i;j<n;j++){
                sum +=nums[j];
                if(isexist(sum, nums, i,j)){
                    sub++;
                }
            }
        }
        return sub;
    }
    public static boolean isexist(int n, int[] a, int start, int end){
        for(int i=start;i<=end;i++){
            if(a[i]==n){
                return true;
            }
        }
        return false;
    }
}
