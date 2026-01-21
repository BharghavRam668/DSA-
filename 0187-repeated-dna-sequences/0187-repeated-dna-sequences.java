import java.util.*;

class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> res = new ArrayList<>();
        if (s.length() < 10) return res;

        int[] map = new int[26];
        map['A' - 'A'] = 0;
        map['C' - 'A'] = 1;
        map['G' - 'A'] = 2;
        map['T' - 'A'] = 3;

        Set<Integer> seen = new HashSet<>();
        Set<Integer> added = new HashSet<>();

        int hash = 0;
        for (int i = 0; i < s.length(); i++) {
            hash = ((hash << 2) | map[s.charAt(i) - 'A']) & ((1 << 20) - 1);
            if (i >= 9) {
                if (!seen.add(hash) && added.add(hash)) {
                    res.add(s.substring(i - 9, i + 1));
                }
            }
        }
        return res;
    }
}
