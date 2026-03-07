class Solution {
    public int minFlips(String s) {
        int n = s.length();
        String s2 = s + s;

        int diff1 = 0, diff2 = 0;
        int ans = Integer.MAX_VALUE;

        for(int i =0;i<s2.length();i++){
            char exp1 = (i%2 ==0) ? '0' : '1';
            char exp2 = (i%2== 0) ? '1' : '0';

            if(s2.charAt(i)!=exp1){
                diff1++;
            } 
            if(s2.charAt(i)!=exp2){
                diff2++;
            }
            if(i>=n){
                char prev = s2.charAt(i-n);

                char pexp1 =((i-n)%2==0)?'0':'1';
                char pexp2 =((i-n)%2==0)?'1':'0';

                if(prev!=pexp1){ 
                    diff1--;
                }
                if(prev!=pexp2){
                    diff2--;
                }
            }

            if(i>= n-1) {
                ans =Math.min(ans, Math.min(diff1, diff2));
            }
        }

        return ans;

    }
}
