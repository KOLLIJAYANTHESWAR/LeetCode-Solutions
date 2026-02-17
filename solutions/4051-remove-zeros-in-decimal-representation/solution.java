class Solution {
    public long removeZeros(long n) {
        long i=1;
        long sum=0, last;
        while(n>0){
            last=n%10;
            if(last!=0){
                sum=i*last+sum;
                i*=10;
               
            } 
            n/=10;
        }
        return sum;
    }
}
