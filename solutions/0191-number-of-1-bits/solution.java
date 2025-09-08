class Solution {
    public int hammingWeight(int n) {
        String s = Integer.toBinaryString(n);
        int t = s.length();
        int one = 0;
        for(int i=0;i<t;i++){
            char ch = s.charAt(i);
            if(ch == '1'){
                one++;
            }
        }
        return one;
    }
}
