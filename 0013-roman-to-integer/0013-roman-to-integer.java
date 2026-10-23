
class Solution {
    public int romanToInt(String s) {
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            int curr = 0;

            if (s.charAt(i) == 'I') curr = 1;
            else if (s.charAt(i) == 'V') curr = 5;
            else if (s.charAt(i) == 'X') curr = 10;
            else if (s.charAt(i) == 'L') curr = 50;
            else if (s.charAt(i) == 'C') curr = 100;
            else if (s.charAt(i) == 'D') curr = 500;
            else if (s.charAt(i) == 'M') curr = 1000;

            if (i + 1 < s.length()) {
                int next = 0;

                if (s.charAt(i + 1) == 'I') next = 1;
                else if (s.charAt(i + 1) == 'V') next = 5;
                else if (s.charAt(i + 1) == 'X') next = 10;
                else if (s.charAt(i + 1) == 'L') next = 50;
                else if (s.charAt(i + 1) == 'C') next = 100;
                else if (s.charAt(i + 1) == 'D') next = 500;
                else if (s.charAt(i + 1) == 'M') next = 1000;

                if (curr < next) {
                    ans -= curr;
                } else {
                    ans += curr;
                }
            } else {
                ans += curr;
            }
        }

        return ans;
    }
}
