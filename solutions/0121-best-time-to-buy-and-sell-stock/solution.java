class Solution {
    public int maxProfit(int[] arr) {
        int n=arr.length, minp=Integer.MAX_VALUE, maxp=0;
        for(int i:arr){
            minp=Math.min(minp,i);
            maxp=Math.max(maxp,(i-minp));

        }
        return maxp;
    }
}
