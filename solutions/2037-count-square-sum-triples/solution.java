class Solution {
    public int countTriples(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                int cs = i*i + j*j;
                int c = (int)Math.sqrt(cs);

                if(c*c == cs && c <= n){
                    count++;
                }
            }
        }
        return count;
    }
}
