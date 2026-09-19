class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freq = new int[26];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }

        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            freq[ch - 'a']--;
        }

        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0) return false;
        }
        return true;


        // char[] st1=s.toCharArray();
        // char[] st2=t.toCharArray();
        // Arrays.sort(st1);
        // Arrays.sort(st2);
        // int n=st1.length,m=st2.length;
        // int i=0;
        // while(i<n){
        //     if(n!=m) return false;
        //     else if(st1[i]!=st2[i]) return false;
        //     else i++;
        // }
        // return true;
        
    }
}