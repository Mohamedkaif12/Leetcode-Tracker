// Last updated: 8/10/2026, 1:42:13 AM
1class Solution {
2    public int[] findOrder(int numCourses, int[][] prerequisites) {
3
4        List<Integer>[] graph = new ArrayList[numCourses];
5        int[] indegree = new int[numCourses];
6
7        for (int i = 0; i < numCourses; i++) {
8            graph[i] = new ArrayList<>();
9        }
10
11        for (int[] p : prerequisites) {
12
13            graph[p[1]].add(p[0]);
14            indegree[p[0]]++;
15        }
16
17        Queue<Integer> queue = new LinkedList<>();
18
19        for (int i = 0; i < numCourses; i++) {
20
21            if (indegree[i] == 0) {
22                queue.offer(i);
23            }
24        }
25
26        int[] result = new int[numCourses];
27        int index = 0;
28
29        while (!queue.isEmpty()) {
30
31            int course = queue.poll();
32
33            result[index++] = course;
34
35            for (int next : graph[course]) {
36
37                indegree[next]--;
38
39                if (indegree[next] == 0) {
40                    queue.offer(next);
41                }
42            }
43        }
44
45        if (index != numCourses) {
46            return new int[0];
47        }
48
49        return result;
50    }
51}