class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        int in =0,side=0;
        int n = s.length();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch == '('){
                in++;
            }
            else{
                in--;
                if(s.charAt(i-1)=='('){
                    side += Math.pow(2,in);
                }
            }
        }
            return side;
    }

}
