// Last updated: 8/10/2026, 1:46:21 AM
1class MyStack {
2
3    Queue<Integer> queue = new LinkedList<>();
4
5    public MyStack() {
6    }
7
8    public void push(int x) {
9
10        queue.offer(x);
11
12        int size = queue.size();
13
14        for (int i = 0; i < size - 1; i++) {
15            queue.offer(queue.poll());
16        }
17    }
18
19    public int pop() {
20        return queue.poll();
21    }
22
23    public int top() {
24        return queue.peek();
25    }
26
27    public boolean empty() {
28        return queue.isEmpty();
29    }
30}