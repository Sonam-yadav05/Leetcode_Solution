class Solution {
    public String reverseStr(String s, int k) {
        String str = "";
        int i=0;
        while(i<s.length()){
            str += reverse(s,i,i+k-1);
            str += same(s,i+k,i+2*k-1);
            i=i+2*k;
        }
        return str;        
    }
    public static  String reverse(String s,int i,int j){
        StringBuilder str = new StringBuilder();
        if(j>s.length()-1) j=s.length()-1;
        for(int k=j;k>=i;k--){
            str.append(s.charAt(k));
        }
        return str.toString();
    }
    public static String same(String s,int i,int j){
        StringBuilder str = new StringBuilder();
        if(j>s.length()-1) j=s.length()-1;
        for(int k=i;k<=j;k++){
            str.append(s.charAt(k));
        }
        return str.toString();
    }
}