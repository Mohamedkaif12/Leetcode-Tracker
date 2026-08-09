// Last updated: 8/10/2026, 1:42:28 AM
1class WordDictionary {
2
3    class Node {
4        Node[] children = new Node[26];
5        boolean isWord;
6    }
7
8    Node root;
9
10    public WordDictionary() {
11        root = new Node();
12    }
13
14    public void addWord(String word) {
15
16        Node current = root;
17
18        for (char c : word.toCharArray()) {
19
20            int index = c - 'a';
21
22            if (current.children[index] == null) {
23                current.children[index] = new Node();
24            }
25
26            current = current.children[index];
27        }
28
29        current.isWord = true;
30    }
31
32    public boolean search(String word) {
33        return dfs(word, 0, root);
34    }
35
36    private boolean dfs(String word, int index, Node node) {
37
38        if (index == word.length()) {
39            return node.isWord;
40        }
41
42        char c = word.charAt(index);
43
44        if (c != '.') {
45
46            int pos = c - 'a';
47
48            if (node.children[pos] == null) {
49                return false;
50            }
51
52            return dfs(word, index + 1, node.children[pos]);
53        }
54
55        for (Node child : node.children) {
56
57            if (child != null &&
58                dfs(word, index + 1, child)) {
59
60                return true;
61            }
62        }
63
64        return false;
65    }
66}