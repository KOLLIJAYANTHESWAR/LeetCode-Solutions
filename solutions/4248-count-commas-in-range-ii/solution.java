class Solution {
    public long countCommas(long n) {
        long max = find(n);
        return max;
    }
    public static long find(long n){
        long c=0;
        for(int d=4;d<=16;d++){
            long start = (long)Math.pow(10,d-1);
            if(start>n){
                break;
            }
            long end = Math.min(n,(long)Math.pow(10,d)-1);
            long sum = end-start+1;
            long comm = (d-1)/3;
            c+=sum*comm;
        }
        return c;
    }
}
