// Last updated: 7/23/2026, 8:50:12 PM
1// 105. Construct Binary Tree from Preorder and Inorder Traversal
2class Solution {
3
4    HashMap<Integer, Integer> map = new HashMap<>();
5    int preIndex = 0;
6
7    public TreeNode buildTree(int[] preorder, int[] inorder) {
8
9        for (int i = 0; i < inorder.length; i++)
10            map.put(inorder[i], i);
11
12        return helper(preorder, 0, inorder.length - 1);
13    }
14
15    private TreeNode helper(int[] preorder, int left, int right) {
16
17        if (left > right)
18            return null;
19
20        int val = preorder[preIndex++];
21        TreeNode root = new TreeNode(val);
22
23        int mid = map.get(val);
24
25        root.left = helper(preorder, left, mid - 1);
26        root.right = helper(preorder, mid + 1, right);
27
28        return root;
29    }
30}