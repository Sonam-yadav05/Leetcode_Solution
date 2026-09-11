
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

// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         int n = s.length();
//         if (n == 0) return 0; 
//         int i=0;
//         int j=1;
//         int maxSize = 1;
//         while(j<n){
//             int k=i;
//             int size = 1;
//             while(k<j && j<n){
//                 if(s.charAt(k)!=s.charAt(j)){
//                     k++;
//                     size = j - i + 1;
//                     maxSize = Math.max(size,maxSize);
//                 }
//                 else{
//                     size = j - i;
//                     maxSize = Math.max(size,maxSize);
//                     i=k+1;
//                     k=i;
//                     break;
//                 }
//             }
//             j++;
//         }
//         return maxSize;
        
//     }
// }