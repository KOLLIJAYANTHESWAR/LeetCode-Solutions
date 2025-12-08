class Solution {
    public int countOdds(int low, int high) {
        int count=0;
        if(low%2!=0 && high%2!=0){
            count = (int)((high-low)/2)+1;
            return count;
        }
        else{
            count = (int)((high-low)/2);
            if(low%2!=0){
                count++;
            }
            if(high%2!=0){
                count++;
            }
        }
        return count;
        
    }
}
