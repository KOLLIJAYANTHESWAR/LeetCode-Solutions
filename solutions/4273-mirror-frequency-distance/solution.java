class Solution {
    public int find(String s){
        int[] countArr = new int[36];
        
        for(char ch : s.toCharArray()){
            countArr[mapIndex(ch)]++;
        }
        
        boolean[] usedFlag = new boolean[36];
        int result = 0;
        
        for(char ch : s.toCharArray()){
            int currentIndex = mapIndex(ch);
            if (usedFlag[currentIndex]) continue;
            
            char mirrorChar = getMirror(ch);
            int mirrorIndex = mapIndex(mirrorChar);
            
            result += Math.abs(countArr[currentIndex] - countArr[mirrorIndex]);
            
            usedFlag[currentIndex] = true;
            usedFlag[mirrorIndex] = true;
        }
        return result;
    }
    public int mirrorFrequency(String s){
        int result=find(s);
        return result;
    }
    
    private int mapIndex(char ch){
        if (Character.isLetter(ch)) return ch - 'a';
        return 26 + (ch - '0');
    }
    
    private char getMirror(char ch){
        if (Character.isLetter(ch)) return (char) ('a' + ('z' - ch));
        return (char) ('0' + ('9' - ch));
    }
}
