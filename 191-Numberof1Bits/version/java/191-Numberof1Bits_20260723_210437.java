// Last updated: 7/23/2026, 9:04:37 PM
1public class Solution {
2    public int hammingWeight(int n) {
3
4        int count = 0;
5
6        while (n != 0) {
7
8            count += (n & 1);
9            n >>>= 1;
10        }
11
12        return count;
13    }
14}