class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int a[] = new int[n];
        a[0]=nums[0];
        int j=1;
        for(int i=1;i<n;i++){
            if(nums[i-1]!=nums[i]){
                a[j++]=nums[i];
            }
        }
        int size = Math.min(j,k);
        int fin[] = new int[size];
        int l = 0;
        for(int i= j-1;i>=j-size;i--){
            fin[l++]=a[i];
        }
        return fin;
    }
}
