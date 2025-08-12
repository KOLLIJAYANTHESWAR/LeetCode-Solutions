class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        Set<Character> comp = new HashSet<Character>();
        for(char i : jewels.toCharArray()){
            comp.add(i);
        }
        for(char i : stones.toCharArray()){
            if(comp.contains(i)){
                count++;
            }
        }
        return count;
    }
}
