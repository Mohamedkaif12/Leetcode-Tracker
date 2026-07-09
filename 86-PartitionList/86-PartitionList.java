// Last updated: 7/9/2026, 3:06:08 PM
class Solution {

    public ListNode partition(ListNode head, int x) {

        ListNode before = new ListNode(0);
        ListNode after = new ListNode(0);

        ListNode b = before;
        ListNode a = after;

        while (head != null) {

            if (head.val < x) {
                b.next = head;
                b = b.next;
            } else {
                a.next = head;
                a = a.next;
            }

            head = head.next;
        }

        a.next = null;
        b.next = after.next;

        return before.next;
    }
}