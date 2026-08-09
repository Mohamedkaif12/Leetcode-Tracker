// Last updated: 8/10/2026, 1:42:48 AM
1class Solution {
2
3    class TrieNode {
4        TrieNode[] children = new TrieNode[26];
5        String word;
6    }
7
8    TrieNode root = new TrieNode();
9
10    public List<String> findWords(char[][] board, String[] words) {
11
12        for (String word : words) {
13            insert(word);
14        }
15
16        List<String> result = new ArrayList<>();
17
18        for (int r = 0; r < board.length; r++) {
19            for (int c = 0; c < board[0].length; c++) {
20
21                dfs(board, r, c, root, result);
22            }
23        }
24
25        return result;
26    }
27
28    private void insert(String word) {
29
30        TrieNode node = root;
31
32        for (char c : word.toCharArray()) {
33
34            int index = c - 'a';
35
36            if (node.children[index] == null) {
37                node.children[index] = new TrieNode();
38            }
39
40            node = node.children[index];
41        }
42
43        node.word = word;
44    }
45
46    private void dfs(char[][] board,
47                     int r,
48                     int c,
49                     TrieNode node,
50                     List<String> result) {
51
52        if (r < 0 || c < 0 ||
53            r >= board.length ||
54            c >= board[0].length ||
55            board[r][c] == '#') {
56
57            return;
58        }
59
60        char ch = board[r][c];
61
62        TrieNode next = node.children[ch - 'a'];
63
64        if (next == null) {
65            return;
66        }
67
68        if (next.word != null) {
69            result.add(next.word);
70            next.word = null;
71        }
72
73        board[r][c] = '#';
74
75        dfs(board, r + 1, c, next, result);
76        dfs(board, r - 1, c, next, result);
77        dfs(board, r, c + 1, next, result);
78        dfs(board, r, c - 1, next, result);
79
80        board[r][c] = ch;
81    }
82}