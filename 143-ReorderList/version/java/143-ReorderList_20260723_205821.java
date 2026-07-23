// Last updated: 7/23/2026, 8:58:21 PM
1class Solution {
2    public void reorderList(ListNode head) {
3
4        if (head == null || head.next == null)
5            return;
6
7        ListNode slow = head;
8        ListNode fast = head;
9
10        while (fast.next != null && fast.next.next != null) {
11            slow = slow.next;
12            fast = fast.next.next;
13        }
14
15        ListNode second = reverse(slow.next);
16        slow.next = null;
17
18        ListNode first = head;
19
20        while (second != null) {
21
22            ListNode t1 = first.next;
23            ListNode t2 = second.next;
24
25            first.next = second;
26            second.next = t1;
27
28            first = t1;
29            second = t2;
30        }
31    }
32
33    private ListNode reverse(ListNode head) {
34
35        ListNode prev = null;
36
37        while (head != null) {
38
39            ListNode next = head.next;
40            head.next = prev;
41            prev = head;
42            head = next;
43        }
44
45        return prev;
46    }
47}