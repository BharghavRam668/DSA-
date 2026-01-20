class Solution {
    public int countGoodSubstrings(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int k =3;
        int count =0;
        char[] ch = s.toCharArray();
        if(s.length()<k){
            return 0;
        }
        for(int i = 0 ; i< k ; i++){
            map.put(ch[i],map.getOrDefault(ch[i],0)+1);
        }
        if(map.size() == k){
            count++;
        }
        for(int i = k ; i< s.length() ; i++){
            
            map.put(ch[i],map.getOrDefault(ch[i],0)+1);

            map.put(ch[i-k],map.get(ch[i-k])-1);
            if(map.get(ch[i-k])==0){
                map.remove(ch[i-k]);
            }
            if(map.size() == k){
                count++;
            }
        }
        return count;
    }
}