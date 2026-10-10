class Solution {
    public static int gcd(int a, int b){
        while(b!=0){
            int temp=a%b;
            a=b;
            b=temp;
        }
        return a;
    }
    public int resilientSubarray(int[] nums, int k) {
        return find(nums,k);
    }
    public static int find(int arr[], int k){
        int brr[] = arr;
        int n = arr.length;
        int ans=1;
        for(int i=0;i<n;){
            int out=brr[i]%k;
            int j=i;
            while(j<n && brr[j]%k==out){
                j++;
            }
            int len =j-i;
            if(out==0){
                ans=Math.max(ans,len);
            }
            else{
                int p=k/gcd(k,out);
                int can=(len/p)*p+1;
                if(can>len){
                    can-=p;
                }
                ans=Math.max(ans,can);
            }
            i=j;
        }
        return ans;
    }
}
