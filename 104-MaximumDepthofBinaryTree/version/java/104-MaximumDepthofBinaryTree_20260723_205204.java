// Last updated: 7/23/2026, 8:52:04 PM
1// 115. Distinct Subsequences
2class Solution {
3    public int numDistinct(String s, String t) {
4
5        int m = s.length();
6        int n = t.length();
7
8        int[][] dp = new int[m + 1][n + 1];
9
10        for (int i = 0; i <= m; i++)
11            dp[i][0] = 1;
12
13        for (int i = 1; i <= m; i++) {
14            for (int j = 1; j <= n; j++) {
15                if (s.charAt(i - 1) == t.charAt(j - 1))
16                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
17                else
18                    dp[i][j] = dp[i - 1][j];
19            }
20        }
21
22        return dp[m][n];
23    }
24}