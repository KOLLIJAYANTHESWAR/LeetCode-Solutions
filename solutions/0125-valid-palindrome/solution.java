class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String clean = s.replaceAll("[^a-zA-Z0-9]", "");
        String org = clean;
        String rev = new StringBuilder(clean).reverse().toString();

        if(org.equals(rev)){
            return true;
        }
        else{
            return false;
        }
            
        }
    
}
