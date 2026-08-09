// Last updated: 8/10/2026, 1:46:55 AM
1class Solution {
2    public List<String> summaryRanges(int[] nums) {
3
4        List<String> result = new ArrayList<>();
5
6        int i = 0;
7
8        while (i < nums.length) {
9
10            int start = nums[i];
11
12            while (i + 1 < nums.length &&
13                   nums[i + 1] == nums[i] + 1) {
14
15                i++;
16            }
17
18            int end = nums[i];
19
20            if (start == end) {
21                result.add(String.valueOf(start));
22            } else {
23                result.add(start + "->" + end);
24            }
25
26            i++;
27        }
28
29        return result;
30    }
31}