// Last updated: 8/10/2026, 1:46:28 AM
1class Solution {
2    public TreeNode invertTree(TreeNode root) {
3
4        if (root == null) {
5            return null;
6        }
7
8        TreeNode temp = root.left;
9
10        root.left = root.right;
11        root.right = temp;
12
13        invertTree(root.left);
14        invertTree(root.right);
15
16        return root;
17    }
18}