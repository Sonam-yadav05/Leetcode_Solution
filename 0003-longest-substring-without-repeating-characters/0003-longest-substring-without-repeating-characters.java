
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();

        if (n == 0) {
            return 0;
        }

        int i = 0;
        int j = 0;
        int maxSize = 0;

        while (j < n) {
            int k = i;

            while (k < j) {
                if (s.charAt(k) == s.charAt(j)) {
                    i = k + 1;
                    break;
                }
                k++;
            }

            int size = j - i + 1;
            maxSize = Math.max(size, maxSize);

            j++;
        }

        return maxSize;
    }
}
