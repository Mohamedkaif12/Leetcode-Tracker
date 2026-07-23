// Last updated: 7/23/2026, 8:51:23 PM
1// 111. Minimum Depth of Binary Tree
2class Solution {
3    public int minDepth(TreeNode root) {
4        if (root == null) return 0;
5
6        if (root.left == null)
7            return 1 + minDepth(root.right);
8
9        if (root.right == null)
10            return 1 + minDepth(root.left);
11
12        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
13    }
14}