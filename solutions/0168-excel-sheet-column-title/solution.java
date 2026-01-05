class Solution {
    public String convertToTitle(int n) {
        if(n<=26){
            return String.valueOf((char)('A'+n-1));
        }
        StringBuilder sb = new StringBuilder();
        while(n>0){
            n--;
            char result = (char)((n%26)+'A');
            sb.append(result);
            n/=26;
        }
        return sb.reverse().toString();

    }
}
