class Solution {
    public int minSteps(String s, String t) {
        int n = s.length(), m = t.length();
        if(n!=m){
            return -1;
        }
        int[] ch = new int[26];
        for(int i=0;i<n;i++){
            ch[s.charAt(i)-'a']++;
            ch[t.charAt(i)-'a']--;
        }
        int total = 0;
        for(int i:ch){
            if(i>0){
                total+=i;
            }
        }
        return total;
    }
}
