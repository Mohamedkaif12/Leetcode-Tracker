// Last updated: 7/23/2026, 8:59:19 PM
1class Solution {
2    public ListNode insertionSortList(ListNode head) {
3
4        ListNode dummy = new ListNode(0);
5
6        while (head != null) {
7
8            ListNode curr = dummy;
9
10            while (curr.next != null && curr.next.val < head.val)
11                curr = curr.next;
12
13            ListNode next = head.next;
14
15            head.next = curr.next;
16            curr.next = head;
17
18            head = next;
19        }
20
21        return dummy.next;
22    }
23}