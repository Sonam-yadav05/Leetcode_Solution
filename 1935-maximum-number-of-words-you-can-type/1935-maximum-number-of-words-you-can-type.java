class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int count=0;
        String[] str = text.split(" ");

        for(int i=0;i<str.length;i++){
            boolean flag = true;
            for(char ch : str[i].toCharArray()){
                if(brokenLetters.indexOf(ch)!=-1){
                    flag=false;
                    break;
                }
            }
            if(flag){
                count++;
            }
            
        }
        return count;
    }
}