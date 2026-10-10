class Solution {
    public int[] maxProductPair(int[] nums, int target) {
        return find(nums, target);
    }
    public static int[] find(int []nums, int tar){
        int max=Integer.MIN_VALUE;
        int arr[] = {-1,-1};
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j && nums[i]+nums[j]==tar && nums[i]>nums[j]){
                    int pro=nums[i]*nums[j];
                    if(pro>max){
                        max=pro;
                        arr[0]=i;
                        arr[1]=j;
                    }
                }
            }
        }
        return arr;
    }
}
