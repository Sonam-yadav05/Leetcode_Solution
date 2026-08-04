class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        int n=dictionary.size();
        String ans="";
        int maxlen=0;
        int len=0;
        for(int i=0;i<n;i++){
            String str=dictionary.get(i);
            len=str.length();
            int a=0,k=0;
            while(k<s.length() && a<len){
                if(str.charAt(a)==s.charAt(k)){
                    a++;
                    k++;
                }
                else{
                    k++;
                }
            }
            if(a==len && len>maxlen){
                ans=str;
                maxlen=len;
            }
            if(ans.length()==str.length() && a==len){
                int j=0;
                while(j<len){
                    if(ans.charAt(j) > str.charAt(j)){
                        ans = str;
                        break;
                    }
                    else if(ans.charAt(j) < str.charAt(j)){
                        break;
                    }
                    j++;
                }
            }

        }
        return ans;
        
    }
}