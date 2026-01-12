class Solution {
    public int maxProfit(int[] a) {
        int buy1 = Integer.MIN_VALUE, buy2 = Integer.MIN_VALUE;
        int sell1 =0,sell2=0;
        for(int i: a){
            buy1 = Math.max(buy1,-i);
            sell1= Math.max(sell1, buy1+i);
            buy2 = Math.max(buy2, sell1-i);
            sell2 = Math.max(sell2, buy2+i);
        }
        return sell2;
    }
}
