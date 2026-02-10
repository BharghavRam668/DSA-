class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int n = s.length();
        long totalShift = 0;  
        char[] arr = s.toCharArray();

        for (int i = n - 1; i >= 0; i--) {
            totalShift = (totalShift + shifts[i]) % 26;

            int shifted = (arr[i] - 'a' + (int) totalShift) % 26;
            arr[i] = (char) ('a' + shifted);
        }

        return new String(arr);
    }
}
