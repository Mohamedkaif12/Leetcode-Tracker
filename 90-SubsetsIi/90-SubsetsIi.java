// Last updated: 7/9/2026, 3:06:03 PM
class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);

        backtrack(nums, 0, new ArrayList<>());

        return ans;
    }

    private void backtrack(int[] nums, int index, List<Integer> temp) {

        ans.add(new ArrayList<>(temp));

        for (int i = index; i < nums.length; i++) {

            if (i > index && nums[i] == nums[i - 1])
                continue;

            temp.add(nums[i]);

            backtrack(nums, i + 1, temp);

            temp.remove(temp.size() - 1);
        }
    }
}