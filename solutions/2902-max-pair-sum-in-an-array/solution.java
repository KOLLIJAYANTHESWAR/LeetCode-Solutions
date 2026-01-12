class Solution {
    public static int maxdigit(int a){
        int max=0;
        a=Math.abs(a);
        while(a>0){
            int x = a%10;
            max=Math.max(max,x);
            a/=10;
        }
        return max;
    }
    public int maxSum(int[] nums) {
        int n=nums.length;
        int maxd[]=new int[n];
        for(int i=0;i<n;i++){
            maxd[i] = maxdigit(nums[i]);
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(maxd[i]==maxd[j]){
                    max=Math.max(max,nums[i]+nums[j]);
                }
            }
        }
        return max==Integer.MIN_VALUE?-1:max;
    }
}
