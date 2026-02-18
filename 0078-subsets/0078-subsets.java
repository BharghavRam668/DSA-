class Solution {

        public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        solve(0, nums, new ArrayList<>(), res);
        return res;
        }

        static void solve(int index, int[] nums,List<Integer> current,List<List<Integer>> res) {
            if (index == nums.length) {
                res.add(new ArrayList<>(current));
                return;
            }
            current.add(nums[index]);
            solve(index + 1, nums, current, res);

            current.remove(current.size() - 1);
            solve(index + 1, nums, current, res);
        }    
}


