class Solution {
    //not completely done by me
    //done after seeing the solution
    static final long MOD = 1_000_000_007L;

    public int sumCounts(int[] nums){
        int n = nums.length;
        int[] last =new int[100001];
        java.util.Arrays.fill(last,-1);

        SegTree tree = new SegTree(n);
        long ans = 0;
        for (int i = 0; i < n; i++) {
            int left = last[nums[i]] + 1;
            tree.update(1, 0, n - 1, left, i, 1);
            ans = (ans + tree.square[1]) % MOD;
            last[nums[i]] = i;
        }
        return (int) ans;
    }
    static class SegTree {
        long[] sum, square, lazy;
        int n;

        SegTree(int n) {
            this.n = n;
            sum = new long[4 * n];
            square = new long[4 * n];
            lazy = new long[4 * n];
        }

        void apply(int node, int l, int r, long val) {
            long len = r - l + 1L;

            square[node] = (square[node]
                    + 2 * val % MOD * sum[node] % MOD
                    + val * val % MOD * len % MOD) % MOD;

            sum[node] = (sum[node] + val * len) % MOD;
            lazy[node] = (lazy[node] + val) % MOD;
        }

        void push(int node, int l, int r) {
            if (lazy[node] == 0 || l == r) {
                return;
            }

            int mid = (l + r) / 2;
            apply(node * 2, l, mid, lazy[node]);
            apply(node * 2 + 1, mid + 1, r, lazy[node]);
            lazy[node] = 0;
        }

        void update(int node, int l, int r,
                    int ql, int qr, long val) {
            if (ql > r || qr < l) {
                return;
            }

            if (ql <= l && r <= qr) {
                apply(node, l, r, val);
                return;
            }

            push(node, l, r);

            int mid = (l + r) / 2;
            update(node * 2, l, mid, ql, qr, val);
            update(node * 2 + 1, mid + 1, r, ql, qr, val);

            sum[node] = (sum[node * 2] + sum[node * 2 + 1]) % MOD;
            square[node] =
                    (square[node * 2] + square[node * 2 + 1]) % MOD;
        }
    }
}
