class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> result = new ArrayList<>();
        helper(n,0,0,"",result);
        return result;
    }

    private void helper(int n , int open , int close , String curr , List<String> result){
        if(curr.length() == 2 * n){
            result.add(curr);
            return;
        }

        if(open < n){
            helper(n,open+1,close,curr +"(",result);
        }
        if(close<open){
            helper(n , open , close+ 1 , curr + ")",result);
        }
    }
}