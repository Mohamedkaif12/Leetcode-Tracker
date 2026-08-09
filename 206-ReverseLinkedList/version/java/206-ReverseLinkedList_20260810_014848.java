// Last updated: 8/10/2026, 1:48:48 AM
1class Solution {
2    public TreeNode lowestCommonAncestor(
3            TreeNode root,
4            TreeNode p,
5            TreeNode q) {
6
7        if (root == null ||
8            root == p ||
9            root == q) {
10
11            return root;
12        }
13
14        TreeNode left =
15                lowestCommonAncestor(root.left, p, q);
16
17        TreeNode right =
18                lowestCommonAncestor(root.right, p, q);
19
20        if (left != null && right != null) {
21            return root;
22        }
23
24        return left != null ? left : right;
25    }
26}