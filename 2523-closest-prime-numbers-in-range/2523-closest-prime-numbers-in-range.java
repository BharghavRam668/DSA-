class Solution {
    public int[] closestPrimes(int left, int right) {
        
        boolean[] isprime = new boolean[right+1];
        ArrayList<Integer> list = new ArrayList<>();
        int[] ans = new int[]{-1,-1};
        int mindiff = Integer.MAX_VALUE;

        
        for(int i = 2 ; i <= right ; i++){
            isprime[i] = true;
        }
        for(int i = 2 ; i*i <= right ; i++){
            if(isprime[i]){
                int j = i * i;
                while(j<=right){
                    isprime[j] = false;
                    j = j + i;
                }
            }
        }

        for(int i = 2 ; i <= right ; i++){
            if(i>=left && isprime[i]){
                list.add(i);
            }
        }
        if(list.size() < 2 ){
            return ans;
        }
        
      
        ans[0]= list.get(0);
        ans[1] = list.get(1);
        for(int i = 1 ; i <list.size() ; i++ ){
            int diff = list.get(i) - list.get(i-1);
            if(diff<mindiff){
                mindiff = diff;
                ans[0] = list.get(i-1);
                ans[1] = list.get(i);
            }
        }
        return ans; 
    }
}