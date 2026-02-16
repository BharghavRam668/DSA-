class Solution {
    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int ans = 0;
        int l = 0;
        int r = plants.length - 1 ;
        int leftsum = capacityA;
        int rightsum = capacityB;

        
        while(l<r){

            if(leftsum < plants[l]){
                ans++;
                leftsum = capacityA;
            }
            leftsum -= plants[l];
            l++;

            if(rightsum < plants[r]){
                ans++;
                rightsum = capacityB;
            }
            rightsum -= plants[r];
            r--;

            if(l==r){
                if(Math.max(leftsum,rightsum) < plants[r]){
                    ans++;
                }
            }
        }
        return ans;
    }
}