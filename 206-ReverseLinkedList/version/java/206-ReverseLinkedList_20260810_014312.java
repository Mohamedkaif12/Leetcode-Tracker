// Last updated: 8/10/2026, 1:43:12 AM
1class Solution {
2    public int findKthLargest(int[] nums, int k) {
3
4        Arrays.sort(nums);
5
6        return nums[nums.length - k];
7    }
8}