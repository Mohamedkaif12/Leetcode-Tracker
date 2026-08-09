// Last updated: 8/10/2026, 1:45:17 AM
1class Solution {
2    public int maximalSquare(char[][] matrix) {
3
4        if (matrix.length == 0) {
5            return 0;
6        }
7
8        int rows = matrix.length;
9        int cols = matrix[0].length;
10
11        int[][] dp = new int[rows + 1][cols + 1];
12
13        int max = 0;
14
15        for (int i = 1; i <= rows; i++) {
16
17            for (int j = 1; j <= cols; j++) {
18
19                if (matrix[i - 1][j - 1] == '1') {
20
21                    dp[i][j] = 1 + Math.min(
22                            dp[i - 1][j],
23                            Math.min(
24                                    dp[i][j - 1],
25                                    dp[i - 1][j - 1]
26                            )
27                    );
28
29                    max = Math.max(max, dp[i][j]);
30                }
31            }
32        }
33
34        return max * max;
35    }
36}