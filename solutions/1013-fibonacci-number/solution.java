class Solution {
    public int fib(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int fo=0;
        int f1=1;
        int j=0;
        for(int i=2;i<=n;i++){
            j=fo+f1;
            fo=f1;
            f1=j;
        }
        return j;
    }
}
