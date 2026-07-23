// Last updated: 7/23/2026, 8:53:38 PM
1class Solution {
2    public boolean isPalindrome(String s) {
3
4        int left = 0;
5        int right = s.length() - 1;
6
7        while (left < right) {
8
9            while (left < right && !Character.isLetterOrDigit(s.charAt(left)))
10                left++;
11
12            while (left < right && !Character.isLetterOrDigit(s.charAt(right)))
13                right--;
14
15            if (Character.toLowerCase(s.charAt(left)) !=
16                Character.toLowerCase(s.charAt(right)))
17                return false;
18
19            left++;
20            right--;
21        }
22
23        return true;
24    }
25}