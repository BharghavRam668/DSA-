class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] result = new int[nums.length ];
        int[] leftsum = new int[nums.length + 1];
        int[] rightsum = new int[nums.length + 1];

        if(nums.length < 2){
            return result;
        }
        for(int i = 1 ; i < nums.length ; i++){
            leftsum[i] = leftsum[i-1]  + nums[i-1];
            
        }

        for(int i = nums.length - 2 ; i >=0 ; i-- ){
            rightsum[i] = rightsum[i+1] + nums[i+1];
        }

        for(int i = 0 ; i < nums.length ; i++){
            result[i] = Math.abs(leftsum[i]-rightsum[i]);
        }
        return result;
    }
}