// Last updated: 7/9/2026, 3:06:05 PM
class Solution {

    public List<Integer> grayCode(int n) {

        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < (1 << n); i++)
            ans.add(i ^ (i >> 1));

        return ans;
    }
}