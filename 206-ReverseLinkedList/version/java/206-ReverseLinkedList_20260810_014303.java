// Last updated: 8/10/2026, 1:43:03 AM
1class Solution {
2
3    public String shortestPalindrome(String s) {
4
5        String rev = new StringBuilder(s)
6                .reverse()
7                .toString();
8
9        String combined = s + "#" + rev;
10
11        int[] lps = new int[combined.length()];
12
13        for (int i = 1; i < combined.length(); i++) {
14
15            int j = lps[i - 1];
16
17            while (j > 0 &&
18                   combined.charAt(i) != combined.charAt(j)) {
19
20                j = lps[j - 1];
21            }
22
23            if (combined.charAt(i) == combined.charAt(j)) {
24                j++;
25            }
26
27            lps[i] = j;
28        }
29
30        int palindromeLength = lps[combined.length() - 1];
31
32        String remaining = s.substring(palindromeLength);
33
34        return new StringBuilder(remaining)
35                .reverse()
36                .toString() + s;
37    }
38}