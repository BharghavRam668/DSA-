class Solution {
        public int countPrimeSetBits(int left, int right) {

                // Prime bit counts up to 32 bits
                        Set<Integer> prime = Set.of(
                                    2,3,5,7,11,13,17,19,23,29,31
                                            );

                                                    int ans = 0;

                                                            for (int i = left; i <= right; i++) {
                                                                        int bits = Integer.bitCount(i);  // fast built-in
                                                                                    if (prime.contains(bits)) ans++;
                                                                                            }

                                                                                                    return ans;
                                                                                                        }
                                                                                                        }
