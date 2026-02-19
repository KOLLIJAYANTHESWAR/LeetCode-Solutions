class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()<=1){
            return true;
        }
        s=s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                sb.append(ch);
            }
        }
        String o=sb.toString();
        String rev = new StringBuilder(o).reverse().toString();

        if(o.equals(rev)){
            return true;
        }
        return false;
    }
}
