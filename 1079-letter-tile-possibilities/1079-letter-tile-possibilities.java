class Solution {
    public int numTilePossibilities(String tiles) {
        int[] freq = new int[26];

        // Count frequency of each letter
        for (int i = 0; i < tiles.length(); i++) {
            freq[tiles.charAt(i) - 'A']++;
        }

        return backtrack(freq);
    }

    public int backtrack(int[] freq) {
        int count = 0;

        for (int i = 0; i < 26; i++) {

            // If this letter is available
            if (freq[i] > 0) {

                count++;

                // Use this letter
                freq[i]--;

                // Generate remaining sequences
                count += backtrack(freq);

                // Restore the letter
                freq[i]++;
            }
        }

        return count;
    }
}
