// Last updated: 8/10/2026, 1:47:08 AM
1class Solution {
2    public List<Integer> majorityElement(int[] nums) {
3
4        int candidate1 = 0;
5        int candidate2 = 0;
6
7        int count1 = 0;
8        int count2 = 0;
9
10        for (int num : nums) {
11
12            if (num == candidate1) {
13                count1++;
14            }
15            else if (num == candidate2) {
16                count2++;
17            }
18            else if (count1 == 0) {
19                candidate1 = num;
20                count1 = 1;
21            }
22            else if (count2 == 0) {
23                candidate2 = num;
24                count2 = 1;
25            }
26            else {
27                count1--;
28                count2--;
29            }
30        }
31
32        count1 = 0;
33        count2 = 0;
34
35        for (int num : nums) {
36
37            if (num == candidate1) {
38                count1++;
39            }
40
41            if (num == candidate2) {
42                count2++;
43            }
44        }
45
46        List<Integer> result = new ArrayList<>();
47
48        if (count1 > nums.length / 3) {
49            result.add(candidate1);
50        }
51
52        if (candidate2 != candidate1 &&
53            count2 > nums.length / 3) {
54            result.add(candidate2);
55        }
56
57        return result;
58    }
59}