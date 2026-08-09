// Last updated: 8/10/2026, 1:49:26 AM
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3
4        int rows = matrix.length;
5        int cols = matrix[0].length;
6
7        int row = 0;
8        int col = cols - 1;
9
10        while (row < rows && col >= 0) {
11
12            if (matrix[row][col] == target) {
13                return true;
14            }
15
16            if (matrix[row][col] > target) {
17                col--;
18            }
19            else {
20                row++;
21            }
22        }
23
24        return false;
25    }
26}