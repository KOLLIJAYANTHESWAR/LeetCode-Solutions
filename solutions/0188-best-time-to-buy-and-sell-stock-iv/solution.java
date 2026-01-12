class Solution {
    public int maxProfit(int k, int[] a) {
        int n = a.length;
        if(n==0||k==0){
            return 0;
        }
        if(k>=n/2){
            int max = 0;
            for(int i=1;i<n;i++){
                if(a[i]>a[i-1]){
                    max+=(a[i]-a[i-1]);
                }
            }
            return max;
        }
        int buy[] = new int[k+1];
        int sell[] = new int[k+1];
        for(int i=1;i<=k;i++){
            buy[i]=Integer.MIN_VALUE;
            sell[i]=0;
        }
        for(int l:a){
            for(int i=1;i<=k;i++){
                buy[i] = Math.max(buy[i],sell[i-1]-l);
                sell[i]= Math.max(sell[i],buy[i]+l);
            }
        }
        return sell[k];
    }
}
