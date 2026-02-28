class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        int n = list.size();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int min1 = list.get(i);
                int min2 = list.get(j);
                if(!map.get(min1).equals(map.get(min2))){
                    return new int[]{list.get(i), list.get(j)};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
