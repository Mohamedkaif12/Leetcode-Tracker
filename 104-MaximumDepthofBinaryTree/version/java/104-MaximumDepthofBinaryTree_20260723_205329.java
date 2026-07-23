// Last updated: 7/23/2026, 8:53:29 PM
1class Solution {
2
3    int maxSum = Integer.MIN_VALUE;
4
5    public int maxPathSum(TreeNode root) {
6        dfs(root);
7        return maxSum;
8    }
9
10    private int dfs(TreeNode node) {
11        if (node == null)
12            return 0;
13
14        int left = Math.max(0, dfs(node.left));
15        int right = Math.max(0, dfs(node.right));
16
17        maxSum = Math.max(maxSum, node.val + left + right);
18
19        return node.val + Math.max(left, right);
20    }
21}