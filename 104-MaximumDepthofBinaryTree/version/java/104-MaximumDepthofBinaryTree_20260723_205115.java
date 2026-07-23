// Last updated: 7/23/2026, 8:51:15 PM
1// 110. Balanced Binary Tree
2class Solution {
3    public boolean isBalanced(TreeNode root) {
4        return height(root) != -1;
5    }
6
7    private int height(TreeNode root) {
8        if (root == null) return 0;
9
10        int left = height(root.left);
11        if (left == -1) return -1;
12
13        int right = height(root.right);
14        if (right == -1) return -1;
15
16        if (Math.abs(left - right) > 1)
17            return -1;
18
19        return 1 + Math.max(left, right);
20    }
21}