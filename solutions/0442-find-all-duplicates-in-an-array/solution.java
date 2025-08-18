class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> dup = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();
        Set<Integer> added = new HashSet<>();

        for(int i : nums){
            if(seen.contains(i)){
                if(!added.contains(i)){
                    added.add(i);
                    dup.add(i);
                }
            }
            else{
                seen.add(i);
            }
        }
        return dup;
    }
}
