// Last updated: 7/9/2026, 3:07:37 PM
import java.util.*;

class Solution {

    List<String> result = new ArrayList<>();

    String[] map = {
        "", "", "abc", "def", "ghi",
        "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public List<String> letterCombinations(String digits) {

        if (digits.length() == 0)
            return result;

        backtrack("", digits, 0);

        return result;
    }

    private void backtrack(String curr, String digits, int index) {

        if (index == digits.length()) {
            result.add(curr);
            return;
        }

        String letters = map[digits.charAt(index) - '0'];

        for (char c : letters.toCharArray()) {
            backtrack(curr + c, digits, index + 1);
        }
    }
}