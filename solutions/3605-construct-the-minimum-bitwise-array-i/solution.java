class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int[] a = new int[nums.size()];
        int j=0;
        for(int i:nums){
            a[j++]=i;
        }
        for(int i=0;i<a.length;i++){
            a[i]=find(a[i]);
        }
        return a;
    }
    public static int find(int a){
        if(a==2){
            return -1;
        }
        for(int i=1;i<a;i++){
            if((i|(i+1))==a){
                return i;
            }
        }
        return 0;
    }
}
