class Solution {
    public int reverseBits(int n) {
        String binofn = String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');
        StringBuilder sb = new StringBuilder(binofn);int sum=0, p=0;
        sb.reverse();
        String s = sb.toString();
        for(int i = s.length()-1;i>=0;i--){
            if(s.charAt(i)=='1'){
                sum += Math.pow(2,p);
            }
            p++;
        }
        return sum;
    }
}
