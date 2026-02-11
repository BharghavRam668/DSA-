class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int n = s.length();
        long totalshifts = 0;
        char[] car = s.toCharArray();

        for(int i = n -1 ; i>=0 ; i--){
            totalshifts += (shifts[i] % 26);

            int newchar = (car[i]-'a' + (int) totalshifts) % 26;

            car[i] = (char) ('a' + newchar);
        }
        return new String(car);
    }
}
