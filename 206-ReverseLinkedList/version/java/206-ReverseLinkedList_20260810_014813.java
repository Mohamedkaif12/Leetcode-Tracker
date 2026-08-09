// Last updated: 8/10/2026, 1:48:13 AM
1class Solution {
2    public int countDigitOne(int n) {
3
4        long factor = 1;
5        int count = 0;
6
7        while (factor <= n) {
8
9            long lower = n % factor;
10            long current = (n / factor) % 10;
11            long higher = n / (factor * 10);
12
13            if (current == 0) {
14                count += higher * factor;
15            }
16            else if (current == 1) {
17                count += higher * factor + lower + 1;
18            }
19            else {
20                count += (higher + 1) * factor;
21            }
22
23            factor *= 10;
24        }
25
26        return count;
27    }
28}