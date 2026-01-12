class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double ws = 0;
        
        for(int i = 0 ; i < k ; i++){
            ws = ws + nums[i] ;
        }
        double max = ws;
        for(int i = k ; i < nums.length ; i++){
            ws = ws + nums[i] - nums[i-k];
            max = Math.max(max,ws);
        }
        return max/k;
    }
}