class Solution {

    int count = 0;

    void backtrack(int[] freq, int pos, int num) {
        if (pos == 3) {
            if (num % 2 == 0) count++;
            return;
        }

        for (int d = 0; d <= 9; d++) {
            if (freq[d] > 0) {

                if (pos == 0 && d == 0) continue;

                freq[d]--;
                backtrack(freq, pos + 1, num * 10 + d);
                freq[d]++;
            }
        }
    }

    public int totalNumbers(int[] digits) {
        int[] freq = new int[10];

        for (int d : digits) {
            freq[d]++;
        }

        backtrack(freq, 0, 0);
        return count;
    }
}
