class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int a[]=new int[26];
        for(char i:magazine.toCharArray()){
            a[i-'a']++;
        }
        for(char i:ransomNote.toCharArray()){
            a[i-'a']--;
            if(a[i-'a']<0){
                return false;
            }
        }
        return true;
    }
}
