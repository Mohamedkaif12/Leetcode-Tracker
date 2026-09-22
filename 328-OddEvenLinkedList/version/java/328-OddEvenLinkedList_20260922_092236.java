// Last updated: 9/22/2026, 9:22:36 AM
1class Solution {
2    public ListNode oddEvenList(ListNode head) {
3        if (head == null || head.next == null) {
4            return head;
5        }
6
7        ListNode odd = head;
8        ListNode even = head.next;
9        ListNode evenHead = even;
10
11        while (even != null && even.next != null) {
12            odd.next = even.next;
13            odd = odd.next;
14
15            even.next = odd.next;
16            even = even.next;
17        }
18
19        odd.next = evenHead;
20
21        return head;
22    }
23}