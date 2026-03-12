class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        
        int l = 1;
        int r = bloomDay.length;
        if((long)m*k > bloomDay.length){
            return -1;
        }
        
        for(int d : bloomDay){
            r = Math.max(r, d);
        }
   
        while(l<=r){
            int mid = l + (r - l)/2;
            boolean ans = helper(bloomDay, m, k, mid);

            if(ans){
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return l;
    }
    public boolean helper(int[] bloomDay , int m , int k , int mid){
        int flowers = 0;
        int bouquets = 0;

        for(int day : bloomDay){

            if(day <= mid){
                flowers++;
            }
            else{
                flowers = 0;
            }
            if(flowers == k){
                bouquets++;
                flowers = 0;
                                                            
            }
        }
        return bouquets >= m;
    }
}
