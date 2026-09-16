// Last updated: 9/16/2026, 9:09:33 AM
1class Solution {
2    public boolean isPowerOfThree(int n) {
3        if (n <= 0) {
4            return false;
5        }
6
7        while (n % 3 == 0) {
8            n = n / 3;
9        }
10
11        return n == 1;
12    }
13}