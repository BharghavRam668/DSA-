
class Solution {
    public boolean isPowerOfTwo(int n) {        
       /* if(n==1){
            return true;
        }
        if(n<=0 || n%2!=0 ){
            return false ;
        }
        return isPowerOfTwo(n/2);  */
        /*int count = 0;

        if(n<=0 ){
            return false;
        }
        while(n>1){
            if(n%2!=0){
                return false;
            }
            n = n /2;

        }
        return true;
        */
       
        return n > 0 && (n & (n - 1)) == 0;
    
    }
 
    }
