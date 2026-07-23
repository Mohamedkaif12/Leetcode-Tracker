// Last updated: 7/23/2026, 8:50:30 PM
1// 106. Construct Binary Tree from Inorder and Postorder Traversal
2class Solution {
3
4    HashMap<Integer, Integer> map = new HashMap<>();
5    int postIndex;
6
7    public TreeNode buildTree(int[] inorder, int[] postorder) {
8
9        postIndex = postorder.length - 1;
10
11        for (int i = 0; i < inorder.length; i++)
12            map.put(inorder[i], i);
13
14        return helper(postorder, 0, inorder.length - 1);
15    }
16
17    private TreeNode helper(int[] postorder, int left, int right) {
18
19        if (left > right)
20            return null;
21
22        int val = postorder[postIndex--];
23        TreeNode root = new TreeNode(val);
24
25        int mid = map.get(val);
26
27        root.right = helper(postorder, mid + 1, right);
28        root.left = helper(postorder, left, mid - 1);
29
30        return root;
31    }
32}