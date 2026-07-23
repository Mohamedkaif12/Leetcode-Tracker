// Last updated: 7/23/2026, 8:57:27 PM
1class Solution {
2    public boolean wordBreak(String s, List<String> wordDict) {
3
4        Set<String> set = new HashSet<>(wordDict);
5        boolean[] dp = new boolean[s.length() + 1];
6
7        dp[0] = true;
8
9        for (int i = 1; i <= s.length(); i++) {
10
11            for (int j = 0; j < i; j++) {
12
13                if (dp[j] && set.contains(s.substring(j, i))) {
14                    dp[i] = true;
15                    break;
16                }
17            }
18        }
19
20        return dp[s.length()];
21    }
22}