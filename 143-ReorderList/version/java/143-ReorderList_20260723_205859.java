// Last updated: 7/23/2026, 8:58:59 PM
1class Solution {
2    public List<Integer> postorderTraversal(TreeNode root) {
3
4        List<Integer> result = new ArrayList<>();
5        postorder(root, result);
6
7        return result;
8    }
9
10    private void postorder(TreeNode root, List<Integer> result) {
11
12        if (root == null)
13            return;
14
15        postorder(root.left, result);
16        postorder(root.right, result);
17        result.add(root.val);
18    }
19}