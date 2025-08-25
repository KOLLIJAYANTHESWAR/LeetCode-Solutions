class Solution {
    public String reverseVowels(String s) {
        char a[] = new char[s.length()];
        int j=0;
        for(int i=s.length()-1;i>=0;i--){
            char ch = s.charAt(i);
            if(isvowel(ch)){
                a[j++] = ch;
            }
        }
        j=0;
        char c[] = s.toCharArray();
        for(int i=0;i<s.length();i++){
            
            if(isvowel(c[i])){
                c[i] = a[j++];
            }
        }
        return new String(c);
    }
    public static boolean isvowel(char ch){
        return "aeiouAEIOU".indexOf(ch) != -1;
    }
}
