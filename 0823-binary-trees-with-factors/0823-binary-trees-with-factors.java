
import java.util.*;

class Solution {
    public int numFactoredBinaryTrees(int[] arr) {

        Arrays.sort(arr);

        int MOD = 1000000007;
        int n = arr.length;

        HashMap<Integer, Long> map = new HashMap<>();

        long[] dp = new long[n];

        for (int i = 0; i < n; i++) {
            map.put(arr[i], (long) i);
        }

        long ans = 0;

        for (int i = 0; i < n; i++) {

            dp[i] = 1;

            for (int j = 0; j < i; j++) {

                if (arr[i] % arr[j] == 0) {

                    int right = arr[i] / arr[j];

                    if (map.containsKey(right)) {

                        int k = map.get(right).intValue();

                        dp[i] = (dp[i] + dp[j] * dp[k]) % MOD;
                    }
                }
            }

            ans = (ans + dp[i]) % MOD;
        }

        return (int) ans;
    }
}
