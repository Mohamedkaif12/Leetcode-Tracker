// Last updated: 7/9/2026, 3:06:54 PM
import java.util.*;

class Solution {

    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {

        backtrack(nums, new ArrayList<>());

        return result;
    }

    private void backtrack(int[] nums, List<Integer> current) {

        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int num : nums) {

            if (current.contains(num))
                continue;

            current.add(num);

            backtrack(nums, current);

            current.remove(current.size() - 1);
        }
    }
}