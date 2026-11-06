
import java.util.*;

class Solution {
    public List<Integer> sequentialDigits(int low, int high) {

        List<Integer> ans = new ArrayList<>();

        String digits = "123456789";

        // Length of the smallest and largest possible numbers
        int minLength = String.valueOf(low).length();
        int maxLength = String.valueOf(high).length();

        // Generate numbers of different lengths
        for (int len = minLength; len <= maxLength; len++) {

            // Starting position
            for (int i = 0; i + len <= 9; i++) {

                String num = digits.substring(i, i + len);

                int value = Integer.parseInt(num);

                if (value >= low && value <= high) {
                    ans.add(value);
                }
            }
        }

        return ans;
    }
}
