// Last updated: 7/23/2026, 8:50:39 PM
1// 107. Binary Tree Level Order Traversal II
2class Solution {
3    public List<List<Integer>> levelOrderBottom(TreeNode root) {
4
5        LinkedList<List<Integer>> ans = new LinkedList<>();
6
7        if (root == null)
8            return ans;
9
10        Queue<TreeNode> q = new LinkedList<>();
11        q.offer(root);
12
13        while (!q.isEmpty()) {
14
15            int size = q.size();
16            List<Integer> level = new ArrayList<>();
17
18            for (int i = 0; i < size; i++) {
19
20                TreeNode node = q.poll();
21                level.add(node.val);
22
23                if (node.left != null)
24                    q.offer(node.left);
25
26                if (node.right != null)
27                    q.offer(node.right);
28            }
29
30            ans.addFirst(level);
31        }
32
33        return ans;
34    }
35}