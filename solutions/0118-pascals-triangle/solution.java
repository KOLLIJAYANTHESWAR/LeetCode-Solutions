class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            result.add(getRow(i));
        }
        return result;
    }
    public static List<Integer> getRow(int r){
        r+=1;
        List<Integer> list = new ArrayList<>();
        int val=1;
        list.add(1);
        for(int i=1;i<r;i++){
            val = val*(r-i)/i;
            list.add(val);
        }
        return list; 
    }
}
