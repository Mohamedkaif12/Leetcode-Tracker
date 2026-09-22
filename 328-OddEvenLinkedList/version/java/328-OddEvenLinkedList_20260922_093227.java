// Last updated: 9/22/2026, 9:32:27 AM
1import java.util.*;
2
3class Solution {
4    Map<String, PriorityQueue<String>> graph = new HashMap<>();
5    List<String> result = new LinkedList<>();
6
7    public List<String> findItinerary(List<List<String>> tickets) {
8
9        // Build graph
10        for (List<String> ticket : tickets) {
11            String from = ticket.get(0);
12            String to = ticket.get(1);
13
14            graph.putIfAbsent(from, new PriorityQueue<>());
15            graph.get(from).offer(to);
16        }
17
18        // DFS from JFK
19        dfs("JFK");
20
21        return result;
22    }
23
24    private void dfs(String airport) {
25
26        PriorityQueue<String> destinations = graph.get(airport);
27
28        while (destinations != null && !destinations.isEmpty()) {
29            String next = destinations.poll();
30            dfs(next);
31        }
32
33        // Add after visiting all destinations
34        result.add(0, airport);
35    }
36}