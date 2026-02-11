class Solution {
    public int reverse(int x) {
        boolean n = false;
        if(x<0){
            n=true;
            if(x==Integer.MIN_VALUE)return 0;
            x=-x;
        }
        int sum =rev(x);
        if(sum==-1)return 0;
        return n?-sum:sum;
    }
    public static int rev(int x){
        int sum=0;
        while(x>0){
            int n = x%10;
            if(sum>(Integer.MAX_VALUE-n)/10)return -1;
            sum = sum*10+n;
            x/=10;
        }
        return sum;
    }
}
