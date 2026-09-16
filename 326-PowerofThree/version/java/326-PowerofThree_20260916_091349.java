// Last updated: 9/16/2026, 9:13:49 AM
1class Solution {
2    public int countRangeSum(int[] nums, int lower, int upper) {
3        long[] prefix = new long[nums.length + 1];
4
5        for (int i = 0; i < nums.length; i++) {
6            prefix[i + 1] = prefix[i] + nums[i];
7        }
8
9        return mergeSort(prefix, 0, prefix.length, lower, upper);
10    }
11
12    private int mergeSort(long[] prefix, int left, int right,
13                           int lower, int upper) {
14
15        if (right - left <= 1) {
16            return 0;
17        }
18
19        int mid = left + (right - left) / 2;
20
21        int count = mergeSort(prefix, left, mid, lower, upper)
22                  + mergeSort(prefix, mid, right, lower, upper);
23
24        int j = mid;
25        int k = mid;
26
27        for (int i = left; i < mid; i++) {
28
29            while (j < right && prefix[j] - prefix[i] < lower) {
30                j++;
31            }
32
33            while (k < right && prefix[k] - prefix[i] <= upper) {
34                k++;
35            }
36
37            count += k - j;
38        }
39
40        // Merge two sorted halves
41        long[] temp = new long[right - left];
42
43        int i = left;
44        int m = mid;
45        int t = 0;
46
47        while (i < mid && m < right) {
48            if (prefix[i] <= prefix[m]) {
49                temp[t++] = prefix[i++];
50            } else {
51                temp[t++] = prefix[m++];
52            }
53        }
54
55        while (i < mid) {
56            temp[t++] = prefix[i++];
57        }
58
59        while (m < right) {
60            temp[t++] = prefix[m++];
61        }
62
63        for (int p = 0; p < temp.length; p++) {
64            prefix[left + p] = temp[p];
65        }
66
67        return count;
68    }
69}