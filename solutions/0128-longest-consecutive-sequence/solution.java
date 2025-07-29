class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numset = new HashSet<>();
        for(int num : nums){
            numset.add(num);
        }
        int lon = 0;
        for(int num : numset){
            if(!numset.contains(num-1)){
                int count = num;
                int strik = 1;
                while(numset.contains(count+1)){
                    count++;
                    strik++;
                }

                lon = Math.max(lon,strik);
            }
        }
        return lon;
    }
}
