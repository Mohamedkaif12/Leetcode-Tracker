// Last updated: 8/10/2026, 1:44:23 AM
1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3
4        HashSet<Integer> set = new HashSet<>();
5
6        for (int num : nums) {
7
8            if (set.contains(num)) {
9                return true;
10            }
11
12            set.add(num);
13        }
14
15        return false;
16    }
17}