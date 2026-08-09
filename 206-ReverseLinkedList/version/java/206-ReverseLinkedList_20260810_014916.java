// Last updated: 8/10/2026, 1:49:16 AM
1class Solution {
2    public int[] maxSlidingWindow(int[] nums, int k) {
3
4        int n = nums.length;
5
6        int[] result = new int[n - k + 1];
7
8        Deque<Integer> deque = new ArrayDeque<>();
9
10        for (int i = 0; i < n; i++) {
11
12            // Remove elements outside window
13            while (!deque.isEmpty() &&
14                   deque.peekFirst() <= i - k) {
15
16                deque.pollFirst();
17            }
18
19            // Remove smaller elements
20            while (!deque.isEmpty() &&
21                   nums[deque.peekLast()] <= nums[i]) {
22
23                deque.pollLast();
24            }
25
26            deque.offerLast(i);
27
28            // Window is ready
29            if (i >= k - 1) {
30                result[i - k + 1] = nums[deque.peekFirst()];
31            }
32        }
33
34        return result;
35    }
36}