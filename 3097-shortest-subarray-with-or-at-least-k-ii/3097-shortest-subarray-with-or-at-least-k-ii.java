class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        int ans = Integer.MAX_VALUE;

        Map<Integer, Integer> prev = new HashMap<>();

        for (int num : nums) {
            Map<Integer, Integer> curr = new HashMap<>();

            curr.put(num, 1);

            for (Map.Entry<Integer, Integer> entry : prev.entrySet()) {
                int newOr = entry.getKey() | num;
                int newLen = entry.getValue() + 1;

                curr.put(newOr, Math.min(
                        curr.getOrDefault(newOr, Integer.MAX_VALUE),
                        newLen));
            }

            for (Map.Entry<Integer, Integer> entry : curr.entrySet()) {
                if (entry.getKey() >= k) {
                    ans = Math.min(ans, entry.getValue());
                }
            }

            prev = curr;
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
