// Last updated: 8/10/2026, 1:41:26 AM
1class Solution {
2    public boolean isIsomorphic(String s, String t) {
3
4        int[] mapS = new int[256];
5        int[] mapT = new int[256];
6
7        for (int i = 0; i < s.length(); i++) {
8
9            char a = s.charAt(i);
10            char b = t.charAt(i);
11
12            if (mapS[a] != mapT[b]) {
13                return false;
14            }
15
16            mapS[a] = i + 1;
17            mapT[b] = i + 1;
18        }
19
20        return true;
21    }
22}