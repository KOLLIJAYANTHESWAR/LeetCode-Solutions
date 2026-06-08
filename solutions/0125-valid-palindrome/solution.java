class Solution {
    public boolean isPalindrome(String s) {
        char ch[] = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int n = ch.length;
        for(char i:ch){
            if(Character.isLetterOrDigit(i)){
                sb.append(Character.toLowerCase(i));
            }
        }
        String s1=sb.toString();
        String s2=new StringBuilder(s1).reverse().toString();
        return s1.equals(s2);
    }
}
