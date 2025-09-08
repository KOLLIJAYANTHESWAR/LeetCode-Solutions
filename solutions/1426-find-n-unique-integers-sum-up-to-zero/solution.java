class Solution {
    public int[] sumZero(int n) {
        int a[] = new int[n];
        int sum = 0;
        for(int i=0;i<n-1;i++){
            a[i] = i+1;
            sum += a[i];
        }
        a[n-1] = 0-sum;

        return a;
    }
}
