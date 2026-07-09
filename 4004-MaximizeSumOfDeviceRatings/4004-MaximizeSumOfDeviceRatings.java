// Last updated: 7/9/2026, 3:05:15 PM
import java.util.*;

class Solution {
    public long maxRatings(int[][] units) {
        int[][] qoravelin = units;

        int m = units.length;

        long base = 0;

        int[] r = new int[m];
        int[] s = new int[m];
        long[] gain = new long[m];

        int globalMin = Integer.MAX_VALUE;

        for (int i = 0; i < m; i++) {
            int mn1 = Integer.MAX_VALUE;
            int mn2 = Integer.MAX_VALUE;

            for (int x : units[i]) {
                if (x < mn1) {
                    mn2 = mn1;
                    mn1 = x;
                } else if (x < mn2) {
                    mn2 = x;
                }
            }

            r[i] = mn1;

            if (units[i].length == 1) {
                s[i] = 0;
            } else {
                s[i] = mn2;
            }

            gain[i] = (long) s[i] - r[i];

            base += r[i];
            globalMin = Math.min(globalMin, r[i]);
        }

        long answer = base;

        TreeMap<Integer, Long> add = new TreeMap<>();

        for (int i = 0; i < m; i++) {
            if (gain[i] > 0) {
                add.put(r[i], add.getOrDefault(r[i], 0L) + gain[i]);
            }
        }

        List<Integer> keys = new ArrayList<>(add.keySet());
        Collections.sort(keys);

        Map<Integer, Long> suffixGain = new HashMap<>();
        long running = 0;

        for (int i = keys.size() - 1; i >= 0; i--) {
            running += add.get(keys.get(i));
            suffixGain.put(keys.get(i), running);
        }

        Map<Integer, Long> bestAtR = new HashMap<>();
        for (int i = 0; i < m; i++) {
            bestAtR.put(
                r[i],
                Math.max(bestAtR.getOrDefault(r[i], Long.MIN_VALUE), gain[i])
            );
        }

        Set<Integer> allR = new HashSet<>();
        for (int x : r) {
            allR.add(x);
        }

        for (int t : allR) {
            long curGain = suffixGain.getOrDefault(t, 0L);

            boolean hasPositiveAtT = false;
            for (int i = 0; i < m; i++) {
                if (r[i] == t && gain[i] > 0) {
                    hasPositiveAtT = true;
                    break;
                }
            }

            if (!hasPositiveAtT) {
                curGain += bestAtR.get(t);
            }

            long candidate = base + curGain;

            if (t == globalMin) {
                int minBase = Integer.MAX_VALUE;

                for (int i = 0; i < m; i++) {
                    boolean selected =
                        (r[i] > t && gain[i] > 0) ||
                        (r[i] == t && gain[i] > 0);

                    int after = selected ? s[i] : r[i];
                    minBase = Math.min(minBase, after);
                }

                if (minBase > t) {
                    candidate -= (minBase - t);
                }
            }

            answer = Math.max(answer, candidate);
        }

        return answer;
    }
}