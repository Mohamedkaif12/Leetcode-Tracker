// Last updated: 7/23/2026, 8:54:42 PM
1class Solution {
2
3    int m, n;
4
5    public void solve(char[][] board) {
6
7        m = board.length;
8        n = board[0].length;
9
10        for (int i = 0; i < m; i++) {
11            dfs(board, i, 0);
12            dfs(board, i, n - 1);
13        }
14
15        for (int j = 0; j < n; j++) {
16            dfs(board, 0, j);
17            dfs(board, m - 1, j);
18        }
19
20        for (int i = 0; i < m; i++) {
21            for (int j = 0; j < n; j++) {
22
23                if (board[i][j] == 'O')
24                    board[i][j] = 'X';
25
26                if (board[i][j] == '#')
27                    board[i][j] = 'O';
28            }
29        }
30    }
31
32    private void dfs(char[][] board, int i, int j) {
33
34        if (i < 0 || j < 0 || i >= m || j >= n || board[i][j] != 'O')
35            return;
36
37        board[i][j] = '#';
38
39        dfs(board, i + 1, j);
40        dfs(board, i - 1, j);
41        dfs(board, i, j + 1);
42        dfs(board, i, j - 1);
43    }
44}