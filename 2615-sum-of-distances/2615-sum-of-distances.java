import java.util.*;

class Solution {
    public long[] distance(int[] nums) {
            int n = nums.length;
                    long[] res = new long[n];

                            // Step 1: group indices by value
                                    Map<Integer, List<Integer>> map = new HashMap<>();
                                            for (int i = 0; i < n; i++) {
                                                        map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
                                                                }

                                                                        // Step 2: process each group
                                                                                for (List<Integer> list : map.values()) {
                                                                                            int size = list.size();
                                                                                                        long[] prefix = new long[size];

                                                                                                                    // build prefix sum of indices
                                                                                                                                prefix[0] = list.get(0);
                                                                                                                                            for (int i = 1; i < size; i++) {
                                                                                                                                                            prefix[i] = prefix[i - 1] + list.get(i);
                                                                                                                                                                        }

                                                                                                                                                                                    // compute result for each index
                                                                                                                                                                                                for (int i = 0; i < size; i++) {
                                                                                                                                                                                                                long index = list.get(i);

                                                                                                                                                                                                                                // left side contribution
                                                                                                                                                                                                                                                long left = (long)i * index - (i > 0 ? prefix[i - 1] : 0);

                                                                                                                                                                                                                                                                // right side contribution
                                                                                                                                                                                                                                                                                long right = (prefix[size - 1] - prefix[i]) - (long)(size - i - 1) * index;

                                                                                                                                                                                                                                                                                                res[(int)index] = left + right;
                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                    }

                                                                                                                                                                                                                                                                                                                            return res;
                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                }