// Last updated: 8/10/2026, 1:48:56 AM
1class Solution {
2    public void deleteNode(ListNode node) {
3
4        node.val = node.next.val;
5        node.next = node.next.next;
6    }
7}