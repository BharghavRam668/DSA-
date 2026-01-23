class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(nums.length < k || k==1){
            return 0 ;
       }
        int diff = Integer.MAX_VALUE;
        Arrays.sort(nums);

        for(int i = 0 ; i <= nums.length - k ; i++){
            diff = Math.min(diff,nums[i+k-1] - nums[i]);
        }
       
        return diff;
    }
}
