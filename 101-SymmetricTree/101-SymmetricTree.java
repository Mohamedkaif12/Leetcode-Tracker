// Last updated: 7/9/2026, 3:05:50 PM
class Solution {

    public boolean isSymmetric(TreeNode root) {

        return mirror(root.left, root.right);
    }

    private boolean mirror(TreeNode a, TreeNode b) {

        if (a == null && b == null)
            return true;

        if (a == null || b == null)
            return false;

        return a.val == b.val
                && mirror(a.left, b.right)
                && mirror(a.right, b.left);
    }
}