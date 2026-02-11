class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        if(n<3){
            return false;
        }
        boolean incressing = false;
        boolean decressing = false;
        boolean incressing2= false;
        int p=0;
        int q=0;
        int in2=0;
        for(int i=0;i<n-1;i++){
            if(nums[i]<nums[i+1]){
                p=i+1;
                incressing=true;
            }
            else{
                break;
            }
        }
        if(!incressing){
            return false;
        }
        for(int i=p;i<n-1;i++){
            if(nums[i]>nums[i+1]){
                q=i+1;
                decressing=true;
            }
            else{
                break;
            }
        }
        if(!decressing){
            return false;
        }
        for(int i=q;i<n-1;i++){
            if(nums[i]<nums[i+1]){
                in2=i+1;
                incressing2=true;
            }
            else{
                break;
            }
        }
        if(!incressing2){
            return false;
        }
        return in2==n-1;
    }
}
