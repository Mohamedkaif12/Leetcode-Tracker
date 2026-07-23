// Last updated: 7/23/2026, 8:54:34 PM
1class Solution {
2
3    int sum = 0;
4
5    public int sumNumbers(TreeNode root) {
6        dfs(root, 0);
7        return sum;
8    }
9
10    private void dfs(TreeNode node, int current) {
11
12        if (node == null)
13            return;
14
15        current = current * 10 + node.val;
16
17        if (node.left == null && node.right == null) {
18            sum += current;
19            return;
20        }
21
22        dfs(node.left, current);
23        dfs(node.right, current);
24    }
25}