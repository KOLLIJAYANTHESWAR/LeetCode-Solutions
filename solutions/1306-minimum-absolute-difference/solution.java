class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<n-1;i++){
            if(min>arr[i+1]-arr[i]){
                min=arr[i+1]-arr[i];
            }
        }
        for(int i=0;i<n-1;i++){
           if(min == arr[i+1]-arr[i]){
                list.add(Arrays.asList(arr[i],arr[i+1]));
            }
        }
        return list;
    }
}
