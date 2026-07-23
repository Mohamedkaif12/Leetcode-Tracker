// Last updated: 7/23/2026, 8:54:25 PM
1class Solution {
2    public int longestConsecutive(int[] nums) {
3
4        Set<Integer> set = new HashSet<>();
5
6        for (int num : nums)
7            set.add(num);
8
9        int longest = 0;
10
11        for (int num : set) {
12
13            if (!set.contains(num - 1)) {
14
15                int current = num;
16                int length = 1;
17
18                while (set.contains(current + 1)) {
19                    current++;
20                    length++;
21                }
22
23                longest = Math.max(longest, length);
24            }
25        }
26
27        return longest;
28    }
29}