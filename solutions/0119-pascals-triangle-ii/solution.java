class Solution {
    public List<Integer> getRow(int r) {
      List<Integer> row = new ArrayList<>();
      r=r+1;
        long val = 1;
        row.add(1);

        for (int i = 1; i < r; i++) {
            val = val * (r - i) / i;
            row.add((int) val);
        }
        return row;
    }
}
