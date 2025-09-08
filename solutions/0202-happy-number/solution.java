class Solution {
    public boolean isHappy(int n) {
        while (n!=0 && n!=4) {
            if(n == 1){
                return true;
            }
            n = sumdig(n);
        }
        return false;
    }
    public int sumdig(int n){
        int sum = 0;
        while (n > 0) {
                int x = n % 10;
                sum += x * x;
                n /= 10;
            }
            return sum;
    }
    
}
