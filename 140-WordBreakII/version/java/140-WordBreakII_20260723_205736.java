// Last updated: 7/23/2026, 8:57:36 PM
1class Solution {
2
3    Map<String, List<String>> memo = new HashMap<>();
4
5    public List<String> wordBreak(String s, List<String> wordDict) {
6        return dfs(s, new HashSet<>(wordDict));
7    }
8
9    private List<String> dfs(String s, Set<String> dict) {
10
11        if (memo.containsKey(s))
12            return memo.get(s);
13
14        List<String> result = new ArrayList<>();
15
16        if (s.isEmpty()) {
17            result.add("");
18            return result;
19        }
20
21        for (String word : dict) {
22
23            if (s.startsWith(word)) {
24
25                List<String> sub = dfs(s.substring(word.length()), dict);
26
27                for (String str : sub) {
28
29                    if (str.isEmpty())
30                        result.add(word);
31                    else
32                        result.add(word + " " + str);
33                }
34            }
35        }
36
37        memo.put(s, result);
38
39        return result;
40    }
41}