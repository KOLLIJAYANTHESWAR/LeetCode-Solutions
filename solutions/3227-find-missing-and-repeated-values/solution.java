class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        boolean seen[] = new boolean[n*n+1];
        int k=1, sum=0, requiredsum=0,fa=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                sum+=grid[i][j];
                if(seen[grid[i][j]]){
                    fa=grid[i][j];
                }
                seen[grid[i][j]]=true;
                requiredsum+= k++;
            }
        }
        //requiredsum like this also (n*n*(n*n+1))/2
        int b = requiredsum - (sum - fa);
        return new int[]{fa, b};
    }
}
