class Solution {
    public int minAddToMakeValid(String s) {
        int n = s.length(), open =0,ans=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                open++;
            }
            else{
                if(open>0){
                    open--;
                }
                else{
                    ans++;
                }
            }
        }
        return ans+open;
    }
}
