class Solution {
        public int countBinarySubstrings(String s) {

                int prev = 0;   // previous group length
                        int curr = 1;   // current group length
                                int ans = 0;

                                        for (int i = 1; i < s.length(); i++) {

                                                    if (s.charAt(i) == s.charAt(i - 1)) {
                                                                    curr++;
                                                                                } else {
                                                                                                ans += Math.min(prev, curr);
                                                                                                                prev = curr;
                                                                                                                                curr = 1;
                                                                                                                                            }
                                                                                                                                                    }

                                                                                                                                                            ans += Math.min(prev, curr);  // last group
                                                                                                                                                                    return ans;
                                                                                                                                                                        }
                                                                                                                                                                        }

