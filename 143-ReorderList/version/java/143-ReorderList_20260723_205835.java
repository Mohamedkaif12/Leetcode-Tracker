// Last updated: 7/23/2026, 8:58:35 PM
1class Solution {
2    public List<Integer> preorderTraversal(TreeNode root) {
3
4        List<Integer> result = new ArrayList<>();
5        preorder(root, result);
6
7        return result;
8    }
9
10    private void preorder(TreeNode root, List<Integer> result) {
11
12        if (root == null)
13            return;
14
15        result.add(root.val);
16        preorder(root.left, result);
17        preorder(root.right, result);
18    }
19}