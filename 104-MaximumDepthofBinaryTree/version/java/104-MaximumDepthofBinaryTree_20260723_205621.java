// Last updated: 7/23/2026, 8:56:21 PM
1class Solution {
2    public Node copyRandomList(Node head) {
3
4        if (head == null)
5            return null;
6
7        HashMap<Node, Node> map = new HashMap<>();
8
9        Node curr = head;
10
11        while (curr != null) {
12            map.put(curr, new Node(curr.val));
13            curr = curr.next;
14        }
15
16        curr = head;
17
18        while (curr != null) {
19
20            map.get(curr).next = map.get(curr.next);
21            map.get(curr).random = map.get(curr.random);
22
23            curr = curr.next;
24        }
25
26        return map.get(head);
27    }
28}