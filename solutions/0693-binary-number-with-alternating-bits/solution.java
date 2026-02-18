class Solution {
    public boolean hasAlternatingBits(int n) {
        while(n!=0){
            int f = n&1;
            int s = ((n>>1)&1);
            if(f==s){
                return false;
            }
            n>>=1;
        }
        return true;
    }
}
