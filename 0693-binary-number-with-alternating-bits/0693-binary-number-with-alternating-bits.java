class Solution {
    public boolean hasAlternatingBits(int n) {

        while(n>1){
            int x = (n&1) ^ ((n>>1)&1);
            
            if(x==0){
                return false;
            }
            n>>>=1;
        }
        return true;
    }
}