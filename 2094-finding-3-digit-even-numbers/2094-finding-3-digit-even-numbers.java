import java.util.*;

class Solution {

    public int[] findEvenNumbers(int[] digits) {
            Set<Integer> set = new HashSet<>();
                    boolean[] used = new boolean[digits.length];

                            backtrack(digits, used, 0, 0, set);

                                    List<Integer> list = new ArrayList<>(set);
                                            Collections.sort(list);

                                                    int[] result = new int[list.size()];
                                                            for(int i = 0; i < list.size(); i++) {
                                                                        result[i] = list.get(i);
                                                                                }

                                                                                        return result;
                                                                                            }

                                                                                                private void backtrack(int[] digits, boolean[] used, int length, int number, Set<Integer> set) {

                                                                                                        if(length == 3) {
                                                                                                                    if(number >= 100 && number % 2 == 0) {
                                                                                                                                    set.add(number);
                                                                                                                                                }
                                                                                                                                                            return;
                                                                                                                                                                    }

                                                                                                                                                                            for(int i = 0; i < digits.length; i++) {

                                                                                                                                                                                        if(used[i]) continue;

                                                                                                                                                                                                    // Avoid leading zero
                                                                                                                                                                                                                if(length == 0 && digits[i] == 0) continue;

                                                                                                                                                                                                                            used[i] = true;

                                                                                                                                                                                                                                        backtrack(digits, used, length + 1, number * 10 + digits[i], set);

                                                                                                                                                                                                                                                    used[i] = false; // backtrack
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                }