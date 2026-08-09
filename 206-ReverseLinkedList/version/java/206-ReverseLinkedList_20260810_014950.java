// Last updated: 8/10/2026, 1:49:50 AM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3
4        if (s.length() != t.length()) {
5            return false;
6        }
7
8        int[] count = new int[26];
9
10        for (char c : s.toCharArray()) {
11            count[c - 'a']++;
12        }
13
14        for (char c : t.toCharArray()) {
15            count[c - 'a']--;
16        }
17
18        for (int value : count) {
19
20            if (value != 0) {
21                return false;
22            }
23        }
24
25        return true;
26    }
27}