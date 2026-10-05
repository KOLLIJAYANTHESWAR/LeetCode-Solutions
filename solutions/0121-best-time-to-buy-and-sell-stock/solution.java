class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int max=0;
        int profit=0;
        int n=prices.length;
        for(int i=0;i<n;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            else{
                profit=prices[i]-min;
                max=Math.max(profit,max);
            }
        }
        return max;
    }
}
