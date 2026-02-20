class Solution {
        public List<String> letterCombinations(String digits) {

                List<String> ans = new ArrayList<>();
                        if (digits == null || digits.length() == 0) return ans;

                                String[] map = {
                                            "", "", "abc", "def", "ghi",
                                                        "jkl", "mno", "pqrs", "tuv", "wxyz"
                                                                };

                                                                        Queue<String> q = new LinkedList<>();
                                                                                q.offer("");

                                                                                        for (int i = 0; i < digits.length(); i++) {

                                                                                                    int size = q.size();
                                                                                                                String letters = map[digits.charAt(i) - '0'];

                                                                                                                            for (int s = 0; s < size; s++) {
                                                                                                                                            String curr = q.poll();

                                                                                                                                                            for (char ch : letters.toCharArray()) {
                                                                                                                                                                                q.offer(curr + ch);
                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                                    }

                                                                                                                                                                                                                            ans.addAll(q);
                                                                                                                                                                                                                                    return ans;
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        }
