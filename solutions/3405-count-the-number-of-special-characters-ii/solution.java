class Solution {
    public int numberOfSpecialChars(String word) {
        int Count=0;
        for(char ch = 'a';ch<='z';ch++){
            if(word.indexOf(ch) != -1 && word.indexOf(Character.toUpperCase(ch))!=-1){
                if(word.lastIndexOf(ch) <  word.indexOf(Character.toUpperCase(ch))){
                    Count++;
                }
            }
        }
        return Count;
        
    }
}
