// Last updated: 8/10/2026, 1:41:42 AM
1class Solution {
2    public boolean canFinish(int numCourses, int[][] prerequisites) {
3
4        List<Integer>[] graph = new ArrayList[numCourses];
5
6        for (int i = 0; i < numCourses; i++) {
7            graph[i] = new ArrayList<>();
8        }
9
10        for (int[] p : prerequisites) {
11            graph[p[1]].add(p[0]);
12        }
13
14        int[] state = new int[numCourses];
15
16        for (int i = 0; i < numCourses; i++) {
17            if (!dfs(i, graph, state)) {
18                return false;
19            }
20        }
21
22        return true;
23    }
24
25    private boolean dfs(int course,
26                        List<Integer>[] graph,
27                        int[] state) {
28
29        if (state[course] == 1) {
30            return false;
31        }
32
33        if (state[course] == 2) {
34            return true;
35        }
36
37        state[course] = 1;
38
39        for (int next : graph[course]) {
40            if (!dfs(next, graph, state)) {
41                return false;
42            }
43        }
44
45        state[course] = 2;
46
47        return true;
48    }
49}