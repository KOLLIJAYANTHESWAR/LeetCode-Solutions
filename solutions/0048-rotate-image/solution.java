class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int a[][] =  new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j] = matrix[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[j][n - 1 - i] = a[i][j];
            }
        }
    }
}
