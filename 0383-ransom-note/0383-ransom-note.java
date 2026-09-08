class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] chars = magazine.toCharArray();

        for(int i=0;i<ransomNote.length();i++){
            int count=0;
            for(int j=0;j<chars.length;j++){
                if(ransomNote.charAt(i)==chars[j]){
                    count=1;
                    chars[j]='&';
                    break;
                }
            }
            if(count==0) return false;
        }
        return true;
        
    }
}