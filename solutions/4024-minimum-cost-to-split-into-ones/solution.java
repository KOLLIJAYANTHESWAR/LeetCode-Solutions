class Solution {
    public int minCost(int n) {
        //return n*(n-1)/2;
        int count=0;
        while(n>1){
            count+=(n-1);
            n--;
        }
        return count;
    }
}
