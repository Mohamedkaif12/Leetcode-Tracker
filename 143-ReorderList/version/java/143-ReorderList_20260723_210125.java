// Last updated: 7/23/2026, 9:01:25 PM
1class Solution {
2    public String reverseWords(String s) {
3
4        String[] words = s.trim().split("\\s+");
5        StringBuilder sb = new StringBuilder();
6
7        for (int i = words.length - 1; i >= 0; i--) {
8            sb.append(words[i]);
9
10            if (i != 0)
11                sb.append(" ");
12        }
13
14        return sb.toString();
15    }
16}