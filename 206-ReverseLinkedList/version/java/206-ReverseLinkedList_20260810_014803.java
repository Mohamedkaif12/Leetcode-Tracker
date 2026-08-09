// Last updated: 8/10/2026, 1:48:03 AM
1class MyQueue {
2
3    Stack<Integer> input;
4    Stack<Integer> output;
5
6    public MyQueue() {
7        input = new Stack<>();
8        output = new Stack<>();
9    }
10
11    public void push(int x) {
12        input.push(x);
13    }
14
15    public int pop() {
16        move();
17        return output.pop();
18    }
19
20    public int peek() {
21        move();
22        return output.peek();
23    }
24
25    public boolean empty() {
26        return input.isEmpty() && output.isEmpty();
27    }
28
29    private void move() {
30        if (output.isEmpty()) {
31            while (!input.isEmpty()) {
32                output.push(input.pop());
33            }
34        }
35    }
36}