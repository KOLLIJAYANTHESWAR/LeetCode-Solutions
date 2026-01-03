class Solution {
    public boolean isPowerOfFour(int n) {
        if(n>0&&(n&(n-1))==0){
            int count =0;
            while((n&1)==0){
                count++;
                n=n>>1;
            }
            if(count%2==0){
                return true;
            }
        }
        return false;
    }
}
