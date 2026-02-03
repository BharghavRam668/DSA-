class Solution {
    public int[] sortByBits(int[] arr) {
        /*int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] res = new int[arr.length];
        res[0] = 0;
        for(int i = 0 ; i< arr.length ; i++){
            while(i>0){
                count = count + (arr[i] & 1);
                arr[i]>>=1;
            }
            map.put(arr[i],count);
        }
        for(int key : map.KeySet()){
            if(map.get(key) == 0){
                res[i] = key;
            }            
        }
        */
       
        Integer[] a = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) a[i] = arr[i];

        Arrays.sort(a, (x, y) -> {
            int cx = bits(x), cy = bits(y);
            return cx == cy ? x - y : cx - cy;
        });

        for (int i = 0; i < arr.length; i++) arr[i] = a[i];
        return arr;
    }

    private int bits(int n) {
        int c = 0;
        while (n > 0) {
            n &= (n - 1); 
            c++;
        }
        return c;
    }
}


    
