// Last updated: 7/23/2026, 8:51:32 PM
1// 112. Path Sum
2class Solution {
3    public boolean hasPathSum(TreeNode root, int targetSum) {
4
5        if (root == null)
6            return false;
7
8        if (root.left == null && root.right == null)
9            return targetSum == root.val;
10
11        return hasPathSum(root.left, targetSum - root.val) ||
12               hasPathSum(root.right, targetSum - root.val);
13    }
14}