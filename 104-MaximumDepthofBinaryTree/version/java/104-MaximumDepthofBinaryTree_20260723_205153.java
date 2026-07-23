// Last updated: 7/23/2026, 8:51:53 PM
1// 114. Flatten Binary Tree to Linked List
2class Solution {
3
4    TreeNode prev = null;
5
6    public void flatten(TreeNode root) {
7
8        if (root == null)
9            return;
10
11        flatten(root.right);
12        flatten(root.left);
13
14        root.right = prev;
15        root.left = null;
16        prev = root;
17    }
18}