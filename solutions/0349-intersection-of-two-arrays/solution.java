import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new TreeSet<Integer>();
        Set<Integer> set2 = new TreeSet<Integer>();

        for(int i: nums1){
            set1.add(i);
        }
        for(int i : nums2){
            if(set1.contains(i)){
                set2.add(i);
            }
        }
        int a[] = new int[set2.size()];
        int i = 0;
        for(int j : set2){
            a[i++] = j;
        }

        return a;
    }
}

