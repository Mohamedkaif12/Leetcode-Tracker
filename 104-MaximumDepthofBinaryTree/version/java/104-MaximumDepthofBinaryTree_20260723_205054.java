// Last updated: 7/23/2026, 8:50:54 PM
1// 108. Convert Sorted Array to Binary Search Tree
2class Solution {
3
4    public TreeNode sortedArrayToBST(int[] nums) {
5        return build(nums, 0, nums.length - 1);
6    }
7
8    private TreeNode build(int[] nums, int left, int right) {
9
10        if (left > right)
11            return null;
12
13        int mid = left + (right - left) / 2;
14
15        TreeNode root = new TreeNode(nums[mid]);
16
17        root.left = build(nums, left, mid - 1);
18        root.right = build(nums, mid + 1, right);
19
20        return root;
21    }
22}