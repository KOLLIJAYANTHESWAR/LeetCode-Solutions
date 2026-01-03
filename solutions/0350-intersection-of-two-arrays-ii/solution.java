class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<Integer>();
        int i=0,j=0, n= nums1.length, m =nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while(i<n&&j<m){
            if(nums1[i]<nums2[j]){
                i++;
            }
            else if(nums2[j]<nums1[i]){
                j++;
            }
            else{
                list.add(nums1[i]);
                i++;j++;
            }
        }
        return list.stream().mapToInt(x->x).toArray();
    }
}
