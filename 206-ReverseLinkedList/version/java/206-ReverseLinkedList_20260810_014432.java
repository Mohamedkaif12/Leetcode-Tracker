// Last updated: 8/10/2026, 1:44:32 AM
1class Solution {
2    public List<List<Integer>> getSkyline(int[][] buildings) {
3
4        List<int[]> events = new ArrayList<>();
5
6        for (int[] b : buildings) {
7            events.add(new int[]{b[0], -b[2]});
8            events.add(new int[]{b[1], b[2]});
9        }
10
11        Collections.sort(events, (a, b) -> {
12            if (a[0] != b[0]) {
13                return Integer.compare(a[0], b[0]);
14            }
15            return Integer.compare(a[1], b[1]);
16        });
17
18        PriorityQueue<Integer> pq =
19                new PriorityQueue<>(Collections.reverseOrder());
20
21        pq.add(0);
22
23        Map<Integer, Integer> count = new HashMap<>();
24
25        List<List<Integer>> result = new ArrayList<>();
26
27        int previousHeight = 0;
28
29        for (int[] event : events) {
30
31            int x = event[0];
32            int height = event[1];
33
34            if (height < 0) {
35                pq.add(-height);
36            } else {
37                count.put(height, count.getOrDefault(height, 0) + 1);
38            }
39
40            while (!pq.isEmpty() &&
41                   count.getOrDefault(pq.peek(), 0) > 0) {
42
43                int h = pq.poll();
44                count.put(h, count.get(h) - 1);
45            }
46
47            int currentHeight = pq.peek();
48
49            if (currentHeight != previousHeight) {
50                result.add(Arrays.asList(x, currentHeight));
51                previousHeight = currentHeight;
52            }
53        }
54
55        return result;
56    }
57}