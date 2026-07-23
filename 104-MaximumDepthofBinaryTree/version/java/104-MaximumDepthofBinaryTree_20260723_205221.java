// Last updated: 7/23/2026, 8:52:21 PM
1// 117. Populating Next Right Pointers in Each Node II
2class Solution {
3    public Node connect(Node root) {
4
5        if (root == null)
6            return null;
7
8        Queue<Node> queue = new LinkedList<>();
9        queue.offer(root);
10
11        while (!queue.isEmpty()) {
12
13            int size = queue.size();
14
15            for (int i = 0; i < size; i++) {
16
17                Node node = queue.poll();
18
19                if (i < size - 1)
20                    node.next = queue.peek();
21
22                if (node.left != null)
23                    queue.offer(node.left);
24
25                if (node.right != null)
26                    queue.offer(node.right);
27            }
28        }
29
30        return root;
31    }
32}