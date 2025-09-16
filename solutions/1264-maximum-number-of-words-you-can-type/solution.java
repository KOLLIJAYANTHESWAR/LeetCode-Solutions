class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        int a = 0;
        for(String word : words){
            boolean is = true;
            for(char ch : word.toCharArray()){
                if(brokenLetters.indexOf(ch)!=-1){
                    is = false;
                    break;
                }
            }
            if(is){
                a++;
            }
        }
        return a;
    }
}
