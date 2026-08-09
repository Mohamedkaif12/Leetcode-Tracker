// Last updated: 8/10/2026, 1:49:41 AM
1class Solution {
2
3    public List<Integer> diffWaysToCompute(String expression) {
4
5        List<Integer> result = new ArrayList<>();
6
7        for (int i = 0; i < expression.length(); i++) {
8
9            char c = expression.charAt(i);
10
11            if (c == '+' || c == '-' || c == '*') {
12
13                String leftPart =
14                        expression.substring(0, i);
15
16                String rightPart =
17                        expression.substring(i + 1);
18
19                List<Integer> left =
20                        diffWaysToCompute(leftPart);
21
22                List<Integer> right =
23                        diffWaysToCompute(rightPart);
24
25                for (int a : left) {
26
27                    for (int b : right) {
28
29                        if (c == '+') {
30                            result.add(a + b);
31                        }
32                        else if (c == '-') {
33                            result.add(a - b);
34                        }
35                        else {
36                            result.add(a * b);
37                        }
38                    }
39                }
40            }
41        }
42
43        if (result.isEmpty()) {
44            result.add(Integer.parseInt(expression));
45        }
46
47        return result;
48    }
49}