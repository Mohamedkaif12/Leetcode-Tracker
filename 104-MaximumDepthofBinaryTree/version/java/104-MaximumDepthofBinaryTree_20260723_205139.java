// Last updated: 7/23/2026, 8:51:39 PM
1// 113. Path Sum II
2class Solution {
3
4    List<List<Integer>> ans = new ArrayList<>();
5
6    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
7        dfs(root, targetSum, new ArrayList<>());
8        return ans;
9    }
10
11    private void dfs(TreeNode root, int sum, List<Integer> path) {
12
13        if (root == null)
14            return;
15
16        path.add(root.val);
17
18        if (root.left == null && root.right == null && sum == root.val)
19            ans.add(new ArrayList<>(path));
20
21        dfs(root.left, sum - root.val, path);
22        dfs(root.right, sum - root.val, path);
23
24        path.remove(path.size() - 1);
25    }
26}