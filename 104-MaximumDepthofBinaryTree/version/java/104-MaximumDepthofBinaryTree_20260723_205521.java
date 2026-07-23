// Last updated: 7/23/2026, 8:55:21 PM
1class Solution {
2    public Node cloneGraph(Node node) {
3
4        if (node == null)
5            return null;
6
7        HashMap<Node, Node> map = new HashMap<>();
8
9        return dfs(node, map);
10    }
11
12    private Node dfs(Node node, HashMap<Node, Node> map) {
13
14        if (map.containsKey(node))
15            return map.get(node);
16
17        Node clone = new Node(node.val);
18        map.put(node, clone);
19
20        for (Node neighbor : node.neighbors)
21            clone.neighbors.add(dfs(neighbor, map));
22
23        return clone;
24    }
25}