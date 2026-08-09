// Last updated: 8/10/2026, 1:44:59 AM
1class Solution {
2    public boolean containsNearbyDuplicate(int[] nums, int k) {
3
4        HashSet<Integer> set = new HashSet<>();
5
6        for (int i = 0; i < nums.length; i++) {
7
8            if (set.contains(nums[i])) {
9                return true;
10            }
11
12            set.add(nums[i]);
13
14            if (set.size() > k) {
15                set.remove(nums[i - k]);
16            }
17        }
18
19        return false;
20    }
21}