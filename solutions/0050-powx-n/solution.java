class Solution {
    public double myPow(double x, int n) {
        long m = n;
        double ans = 1.0;
        long temp = Math.abs(m);
        while(temp>0){
            if(temp%2==1){
                ans *= x;
                temp-=1; 
            }
            else{
                x *= x;
                temp/=2;
            }
        }
        if(m<0){
            return 1/ans;
        }
        return ans;
    }
}
