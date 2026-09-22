import java.util.*;

class Solution {
    public int numMatchingSubseq(String s, String[] words) {

        ArrayList<Integer>[] pos = new ArrayList[26];

        for (int i = 0; i < 26; i++) {
            pos[i] = new ArrayList<>();
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            pos[ch - 'a'].add(i);
        }

        int count = 0;

        for (String word : words) {

            int prev = -1;
            boolean possible = true;

            for (char ch : word.toCharArray()) {

                ArrayList<Integer> list = pos[ch - 'a'];

                int left = 0;
                int right = list.size() - 1;
                int answer = -1;

                while (left <= right) {
                    int mid = (left + right) / 2;

                    if (list.get(mid) > prev) {
                        answer = list.get(mid);
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                }

                if (answer == -1) {
                    possible = false;
                    break;
                }

                prev = answer;
            }

            if (possible) {
                count++;
            }
        }

        return count;
    }
}