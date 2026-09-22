// Last updated: 9/22/2026, 9:25:24 AM
1class Solution {
2    public boolean isValidSerialization(String preorder) {
3        int slots = 1;
4
5        String[] nodes = preorder.split(",");
6
7        for (String node : nodes) {
8            // Every node needs one slot
9            if (slots == 0) {
10                return false;
11            }
12
13            if (node.equals("#")) {
14                // Null node uses one slot
15                slots--;
16            } else {
17                // Normal node uses one slot and creates two
18                // Net increase = 1
19                slots++;
20            }
21        }
22
23        return slots == 0;
24    }
25}