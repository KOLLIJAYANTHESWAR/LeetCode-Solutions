class Solution {
    public int minSteps(String s, String t) {
        int ch[] = new int[26];
        for(char c : s.toCharArray()){
            ch[c - 'a']++;
        }
        for(char c : t.toCharArray()){
            ch[c - 'a']--;
        }
        int total =0;
        for(int i : ch){
            total+=Math.abs(i);
        }
        return total;
    }
}
