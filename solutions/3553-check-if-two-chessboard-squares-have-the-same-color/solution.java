class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        int c11 = coordinate1.charAt(0) - 'a' + 1;
        int c12 = coordinate1.charAt(1) - '0';
        int c21 = coordinate2.charAt(0) - 'a' + 1;
        int c22 = coordinate2.charAt(1) - '0';
        
        return (c11+c12)%2 == (c21+c22)%2;
    }
}
