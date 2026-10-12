class Solution {
    public int maxSum(List<Integer> nums, int k) {
        int[] cnt= new int[31];
        long mod= 1_000_000_007L;
        for(int x:nums){
            for(int b=0;b<31;b++){
                if((x&(1<<b))!=0){
                    cnt[b]++;
                }
            }
        }
        long sum = 0;
        while(k-- >0){
            long x = 0;

            for (int b=0;b<31;b++){
                if(cnt[b]>0){
                    x |=1L<<b;
                    cnt[b]--;
                }
            }

            sum =(sum+x*x) %mod;
        }
        return (int)sum;
    }
}
