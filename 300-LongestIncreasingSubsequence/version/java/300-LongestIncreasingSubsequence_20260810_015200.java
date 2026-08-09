// Last updated: 8/10/2026, 1:52:00 AM
1class Solution {
2    public int lengthOfLIS(int[] nums) {
3
4        int n = nums.length;
5        int[] dp = new int[n];
6
7        Arrays.fill(dp, 1);
8
9        int answer = 1;
10
11        for (int i = 0; i < n; i++) {
12
13            for (int j = 0; j < i; j++) {
14
15                if (nums[j] < nums[i]) {
16                    dp[i] = Math.max(
17                        dp[i],
18                        dp[j] + 1
19                    );
20                }
21            }
22
23            answer = Math.max(answer, dp[i]);
24        }
25
26        return answer;
27    }
28}