class Solution {

    ArrayList<String> result = new ArrayList<>();
    String[] mapping = {
        "" , "" , "abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tuv" , "wxyz"
    };

    public List<String> letterCombinations(String digits){
        
        if(digits.length() == 0) return result;
        
        backtrack(0,digits,"");
        
        return result;
    }
    private void backtrack(int index , String digits , String currentString){
        if(index == digits.length()){
            result.add(currentString);
            return;
        }
        int digit = digits.charAt(index) - '0' ;
        String letters = mapping[digit];

        for(char c : letters.toCharArray()){
            backtrack(index+1 , digits , currentString + c);
        }
    }
}                                                                                                                                                                                                                                                                                   
