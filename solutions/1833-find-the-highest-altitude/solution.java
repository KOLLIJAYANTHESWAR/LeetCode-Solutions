class Solution {
    public int largestAltitude(int[] gain) {
        int max = Integer.MIN_VALUE;
        int n = gain.length;
        int total=0;
        for(int i =0;i<n;i++){
            total= gain[i]+total;
            max= Math.max(max,total);  
        }
        return max<0?0:max;
    }
}
