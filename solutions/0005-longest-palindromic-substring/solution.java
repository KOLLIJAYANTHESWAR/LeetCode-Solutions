class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int start=0;
        int maxlen=1;
        for(int i=0;i<n;i++){
            int k=0;
            while((i-k)>=0&&(i+k)<n&&s.charAt(i-k)==s.charAt(i+k)){
                k++;
            }
            int len = 2*k-1;
            if(len>maxlen){
                maxlen=len;
                start=i-(k-1);
            }
        
            k=0;
            while((i-k)>=0&&(i+k+1)<n&&s.charAt(i-k)==s.charAt(i+k+1)){
                k++;
            }
            len=2*k;
            if(len>maxlen){
                maxlen=len;
                start=i-(k-1);
            }
        }
        return s.substring(start,start+maxlen);
    }
}
