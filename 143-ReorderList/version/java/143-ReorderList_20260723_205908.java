// Last updated: 7/23/2026, 8:59:08 PM
1class LRUCache {
2
3    class Node {
4        int key, value;
5        Node prev, next;
6
7        Node(int key, int value) {
8            this.key = key;
9            this.value = value;
10        }
11    }
12
13    private int capacity;
14    private Map<Integer, Node> map;
15    private Node head, tail;
16
17    public LRUCache(int capacity) {
18        this.capacity = capacity;
19        map = new HashMap<>();
20
21        head = new Node(0, 0);
22        tail = new Node(0, 0);
23
24        head.next = tail;
25        tail.prev = head;
26    }
27
28    private void remove(Node node) {
29        node.prev.next = node.next;
30        node.next.prev = node.prev;
31    }
32
33    private void insert(Node node) {
34        node.next = head.next;
35        head.next.prev = node;
36        head.next = node;
37        node.prev = head;
38    }
39
40    public int get(int key) {
41
42        if (!map.containsKey(key))
43            return -1;
44
45        Node node = map.get(key);
46
47        remove(node);
48        insert(node);
49
50        return node.value;
51    }
52
53    public void put(int key, int value) {
54
55        if (map.containsKey(key)) {
56            remove(map.get(key));
57        }
58
59        Node node = new Node(key, value);
60        map.put(key, node);
61        insert(node);
62
63        if (map.size() > capacity) {
64
65            Node lru = tail.prev;
66
67            remove(lru);
68            map.remove(lru.key);
69        }
70    }
71}