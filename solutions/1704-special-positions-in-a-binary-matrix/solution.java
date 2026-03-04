class Solution {
    public int numSpecial(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        int noc[] = new int[col];
        int nor[] = new int[row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(mat[i][j]==1){
                    noc[j]++;
                    nor[i]++;
                }
            }
        }
        int count=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(mat[i][j]==1 && noc[j]==1 && nor[i]==1){
                    count++;
                }
            } 
        }
        return count;
    }
}
