// Last updated: 7/23/2026, 8:54:11 PM
1class Solution {
2    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
3
4        Set<String> set = new HashSet<>(wordList);
5
6        if (!set.contains(endWord))
7            return 0;
8
9        Queue<String> queue = new LinkedList<>();
10        queue.offer(beginWord);
11
12        int level = 1;
13
14        while (!queue.isEmpty()) {
15
16            int size = queue.size();
17
18            for (int k = 0; k < size; k++) {
19
20                String word = queue.poll();
21
22                if (word.equals(endWord))
23                    return level;
24
25                char[] arr = word.toCharArray();
26
27                for (int i = 0; i < arr.length; i++) {
28
29                    char old = arr[i];
30
31                    for (char c = 'a'; c <= 'z'; c++) {
32
33                        arr[i] = c;
34                        String next = new String(arr);
35
36                        if (set.contains(next)) {
37                            queue.offer(next);
38                            set.remove(next);
39                        }
40                    }
41
42                    arr[i] = old;
43                }
44            }
45
46            level++;
47        }
48
49        return 0;
50    }
51}