class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int a = rev(x);
        if(x==a){
            return true;
        }
        return false;
    }
    public int rev(int a){
        int sum=0;
        while(a>0){
            int n=a%10;
            sum = (sum*10+n);
            a/=10;
        }
        return sum;
    }
}
