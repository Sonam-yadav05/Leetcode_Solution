class Solution {
    public String arrangeWords(String text) {
        String[] str = text.split(" ");
        for(int i=0;i<str.length;i++){
            for(int j=0;j<str.length-i-1;j++){
                if(str[j].length() > str[j+1].length()){
                    String temp = str[j];
                    str[j]=str[j+1];
                    str[j+1]=temp;
                }
            }
        }
        String ans = "";
        for(int i=0;i<str.length;i++){

            ans += str[i];
            if(i!=str.length-1){
                ans +=" ";
            }
        }
        String result = ans.substring(0,1).toUpperCase()+ans.substring(1).toLowerCase();
        return result;





















        // HashMap<String,Integer> map = new HashMap<>();

        // for(String s : str){
        //     map.put(s,s.length());
        // }
        // List<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());
        // list.sort(Map.Entry.comparingByValue());

        // String s = "";
        // for(Map.Entry<String,Integer> entry : list){
        //     s += entry.getKey() + " ";
        // }
        // String result = s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase();
        // return result;
        
    }
}