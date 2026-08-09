// Last updated: 8/10/2026, 1:49:06 AM
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3
4        int n = nums.length;
5        int[] result = new int[n];
6
7        result[0] = 1;
8
9        // Prefix products
10        for (int i = 1; i < n; i++) {
11            result[i] = result[i - 1] * nums[i - 1];
12        }
13
14        // Suffix products
15        int suffix = 1;
16
17        for (int i = n - 1; i >= 0; i--) {
18
19            result[i] *= suffix;
20
21            suffix *= nums[i];
22        }
23
24        return result;
25    }
26}