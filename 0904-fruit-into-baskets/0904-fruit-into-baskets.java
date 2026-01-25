class Solution {
    public int totalFruit(int[] fruits) {
        int left = 0, max = 0;
        int type1 = -1, type2 = -1;
        int count1 = 0, count2 = 0;

        for (int right = 0; right < fruits.length; right++) {
            int f = fruits[right];

            if (f == type1) {
                count1++;
            } else if (f == type2) {
                count2++;
            } else if (type1 == -1) {
                type1 = f;
                count1 = 1;
            } else if (type2 == -1) {
                type2 = f;
                count2 = 1;
            } else {
                max = Math.max(max, right - left);
                while (count1 > 0 && count2 > 0) {
                    int lf = fruits[left++];
                    if (lf == type1) count1--;
                    else count2--;
                }
                if (count1 == 0) {
                    type1 = f;
                    count1 = 1;
                } else {
                    type2 = f;
                    count2 = 1;
                }
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
