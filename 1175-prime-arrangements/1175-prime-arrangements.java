class Solution {
    public int numPrimeArrangements(int n) {
        int MOD = 1000000007;
        int count =0;
        if(n <= 2){
            return 1;
        }
        boolean[] prime = new boolean[n+1];
        if (n <= 2) return 0;
        for(int i = 2 ; i <= n ; i++){
            prime[i] = true;
        }
        for(int i = 2 ; i * i <= n ; i++){
            if(prime[i]){
                int j = i * i;
                while(j<=n){
                    prime[j] = false;
                    j = j + i;
                }
            }
        }

        for(int i = 2 ; i<= n ; i++){
            if(prime[i]){
                count++;
            }
        }
        long res = (fact(count , MOD) *  fact(n - count, MOD)) % MOD ;
        return (int)res;
    }
      
        public long fact(int x , int MOD){
            long ans = 1;
            for(int i = 2 ; i<= x ; i++){
                ans = (ans * i) % MOD;
            }
            return ans;
        }
}
