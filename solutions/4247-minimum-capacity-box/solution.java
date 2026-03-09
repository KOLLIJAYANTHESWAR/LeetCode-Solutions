class Solution {
    public int minimumIndex(int[] arr, int itemSize) {
        int min=Integer.MAX_VALUE, idx=-1;
        for(int i=0;i<arr.length;i++){
            if(min>arr[i] && arr[i]>itemSize){
                min=arr[i];
                idx=i;
            }
            if(arr[i]==itemSize){
                return i;
            }
        }
        return idx;
    }
}
