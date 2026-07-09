// Last updated: 7/9/2026, 3:07:01 PM
import java.util.*;

class Solution {

    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        backtrack(candidates, target, 0, new ArrayList<>());
        return result;
    }

    private void backtrack(int[] candidates, int target,
                           int start, List<Integer> curr) {

        if (target == 0) {
            result.add(new ArrayList<>(curr));
            return;
        }

        if (target < 0)
            return;

        for (int i = start; i < candidates.length; i++) {

            curr.add(candidates[i]);

            backtrack(candidates,
                      target - candidates[i],
                      i,
                      curr);

            curr.remove(curr.size() - 1);
        }
    }
}