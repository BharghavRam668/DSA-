class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        int ans = Integer.MAX_VALUE;
        for(int i = 0 ; i<nums.length ; i++){
            int currentOR= 0;
            for(int j = i ; j <nums.length ; j++){
                currentOR = currentOR | nums[j];
                if(currentOR >= k){
                    ans = Math.min(ans,j-i+1);
                    break;
                }
                
            }
        }
        if(ans == Integer.MAX_VALUE){
            return -1;
        }
        return ans;
    }
}