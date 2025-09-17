class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set = new TreeSet<Integer>();
        for(int i : nums){
            set.add(i);
        }
        int n = set.size();
        
        Integer a[] = set.toArray(new Integer[0]);
        if(n < 3){
            return a[n-1];
        }
        else{
            return a[n-3];
        }
    }
}
