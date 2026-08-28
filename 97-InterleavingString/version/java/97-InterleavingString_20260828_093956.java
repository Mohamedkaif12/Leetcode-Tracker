// Last updated: 8/28/2026, 9:39:56 AM
1class Solution {
2    public int minDistance(String word1, String word2) {
3        
4        int m = word1.length();
5        int n = word2.length();
6
7        int[][] dp = new int[m + 1][n + 1];
8
9        // If word2 is empty, delete all characters from word1
10        for (int i = 0; i <= m; i++) {
11            dp[i][0] = i;
12        }
13
14        // If word1 is empty, insert all characters of word2
15        for (int j = 0; j <= n; j++) {
16            dp[0][j] = j;
17        }
18
19        for (int i = 1; i <= m; i++) {
20            for (int j = 1; j <= n; j++) {
21
22                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
23                    // Characters are same
24                    dp[i][j] = dp[i - 1][j - 1];
25                } else {
26                    // Insert, Delete, Replace
27                    dp[i][j] = 1 + Math.min(
28                        dp[i - 1][j - 1],
29                        Math.min(
30                            dp[i - 1][j],
31                            dp[i][j - 1]
32                        )
33                    );
34                }
35            }
36        }
37
38        return dp[m][n];
39    }
40}