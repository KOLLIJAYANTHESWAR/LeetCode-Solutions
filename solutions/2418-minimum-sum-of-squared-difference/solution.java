class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        long op = (long) k1 + k2;
        int max = 0;
        int[] diff = new int[nums1.length];
        for(int i=0; i <nums1.length;i++){
            diff[i] = Math.abs(nums1[i] - nums2[i]);
            max = Math.max(max, diff[i]);
        }

        if(op>= Arrays.stream(diff).asLongStream().sum()){
            return 0;
        }

        int[] freq =new int[max+1];

        for(int d:diff) {
            freq[d]++;
        }

        for(int d =max;d>0&& op>0; d--){
            if(freq[d]==0){
                continue;
            }

            long count =Math.min(op, freq[d]);
            freq[d]-= (int) count;
            freq[d-1] +=(int) count;
            op -= count;
        }

        long ans = 0;

        for(int d=1;d<freq.length;d++){
            ans +=(long) d*d*freq[d];
        }
        return ans;
    }
}
