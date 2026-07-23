// Last updated: 7/23/2026, 9:01:35 PM
1class Solution {
2    public int maxProduct(int[] nums) {
3
4        int max = nums[0];
5        int min = nums[0];
6        int ans = nums[0];
7
8        for (int i = 1; i < nums.length; i++) {
9
10            if (nums[i] < 0) {
11                int temp = max;
12                max = min;
13                min = temp;
14            }
15
16            max = Math.max(nums[i], max * nums[i]);
17            min = Math.min(nums[i], min * nums[i]);
18
19            ans = Math.max(ans, max);
20        }
21
22        return ans;
23    }
24}