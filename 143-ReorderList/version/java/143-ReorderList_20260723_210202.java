// Last updated: 7/23/2026, 9:02:02 PM
1class MinStack {
2
3    Stack<Integer> stack;
4    Stack<Integer> minStack;
5
6    public MinStack() {
7        stack = new Stack<>();
8        minStack = new Stack<>();
9    }
10
11    public void push(int val) {
12
13        stack.push(val);
14
15        if (minStack.isEmpty() || val <= minStack.peek())
16            minStack.push(val);
17    }
18
19    public void pop() {
20
21        if (stack.pop().equals(minStack.peek()))
22            minStack.pop();
23    }
24
25    public int top() {
26        return stack.peek();
27    }
28
29    public int getMin() {
30        return minStack.peek();
31    }
32}