// Last updated: 7/23/2026, 8:54:52 PM
1class Solution {
2
3    List<List<String>> result = new ArrayList<>();
4
5    public List<List<String>> partition(String s) {
6        backtrack(s, 0, new ArrayList<>());
7        return result;
8    }
9
10    private void backtrack(String s, int start, List<String> path) {
11
12        if (start == s.length()) {
13            result.add(new ArrayList<>(path));
14            return;
15        }
16
17        for (int end = start; end < s.length(); end++) {
18
19            if (isPalindrome(s, start, end)) {
20
21                path.add(s.substring(start, end + 1));
22                backtrack(s, end + 1, path);
23                path.remove(path.size() - 1);
24            }
25        }
26    }
27
28    private boolean isPalindrome(String s, int l, int r) {
29
30        while (l < r) {
31
32            if (s.charAt(l++) != s.charAt(r--))
33                return false;
34        }
35
36        return true;
37    }
38}