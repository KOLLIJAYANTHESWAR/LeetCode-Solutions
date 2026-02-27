class Solution {
    public int binaryGap(int n) {
        String s= Integer.toBinaryString(n);
        int len = s.length();
        int max = 0;
        int prev=-1;
        for(int i=0;i<len;i++){
            char ch = s.charAt(i);
            if(ch=='1'){
                if(prev!=-1){
                    max=Math.max(max,i-prev);
                }
                prev=i;
            }
        }
        return max;
    }
}
