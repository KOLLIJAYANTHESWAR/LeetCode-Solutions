class Solution {
    public int numberOfSpecialChars(String word) {
        int Count=0;
        for(char ch = 'a';ch<='z';ch++){
            if(word.indexOf(ch) != -1 && word.indexOf(Character.toUpperCase(ch))!=-1){
                Count++;
            }
        }
        return Count;
        
    }
}
