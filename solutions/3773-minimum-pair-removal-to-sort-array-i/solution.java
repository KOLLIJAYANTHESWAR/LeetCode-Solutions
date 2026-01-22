class Solution {
    public int minimumPairRemoval(int[] nums) {
        int n = nums.length;
        if(issorted(nums)){
            return 0;
        }
        List<Integer> list = new ArrayList<>();
        for(int i: nums){
            list.add(i);
        }
        
        int f=0,count=0;
        while(!issorted(list.stream()
                        .mapToInt(Integer::intValue)
                        .toArray())){
        int min = Integer.MAX_VALUE;
        for(int i=1;i<list.size();i++){
            int sum = list.get(i-1)+list.get(i);
            if(sum<min){
                min=sum;
                f=i-1;
            }
        }
        list.remove(f);
        list.remove(f);
        list.add(f,min);
        count++;
        }
        return count;
    }
    public static boolean issorted(int[] a){
        for(int i=1;i<a.length;i++){
            if(a[i-1]>a[i]){
                return false;
            }
        }
        return true;
    }
}
