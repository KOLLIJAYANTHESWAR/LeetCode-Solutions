class Solution {
    public String trimTrailingVowels(String s) {
        StringBuilder sb = new StringBuilder();
        int n= s.length();
        boolean is = true;
        for(int i=n-1;i>=0;i--){
            char ch = s.charAt(i);
            if(is && isvowel(s.charAt(i))){
                continue;
            }
            else{
                is=false;
                sb.append(s.charAt(i));
            }
        }
        return sb.reverse().toString();
    }
    public static boolean isvowel(char ch){
        return "aeiou".indexOf(ch)!=-1;
    }
}
