// Last updated: 8/10/2026, 1:48:26 AM
1class Solution {
2    public boolean isPalindrome(ListNode head) {
3
4        if (head == null || head.next == null) {
5            return true;
6        }
7
8        ListNode slow = head;
9        ListNode fast = head;
10
11        while (fast != null && fast.next != null) {
12            slow = slow.next;
13            fast = fast.next.next;
14        }
15
16        ListNode secondHalf = reverse(slow);
17        ListNode firstHalf = head;
18
19        while (secondHalf != null) {
20
21            if (firstHalf.val != secondHalf.val) {
22                return false;
23            }
24
25            firstHalf = firstHalf.next;
26            secondHalf = secondHalf.next;
27        }
28
29        return true;
30    }
31
32    private ListNode reverse(ListNode head) {
33
34        ListNode prev = null;
35
36        while (head != null) {
37
38            ListNode next = head.next;
39
40            head.next = prev;
41            prev = head;
42            head = next;
43        }
44
45        return prev;
46    }
47}