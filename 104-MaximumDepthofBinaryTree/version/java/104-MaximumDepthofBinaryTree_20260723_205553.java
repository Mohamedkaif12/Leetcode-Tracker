// Last updated: 7/23/2026, 8:55:53 PM
1class Solution {
2    public int singleNumber(int[] nums) {
3
4        int ans = 0;
5
6        for (int num : nums)
7            ans ^= num;
8
9        return ans;
10    }
11}