class Solution {
    public int[] countOppositeParity(int[] nums) {
        int n = nums.length;
        int[] cnt = new int[2]; 
       
        for (int num : nums) {
            
            int parity = Math.abs(num) % 2; 
            cnt[parity]++;
        }
        
        int[] ans = new int[n];
        
        for (int i = 0; i < n; i++) {
            int parity = Math.abs(nums[i]) % 2;
            cnt[parity]--; 
            ans[i] = cnt[1 - parity]; 
        }
        
        return ans;
    }
}
