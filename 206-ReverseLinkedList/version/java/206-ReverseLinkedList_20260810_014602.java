// Last updated: 8/10/2026, 1:46:02 AM
1class Solution {
2    public int calculate(String s) {
3
4        Stack<Integer> stack = new Stack<>();
5
6        int result = 0;
7        int number = 0;
8        int sign = 1;
9
10        for (int i = 0; i < s.length(); i++) {
11
12            char c = s.charAt(i);
13
14            if (Character.isDigit(c)) {
15
16                number = number * 10 + (c - '0');
17
18            } else if (c == '+') {
19
20                result += sign * number;
21                number = 0;
22                sign = 1;
23
24            } else if (c == '-') {
25
26                result += sign * number;
27                number = 0;
28                sign = -1;
29
30            } else if (c == '(') {
31
32                stack.push(result);
33                stack.push(sign);
34
35                result = 0;
36                sign = 1;
37
38            } else if (c == ')') {
39
40                result += sign * number;
41                number = 0;
42
43                result *= stack.pop();
44                result += stack.pop();
45            }
46        }
47
48        return result + sign * number;
49    }
50}