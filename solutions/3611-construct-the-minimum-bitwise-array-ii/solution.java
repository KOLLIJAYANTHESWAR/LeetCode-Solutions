class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int a[] = new int[nums.size()];
        for(int i=0;i<nums.size();i++){
            int x = nums.get(i);
            int temp=x;
            int t=0;
            while((temp&1)==1){
                t++;
                temp>>=1;
            }
            if(t==0){
                a[i]=-1;
            }
            else{
                a[i]=x-(1<<(t-1));
            }
        }
        return a;
    }
}
