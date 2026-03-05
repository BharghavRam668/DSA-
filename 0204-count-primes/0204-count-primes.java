class Solution {
    public int countPrimes(int n) {
        
        if (n <= 2) return 0;
        boolean[] prime = new boolean[n];
        for(int i = 2 ; i < n ; i++){
            prime[i] = true;
        }
        for(int i = 2 ; i * i < n ;i++){
            if(prime[i]){
                int j = i * i;
                while(j<n){
                    prime[j] = false;
                    j = j + i;
                }
            }
        }
        int count = 0;
        for(int i = 2 ; i < n ; i++){                
            if(prime[i]){
                count++;
            }
        }
        return count;
    }
}