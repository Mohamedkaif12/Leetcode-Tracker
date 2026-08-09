// Last updated: 8/10/2026, 1:45:08 AM
1class Solution {
2    public boolean containsNearbyAlmostDuplicate(
3            int[] nums,
4            int indexDiff,
5            int valueDiff) {
6
7        TreeSet<Long> set = new TreeSet<>();
8
9        for (int i = 0; i < nums.length; i++) {
10
11            long num = nums[i];
12
13            Long ceiling = set.ceiling(num);
14
15            if (ceiling != null &&
16                ceiling - num <= valueDiff) {
17                return true;
18            }
19
20            Long floor = set.floor(num);
21
22            if (floor != null &&
23                num - floor <= valueDiff) {
24                return true;
25            }
26
27            set.add(num);
28
29            if (set.size() > indexDiff) {
30                set.remove((long) nums[i - indexDiff]);
31            }
32        }
33
34        return false;
35    }
36}