// Last updated: 9/22/2026, 9:23:19 AM
1class Solution {
2    public int minPatches(int[] nums, int n) {
3        long miss = 1;
4        int i = 0;
5        int patches = 0;
6
7        while (miss <= n) {
8            if (i < nums.length && nums[i] <= miss) {
9                miss += nums[i];
10                i++;
11            } else {
12                miss += miss;
13                patches++;
14            }
15        }
16
17        return patches;
18    }
19}