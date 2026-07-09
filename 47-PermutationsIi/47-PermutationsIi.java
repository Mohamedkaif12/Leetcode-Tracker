// Last updated: 7/9/2026, 3:06:52 PM
class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        backtrack(nums, new boolean[nums.length], new ArrayList<>());
        return ans;
    }

    private void backtrack(int[] nums, boolean[] used, List<Integer> temp) {

        if (temp.size() == nums.length) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            if (used[i])
                continue;

            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])
                continue;

            used[i] = true;
            temp.add(nums[i]);

            backtrack(nums, used, temp);

            temp.remove(temp.size() - 1);
            used[i] = false;
        }
    }
}