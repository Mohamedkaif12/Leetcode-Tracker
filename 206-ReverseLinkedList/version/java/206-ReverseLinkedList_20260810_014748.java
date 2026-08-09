// Last updated: 8/10/2026, 1:47:48 AM
1class Solution {
2    public boolean isPowerOfTwo(int n) {
3        return n > 0 && (n & (n - 1)) == 0;
4    }
5}