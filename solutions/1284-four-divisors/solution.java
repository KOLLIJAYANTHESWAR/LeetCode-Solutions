class Solution {
    public int sumFourDivisors(int[] nums) {
        int n = nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            count+=find(nums[i]);
        }
        return count;
    }
    public static int find(int a){
        int count=0,r=0;
        for(int i=1;i*i<=a;i++){
            if(a%i==0){
                int d1=i;
                int d2=a/i;
                if(d1==d2){
                    count++;
                    r+=d1;
                }
                else{
                    count+=2;
                    r+=d1+d2;
                }
            }
            if(count>4){
                return 0;
            }
        }
        return count==4?r:0;
    } 
}
