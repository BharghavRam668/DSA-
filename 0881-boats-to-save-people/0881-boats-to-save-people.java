class Solution {
    public int numRescueBoats(int[] people, int limit) {
        /*int l = 0;
        int r = people.length - 1;
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0 ; i < people.length ; i++){
            list.add(people.length[i]);
        }
        while(!list.isEmpty()){
            if(list.get(l) + list.get(r) == limit){
                count++;
                list.remove(l);
                list.remove(r);
                l++;
                r--;
            }else{

            }
        */
        int count = 0;
        Arrays.sort(people);
        int l = 0;
        int r = people.length - 1;
        while(l<=r){
            if(people[l] + people[r] <= limit){
                count++;
                l++;
                r--;
            }else{
                r--;
                count++;
            }
            
        }
        return count;
    } 
}