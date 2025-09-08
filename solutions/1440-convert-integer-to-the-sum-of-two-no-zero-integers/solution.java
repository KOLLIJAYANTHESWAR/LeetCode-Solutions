class Solution {
    public int[] getNoZeroIntegers(int n) {
        for(int a=1;a<n;a++){
          int b = n-a;
          if(isnonzero(a) && isnonzero(b)){
            return new int[]{a,b};
          }
        }
        return null;
    }
    static boolean isnonzero(int nums){
        while(nums>0){
        if(nums%10 == 0){
            return false;  
        }
        nums /= 10;
        }
        return true;
    }
}
