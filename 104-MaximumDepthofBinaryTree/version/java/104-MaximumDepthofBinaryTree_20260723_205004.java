// Last updated: 7/23/2026, 8:50:04 PM
1// 104. Maximum Depth of Binary Tree
2class Solution {
3    public int maxDepth(TreeNode root) {
4        if (root == null) return 0;
5        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
6    }
7}