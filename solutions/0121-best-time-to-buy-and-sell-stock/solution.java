class Solution {
    public int maxProfit(int[] a) {
        int n = a.length;
        int buy=Integer.MAX_VALUE;
        int max=0;
        for(int i=0;i<n;i++){
            if(buy<a[i]){
                max= Math.max(max,a[i]-buy);
            }
            else{
                buy=a[i];
            }
        }
        return max;
    }
}
