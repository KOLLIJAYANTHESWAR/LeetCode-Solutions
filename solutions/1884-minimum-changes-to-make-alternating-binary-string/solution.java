class Solution {
    public int minOperations(String s) {
        int odd=0,even=0;
        for(int i=0;i<s.length();i++){
            if(i%2==0){
                if(s.charAt(i)!= '0'){
                    odd++;
                }
                if(s.charAt(i)!='1'){
                    even++;
                }
            }
            else{
                if(s.charAt(i)!='1'){
                    odd++;
                }
                if(s.charAt(i)!='0'){
                    even++;
                }
            }
        }
        return Math.min(odd,even);
    }
}
