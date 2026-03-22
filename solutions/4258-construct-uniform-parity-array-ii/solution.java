class Solution {
    public boolean uniformArray(int[] nums1) {
        boolean is = find(nums1);
        return is;
    }
    public static boolean find(int[] nums1){
        boolean isodd=false;
        boolean iseven = false;
        int min = Integer.MAX_VALUE;
        for(int i: nums1){
            min = Math.min(i,min);
            if(i%2==0){
                iseven = true;
            }
            else{
                isodd=true;
            }
        }
        if(!iseven || !isodd){
            return true;
        }
        if(min%2 ==1){
            return true;
        }
        return false;
        
    }
}
