class Solution {
    public int majorityElement(int[] nums) {
         HashMap<Integer, Integer> maj = new HashMap<>();
        int n = nums.length;
        int m = n / 2;

        for (int i : nums) {
            maj.put(i, maj.getOrDefault(i, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : maj.entrySet()) {
            if (entry.getValue() > m) {
                return entry.getKey();
            }
        }

        return -1;
    }
}
