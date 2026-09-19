class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int lastBad = -1;
        int lastGood = -1;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > right) {
                lastBad = i;
            }

            if (nums[i] >= left) {
                lastGood = i;
            }

            count += lastGood - lastBad;
        }

        return count;
    }
}