// Last updated: 8/28/2026, 10:19:23 AM
1class Solution {
2    public int firstMissingPositive(int[] nums) {
3        
4        int n = nums.length;
5
6        for (int i = 0; i < n; i++) {
7            
8            // Place each number in its correct position
9            while (nums[i] > 0 &&
10                   nums[i] <= n &&
11                   nums[nums[i] - 1] != nums[i]) {
12
13                int correctIndex = nums[i] - 1;
14
15                // Swap
16                int temp = nums[i];
17                nums[i] = nums[correctIndex];
18                nums[correctIndex] = temp;
19            }
20        }
21
22        // Find the first index where number is incorrect
23        for (int i = 0; i < n; i++) {
24            if (nums[i] != i + 1) {
25                return i + 1;
26            }
27        }
28
29        return n + 1;
30    }
31}