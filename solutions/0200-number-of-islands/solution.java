class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count=0;
        boolean vis[][] = new boolean[n][m]; 
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1' && !vis[i][j]){
                    count++;
                    dfs(i,j,grid,vis);
                }
            }
        }
            return count;
    }
        private static void dfs(int i, int j, char[][] arr, boolean vis[][]){
            int n =arr.length;
            int m = arr[0].length;
            if(i<0||i>=n||j<0||j>=m||vis[i][j]||arr[i][j]=='0'){
                return;
            }
            vis[i][j]=true;
            dfs(i-1,j,arr,vis);
            dfs(i+1,j,arr,vis);
            dfs(i,j-1,arr,vis);
            dfs(i,j+1,arr,vis);
        }
}

