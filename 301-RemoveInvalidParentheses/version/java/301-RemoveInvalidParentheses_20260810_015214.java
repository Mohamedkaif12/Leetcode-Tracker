// Last updated: 8/10/2026, 1:52:14 AM
1class Solution {
2
3    public List<String> removeInvalidParentheses(String s) {
4
5        List<String> result = new ArrayList<>();
6
7        Queue<String> queue = new LinkedList<>();
8        Set<String> visited = new HashSet<>();
9
10        queue.offer(s);
11        visited.add(s);
12
13        boolean found = false;
14
15        while (!queue.isEmpty()) {
16
17            String current = queue.poll();
18
19            if (isValid(current)) {
20
21                result.add(current);
22                found = true;
23            }
24
25            if (found) {
26                continue;
27            }
28
29            for (int i = 0; i < current.length(); i++) {
30
31                if (current.charAt(i) != '(' &&
32                    current.charAt(i) != ')') {
33                    continue;
34                }
35
36                String next =
37                    current.substring(0, i) +
38                    current.substring(i + 1);
39
40                if (visited.add(next)) {
41                    queue.offer(next);
42                }
43            }
44        }
45
46        return result;
47    }
48
49    private boolean isValid(String s) {
50
51        int balance = 0;
52
53        for (char c : s.toCharArray()) {
54
55            if (c == '(') {
56                balance++;
57            }
58            else if (c == ')') {
59                balance--;
60
61                if (balance < 0) {
62                    return false;
63                }
64            }
65        }
66
67        return balance == 0;
68    }
69}