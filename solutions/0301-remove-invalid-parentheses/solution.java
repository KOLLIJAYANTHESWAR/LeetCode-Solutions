class Solution {
    Set<String> result = new HashSet<>();

    public List<String> removeInvalidParentheses(String s) {

        int left = 0;
        int right = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                left++;
            } 
            else if(ch == ')'){
                if(left >0){
                    left--;
                } 
                else{
                    right++;
                }
            }
        }

        backtrack(s, 0, left,right, 0, new StringBuilder());

        return new ArrayList<>(result);
    }

    private void backtrack(String s, int idx, int left, int right, int open,
    StringBuilder curr) {
        if(idx == s.length()){

            if(left== 0 && right== 0 && open ==0){
                result.add(curr.toString());
            }
            return;
        }
        char ch = s.charAt(idx);
        if(ch== '(' && left> 0){

            backtrack(s,idx + 1,left - 1,right, open, curr);
        }
        if(ch == ')' &&right>0){

            backtrack(s,idx + 1,left,right-1,open, curr);
        }
        curr.append(ch);

        if(ch=='('){ 
            backtrack(s,idx + 1,left,right,open + 1,curr);

        } 

        else if(ch== ')'){
            if(open>0){
                backtrack(s,idx+ 1,left,right, open-1, curr);
            }
        } 
        else{
            backtrack(s,idx+1, left, right,open,curr);
        }
        curr.deleteCharAt(curr.length()-1);
    }
}
