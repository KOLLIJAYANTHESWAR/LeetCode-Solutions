class Solution {
    public int countCommas(int n) {
        int max=find(n);
        return max;
    }
    public static int find(int n){
        return Math.max(0,n-999);
    }
}
