// Last updated: 7/23/2026, 8:56:10 PM
1class Solution {
2    public int singleNumber(int[] nums) {
3
4        int ones = 0;
5        int twos = 0;
6
7        for (int num : nums) {
8
9            ones = (ones ^ num) & ~twos;
10            twos = (twos ^ num) & ~ones;
11        }
12
13        return ones;
14    }
15}