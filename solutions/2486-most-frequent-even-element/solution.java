class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            if(i%2==0){
                map.put(i, map.getOrDefault(i, 0)+1);
            }
        }
        int max = 0;
        int result=-1;
        for(int i:map.keySet()){
            int freq = map.get(i);
            if(freq>max||(freq==max && i<result)){
                max=freq;
                result=i;
            }
        }
        return result;
    }
}
