// Last updated: 7/9/2026, 3:05:55 PM
class Solution {

    public int numTrees(int n) {

        int[] dp = new int[n + 1];

        dp[0] = dp[1] = 1;

        for (int nodes = 2; nodes <= n; nodes++) {

            for (int root = 1; root <= nodes; root++) {

                dp[nodes] += dp[root - 1] * dp[nodes - root];
            }
        }

        return dp[n];
    }
}
