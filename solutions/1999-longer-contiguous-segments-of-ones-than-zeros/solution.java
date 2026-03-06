class Solution {
    public boolean checkZeroOnes(String s) {
        int n = s.length();
        int onemax=0,onelen=0;
        int zeromax=0,zerolen=0;
        boolean one=false,zero=false;
        for(char ch: s.toCharArray()){
            if(ch=='1'){
                onelen++;
                zeromax=Math.max(zerolen,zeromax);
                zerolen=0;
            }
            else{
                zerolen++;
                onemax=Math.max(onelen,onemax);
                onelen=0;
            }
        }
        onemax=Math.max(onelen,onemax);
        zeromax=Math.max(zerolen, zeromax);
        return (onemax>zeromax);
    }
}
