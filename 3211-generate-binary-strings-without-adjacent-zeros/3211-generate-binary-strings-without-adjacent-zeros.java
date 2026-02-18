class Solution {
        public List<String> validStrings(int n) {

            List<String> res = new ArrayList<>();
            backtrack(n, "", res);
            return res;
        }

        private void backtrack(int n, String curr, List<String> res) {

            if (curr.length() == n) {
                res.add(curr);
                return;
            }
                                                                 
            backtrack(n, curr + "1", res);

            if (curr.length() == 0 || curr.charAt(curr.length() - 1) != '0') {
                backtrack(n, curr + "0", res);
            }
        }
}

