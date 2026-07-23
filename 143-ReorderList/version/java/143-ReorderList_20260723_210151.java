// Last updated: 7/23/2026, 9:01:51 PM
1class Solution {
2    public int findMin(int[] nums) {
3
4        int left = 0;
5        int right = nums.length - 1;
6
7        while (left < right) {
8
9            int mid = left + (right - left) / 2;
10
11            if (nums[mid] > nums[right])
12                left = mid + 1;
13            else if (nums[mid] < nums[right])
14                right = mid;
15            else
16                right--;
17        }
18
19        return nums[left];
20    }
21}