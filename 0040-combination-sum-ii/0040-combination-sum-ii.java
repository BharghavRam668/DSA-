class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new LinkedList<>();
        dfs(candidates, target ,0,new ArrayList<>(),res);
        return res;
    }
    public void dfs(int[] a , int t , int idx ,List<Integer> cur , List<List<Integer>> res ){
        if(t == 0){
            res.add(new ArrayList<>(cur));
            return;
        }
        for(int i = idx ; i < a.length && a[i]<=t ; i++){
            if (i > idx && a[i] == a[i - 1]) continue;
            cur.add(a[i]);
            dfs(a, t-a[i], i+1 , cur , res);
            cur.remove(cur.size() - 1);
        }
    }
}