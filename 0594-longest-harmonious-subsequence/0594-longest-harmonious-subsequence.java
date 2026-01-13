class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum =0;
        int max = 0;
        Arrays.sort(nums);
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int k : map.keySet()){
            if(map.containsKey(k+1)){
                sum = map.get(k) + map.get(k+1);
            }
            max = Math.max(max,sum);
        } 
        return max;
    }
}