class Solution {
    public int minSwaps(int[][] grid) {
        int n = grid.length;
        int czero[] = new int[n];
        for(int i=0;i<n;i++){
            czero[i]= countZeros(grid[i]);
        }
        int out=0;
        for(int i=0;i<n;i++){
            int needed = n-i-1;
            int j=i;
            while(j<n && czero[j]<needed){
                j++;
            }
            if(n==j){
                return -1;
            }
            while(j>i){
                int temp = czero[j];
                czero[j]=czero[j-1];
                czero[j-1]=temp;
                out++;
                j--;
            }
        }
        return out;
    }
    public int countZeros(int []row){
        int n = row.length, count=0;
        for(int i=n-1;i>=0;i--){
            if(row[i]==0){
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }

}
