// Last updated: 7/9/2026, 3:05:58 PM
class Solution {

    List<String> ans = new ArrayList<>();

    public List<String> restoreIpAddresses(String s) {
        backtrack(s, 0, 0, "");
        return ans;
    }

    private void backtrack(String s, int index, int dots, String path) {

        if (dots == 4 && index == s.length()) {
            ans.add(path.substring(0, path.length() - 1));
            return;
        }

        if (dots > 4)
            return;

        for (int len = 1; len <= 3 && index + len <= s.length(); len++) {

            String part = s.substring(index, index + len);

            if ((part.startsWith("0") && part.length() > 1) ||
                Integer.parseInt(part) > 255)
                continue;

            backtrack(s, index + len, dots + 1, path + part + ".");
        }
    }
}