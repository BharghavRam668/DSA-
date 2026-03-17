class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int currsum = nums[0];
        
        if(nums.length < 2){
            return nums[0];
        }
        for(int i = 1 ; i< nums.length ; i++){
            
            currsum = Math.max(nums[i], currsum + nums[i]);
            max = Math.max(max,currsum);
        }
        return max;
    }
}