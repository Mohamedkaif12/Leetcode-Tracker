// Last updated: 8/10/2026, 1:46:44 AM
1class Solution {
2    public int calculate(String s) {
3
4        Stack<Integer> stack = new Stack<>();
5
6        int number = 0;
7        char operation = '+';
8
9        for (int i = 0; i < s.length(); i++) {
10
11            char c = s.charAt(i);
12
13            if (Character.isDigit(c)) {
14
15                number = number * 10 + (c - '0');
16            }
17
18            if ((!Character.isDigit(c) && c != ' ')
19                    || i == s.length() - 1) {
20
21                if (operation == '+') {
22                    stack.push(number);
23                }
24                else if (operation == '-') {
25                    stack.push(-number);
26                }
27                else if (operation == '*') {
28                    stack.push(stack.pop() * number);
29                }
30                else if (operation == '/') {
31                    stack.push(stack.pop() / number);
32                }
33
34                operation = c;
35                number = 0;
36            }
37        }
38
39        int result = 0;
40
41        for (int num : stack) {
42            result += num;
43        }
44
45        return result;
46    }
47}