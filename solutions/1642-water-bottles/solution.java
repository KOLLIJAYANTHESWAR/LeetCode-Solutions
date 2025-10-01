class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total = numBottles;
        while(numBottles >= numExchange){
            int r = numBottles/numExchange;
            total += r;
            int rem = numBottles%numExchange;
            numBottles = (r+rem);
        }
        return total;
    }
}
