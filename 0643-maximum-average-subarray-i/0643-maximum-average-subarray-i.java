class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avg = 0;
        double max = Integer.MAX_VALUE;
        for(int i = 0 ; i< k ; i++){
            avg = avg + nums[i];
        }
        max = avg;
        for(int i = k ; i < nums.length ; i++){
            avg = avg + nums[i] - nums[i-k];
            max = Math.max(avg,max);
        }
        return max/k;
    }
}