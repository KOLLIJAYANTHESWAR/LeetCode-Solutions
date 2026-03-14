class Solution {
    public long gcdSum(int[] nums) {
        int arr[] = nums;
        int n = nums.length;
        int brr[] = new int[n];
        int max = 0;
        for(int i=0;i<n;i++){
            max = Math.max(max,nums[i]);
            brr[i] = gcd(nums[i],max);
        }
        Arrays.sort(brr);
        long s=0;
        int l=0, m=n-1;
        while(l<m){
            s+=gcd(brr[l],brr[m]);
            l++;
            m--;
        }
        return s;
    }
    public int gcd(int a, int b){
        while(b!=0){
            int t= a%b;
            a=b;
            b=t;
        }
        return a;
    }
}
