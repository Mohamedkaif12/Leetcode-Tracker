// Last updated: 8/10/2026, 1:47:16 AM
1class Solution {
2
3    int count = 0;
4    int answer = 0;
5
6    public int kthSmallest(TreeNode root, int k) {
7
8        inorder(root, k);
9
10        return answer;
11    }
12
13    private void inorder(TreeNode root, int k) {
14
15        if (root == null) {
16            return;
17        }
18
19        inorder(root.left, k);
20
21        count++;
22
23        if (count == k) {
24            answer = root.val;
25            return;
26        }
27
28        inorder(root.right, k);
29    }
30}