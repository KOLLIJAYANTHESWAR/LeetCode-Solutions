class Solution {
    public int dominantIndices(int[] nums) {
        int n = nums.length,count=0;
        for(int i=0;i<n;i++){
            if(nums[i]>avg(i+1,nums)){
                count++;
            }
        }
        return count;
    }
    public static double avg(int idx, int[] a){
        int c=0;
        double sum=0;
        for(int i=idx;i<a.length;i++){
            sum+=a[i];
            c++;
        }
        return sum / c;
    }
}
