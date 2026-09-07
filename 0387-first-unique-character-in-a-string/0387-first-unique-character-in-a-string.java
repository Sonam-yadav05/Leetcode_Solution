class Solution {
    public int firstUniqChar(String s) {
        int idx=-1;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int fidx=s.indexOf(ch);
            int lidx=s.lastIndexOf(ch);
            if (fidx == lidx) {
                return i;
            }
        }
        return -1;
    }
}