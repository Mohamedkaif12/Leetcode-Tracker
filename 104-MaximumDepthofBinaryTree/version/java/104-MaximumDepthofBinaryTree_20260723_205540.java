// Last updated: 7/23/2026, 8:55:40 PM
1class Solution {
2    public int candy(int[] ratings) {
3
4        int n = ratings.length;
5        int[] candy = new int[n];
6
7        Arrays.fill(candy, 1);
8
9        for (int i = 1; i < n; i++) {
10            if (ratings[i] > ratings[i - 1])
11                candy[i] = candy[i - 1] + 1;
12        }
13
14        for (int i = n - 2; i >= 0; i--) {
15            if (ratings[i] > ratings[i + 1])
16                candy[i] = Math.max(candy[i], candy[i + 1] + 1);
17        }
18
19        int sum = 0;
20
21        for (int c : candy)
22            sum += c;
23
24        return sum;
25    }
26}