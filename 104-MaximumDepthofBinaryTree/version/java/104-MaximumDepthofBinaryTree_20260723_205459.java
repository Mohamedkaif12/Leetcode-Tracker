// Last updated: 7/23/2026, 8:54:59 PM
1class Solution {
2
3    public int minCut(String s) {
4
5        int n = s.length();
6
7        boolean[][] pal = new boolean[n][n];
8        int[] dp = new int[n];
9
10        for (int i = 0; i < n; i++)
11            dp[i] = i;
12
13        for (int end = 0; end < n; end++) {
14
15            for (int start = 0; start <= end; start++) {
16
17                if (s.charAt(start) == s.charAt(end) &&
18                        (end - start <= 2 || pal[start + 1][end - 1])) {
19
20                    pal[start][end] = true;
21
22                    if (start == 0)
23                        dp[end] = 0;
24                    else
25                        dp[end] = Math.min(dp[end], dp[start - 1] + 1);
26                }
27            }
28        }
29
30        return dp[n - 1];
31    }
32}