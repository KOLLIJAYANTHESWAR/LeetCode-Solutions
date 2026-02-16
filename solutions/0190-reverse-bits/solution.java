class Solution {
    public int reverseBits(int n) {
        int result=0;
        for(int i=31;i>=0;i--){
            if((n&1)!=0){
                result +=(1L<<i);
            }
            n>>=1;
        }
        return result;
    }
}
