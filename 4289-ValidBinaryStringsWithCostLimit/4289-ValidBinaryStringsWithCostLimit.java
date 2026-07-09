// Last updated: 7/9/2026, 3:05:10 PM
import java.util.*;

class Solution {

    public List<String> generateValidStrings(int n, int k) {
        List<String> result = new ArrayList<>();
        backtrack(0, n, k, 0, new StringBuilder(), false, result);
        return result;
    }

    private void backtrack(int idx, int n, int k,
                           int cost,
                           StringBuilder sb,
                           boolean prevOne,
                           List<String> result) {

        if (cost > k) {
            return;
        }

        if (idx == n) {
            result.add(sb.toString());
            return;
        }

        // Put '0'
        sb.append('0');
        backtrack(idx + 1, n, k, cost, sb, false, result);
        sb.deleteCharAt(sb.length() - 1);

        // Put '1'
        if (!prevOne) {
            sb.append('1');
            backtrack(idx + 1, n, k, cost + idx, sb, true, result);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}