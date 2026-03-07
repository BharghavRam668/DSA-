class Solution {
    public int maxProduct(int[] nums) {
        int ans = 1;
        int l = 0;
        int r = 0;
        int max = 0;
        if(nums.length < 2){
            return nums[0];
        }
        for( r =0 ; r < nums.length ; r++){
            ans = ans * nums[r];
            max = Math.max(ans,max);
            if(ans == 0){
                ans = 1;
            }
        }
        ans = 1;
        for( l = nums.length -1 ; l > 0  ; l--){
            ans = ans * nums[l];
            max = Math.max(ans,max);
            if(ans == 0){
                ans = 1;
            }
        }          
        return max;
    }
}