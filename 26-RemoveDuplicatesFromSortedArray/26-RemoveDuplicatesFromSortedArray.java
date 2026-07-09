// Last updated: 7/9/2026, 3:07:20 PM
class Solution {
    public int removeDuplicates(int[] nums) {

        int index = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[i - 1]) {
                nums[index++] = nums[i];
            }
        }

        return index;
    }
}