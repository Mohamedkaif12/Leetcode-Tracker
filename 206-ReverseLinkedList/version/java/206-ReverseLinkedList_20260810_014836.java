// Last updated: 8/10/2026, 1:48:36 AM
1class Solution {
2    public TreeNode lowestCommonAncestor(
3            TreeNode root,
4            TreeNode p,
5            TreeNode q) {
6
7        while (root != null) {
8
9            if (p.val < root.val &&
10                q.val < root.val) {
11
12                root = root.left;
13
14            }
15            else if (p.val > root.val &&
16                     q.val > root.val) {
17
18                root = root.right;
19
20            }
21            else {
22                return root;
23            }
24        }
25
26        return null;
27    }
28}