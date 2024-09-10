class Solution {
    public boolean isPalindrome(int x) {
       String s = Integer.toString(x);
        StringBuffer s1 = new StringBuffer(s);

                s1.reverse();

       
            return s.equals(s1.toString());
        
        
        
  
    }
}
