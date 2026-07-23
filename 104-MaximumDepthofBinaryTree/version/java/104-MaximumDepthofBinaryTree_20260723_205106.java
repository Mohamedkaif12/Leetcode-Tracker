// Last updated: 7/23/2026, 8:51:06 PM
1// 109. Convert Sorted List to Binary Search Tree
2class Solution {
3    public TreeNode sortedListToBST(ListNode head) {
4        if (head == null) return null;
5        if (head.next == null) return new TreeNode(head.val);
6
7        ListNode prev = null;
8        ListNode slow = head;
9        ListNode fast = head;
10
11        while (fast != null && fast.next != null) {
12            prev = slow;
13            slow = slow.next;
14            fast = fast.next.next;
15        }
16
17        if (prev != null)
18            prev.next = null;
19
20        TreeNode root = new TreeNode(slow.val);
21
22        if (head != slow)
23            root.left = sortedListToBST(head);
24
25        root.right = sortedListToBST(slow.next);
26
27        return root;
28    }
29}