// Last updated: 7/23/2026, 8:52:31 PM
1// 118. Pascal's Triangle
2class Solution {
3    public List<List<Integer>> generate(int numRows) {
4
5        List<List<Integer>> ans = new ArrayList<>();
6
7        for (int i = 0; i < numRows; i++) {
8
9            List<Integer> row = new ArrayList<>();
10
11            for (int j = 0; j <= i; j++) {
12
13                if (j == 0 || j == i)
14                    row.add(1);
15                else
16                    row.add(ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j));
17            }
18
19            ans.add(row);
20        }
21
22        return ans;
23    }
24}