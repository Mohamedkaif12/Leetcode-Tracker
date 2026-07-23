// Last updated: 7/23/2026, 8:59:34 PM
1class Solution {
2
3    public ListNode sortList(ListNode head) {
4
5        if (head == null || head.next == null)
6            return head;
7
8        ListNode slow = head;
9        ListNode fast = head.next;
10
11        while (fast != null && fast.next != null) {
12
13            slow = slow.next;
14            fast = fast.next.next;
15        }
16
17        ListNode mid = slow.next;
18        slow.next = null;
19
20        ListNode left = sortList(head);
21        ListNode right = sortList(mid);
22
23        return merge(left, right);
24    }
25
26    private ListNode merge(ListNode a, ListNode b) {
27
28        ListNode dummy = new ListNode(0);
29        ListNode curr = dummy;
30
31        while (a != null && b != null) {
32
33            if (a.val < b.val) {
34                curr.next = a;
35                a = a.next;
36            } else {
37                curr.next = b;
38                b = b.next;
39            }
40
41            curr = curr.next;
42        }
43
44        curr.next = (a != null) ? a : b;
45
46        return dummy.next;
47    }
48}