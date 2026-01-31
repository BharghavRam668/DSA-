class Solution {
    public int totalHammingDistance(int[] nums) {
        int ans = 0;
        int n = nums.length;

        for (int bit = 0; bit < 32; bit++) {
            int ones = 0;
            for (int x : nums) {
                if (((x >> bit) & 1) == 1)
                    ones++;
            }
            ans += ones * (n - ones);
        }
        return ans;
    }
}
