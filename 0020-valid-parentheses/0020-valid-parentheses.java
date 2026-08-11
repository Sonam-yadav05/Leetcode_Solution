class Solution {
    public boolean sameStyle(char ch,char top){
        if(ch==')'&& top =='(') return true;
        if(ch=='}'&& top =='{') return true;
        if(ch==']'&& top =='[') return true;
        return false;
    }
    public boolean isValid(String s) {
        Stack<Character> st =new Stack<>();
        int n=s.length();
        int i=0;
        while(i<n){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='{'|| ch=='['){
                st.push(ch);
            }
            else{
                if(st.size()==0) return false;
                char top=st.peek();
                if(sameStyle(ch,top)){
                    st.pop();
                }
                else return false;
            }
            i++;
        }
        if(st.isEmpty()) return true;
        return false;

        
        
    }
}