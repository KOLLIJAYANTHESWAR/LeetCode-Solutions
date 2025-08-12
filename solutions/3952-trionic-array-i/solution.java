class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;boolean is= false;int i =0;
        if(n<3){
            return false;
        }
        while(i<n-1&&nums[i]<nums[i+1]){
            i++;
        }
        if(i==0 || i==n-1){
            return false;
        }
        while(i<n-1 && nums[i]>nums[i+1]){
            i++;
        }
        if(i==n-1){
            return false;
        }
        while(i<n-1&&nums[i]<nums[i+1]){
            i++;
        }

        return i==n-1;
        
        }
    }
