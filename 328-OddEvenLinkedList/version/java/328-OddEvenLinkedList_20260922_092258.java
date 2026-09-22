// Last updated: 9/22/2026, 9:22:58 AM
1class Solution {
2    int rows, cols;
3    int[][] dp;
4    int[][] directions = {
5        {1, 0},
6        {-1, 0},
7        {0, 1},
8        {0, -1}
9    };
10
11    public int longestIncreasingPath(int[][] matrix) {
12        rows = matrix.length;
13        cols = matrix[0].length;
14
15        dp = new int[rows][cols];
16
17        int answer = 0;
18
19        for (int i = 0; i < rows; i++) {
20            for (int j = 0; j < cols; j++) {
21                answer = Math.max(answer, dfs(matrix, i, j));
22            }
23        }
24
25        return answer;
26    }
27
28    private int dfs(int[][] matrix, int row, int col) {
29
30        if (dp[row][col] != 0) {
31            return dp[row][col];
32        }
33
34        int longest = 1;
35
36        for (int[] direction : directions) {
37            int newRow = row + direction[0];
38            int newCol = col + direction[1];
39
40            if (newRow >= 0 && newRow < rows &&
41                newCol >= 0 && newCol < cols &&
42                matrix[newRow][newCol] > matrix[row][col]) {
43
44                longest = Math.max(
45                    longest,
46                    1 + dfs(matrix, newRow, newCol)
47                );
48            }
49        }
50
51        dp[row][col] = longest;
52
53        return longest;
54    }
55}