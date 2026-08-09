// Last updated: 8/10/2026, 1:42:01 AM
1class Solution {
2    public int minSubArrayLen(int target, int[] nums) {
3
4        int left = 0;
5        int sum = 0;
6        int minLength = Integer.MAX_VALUE;
7
8        for (int right = 0; right < nums.length; right++) {
9
10            sum += nums[right];
11
12            while (sum >= target) {
13
14                minLength = Math.min(
15                    minLength,
16                    right - left + 1
17                );
18
19                sum -= nums[left];
20                left++;
21            }
22        }
23
24        return minLength == Integer.MAX_VALUE
25                ? 0
26                : minLength;
27    }
28}