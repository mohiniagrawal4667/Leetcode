
import java.util.*;

class Solution {
    String[] key = {"", "", "abc", "def", "ghi",
                    "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();

        if (digits.length() == 0) {
            return ans;
        }

        solve(digits, 0, "", ans);
        return ans;
    }

    void solve(String digits, int index, String current,
               List<String> ans) {

        if (index == digits.length()) {
            ans.add(current);
            return;
        }

        int num = digits.charAt(index) - '0';
        String letters = key[num];

        for (int i = 0; i < letters.length(); i++) {
            solve(digits, index + 1,
                  current + letters.charAt(i), ans);
        }
    }
}
