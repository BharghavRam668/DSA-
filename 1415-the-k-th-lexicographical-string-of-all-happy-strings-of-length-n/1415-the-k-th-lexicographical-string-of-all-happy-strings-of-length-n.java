class Solution {
        public String getHappyString(int n, int k) {

                if(k > 3 * (1 << (n - 1))) return "";

                        StringBuilder sb = new StringBuilder();
                                char prev = '#';

                                        for(int i = 0; i < n; i++){
                                                    for(char c : new char[]{'a','b','c'}){
                                                                    if(c == prev) continue;

                                                                                    int count = 1 << (n - i - 1);

                                                                                                    if(k > count) k -= count;
                                                                                                                    else{
                                                                                                                                        sb.append(c);
                                                                                                                                                            prev = c;
                                                                                                                                                                                break;
                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                            return sb.toString();
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                }
