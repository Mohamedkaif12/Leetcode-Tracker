// Last updated: 7/23/2026, 8:55:30 PM
1class Solution {
2    public int canCompleteCircuit(int[] gas, int[] cost) {
3
4        int total = 0;
5        int tank = 0;
6        int start = 0;
7
8        for (int i = 0; i < gas.length; i++) {
9
10            int diff = gas[i] - cost[i];
11            total += diff;
12            tank += diff;
13
14            if (tank < 0) {
15                start = i + 1;
16                tank = 0;
17            }
18        }
19
20        return total >= 0 ? start : -1;
21    }
22}