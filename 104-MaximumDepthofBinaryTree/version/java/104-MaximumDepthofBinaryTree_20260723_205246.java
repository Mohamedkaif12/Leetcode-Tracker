// Last updated: 7/23/2026, 8:52:46 PM
1// 120. Triangle
2class Solution {
3    public int minimumTotal(List<List<Integer>> triangle) {
4
5        int n = triangle.size();
6        int[] dp = new int[n + 1];
7
8        for (int i = n - 1; i >= 0; i--) {
9
10            for (int j = 0; j <= i; j++) {
11                dp[j] = triangle.get(i).get(j) + Math.min(dp[j], dp[j + 1]);
12            }
13        }
14
15        return dp[0];
16    }
17}