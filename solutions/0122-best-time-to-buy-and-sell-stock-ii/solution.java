class Solution {
    public int maxProfit(int[] a) {
        int n = a.length;
        int max =0;
        for(int i=1;i<n;i++){
            if(a[i-1]<a[i]){
                max = max+(a[i]-a[i-1]);
            }
        }
        return max;
    }
}
