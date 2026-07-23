// Last updated: 7/23/2026, 8:49:49 PM
1// 103. Binary Tree Zigzag Level Order Traversal
2class Solution {
3    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
4        List<List<Integer>> ans = new ArrayList<>();
5        if (root == null) return ans;
6
7        Queue<TreeNode> q = new LinkedList<>();
8        q.offer(root);
9        boolean leftToRight = true;
10
11        while (!q.isEmpty()) {
12            int size = q.size();
13            LinkedList<Integer> level = new LinkedList<>();
14
15            for (int i = 0; i < size; i++) {
16                TreeNode node = q.poll();
17
18                if (leftToRight)
19                    level.addLast(node.val);
20                else
21                    level.addFirst(node.val);
22
23                if (node.left != null) q.offer(node.left);
24                if (node.right != null) q.offer(node.right);
25            }
26
27            ans.add(level);
28            leftToRight = !leftToRight;
29        }
30        return ans;
31    }
32}