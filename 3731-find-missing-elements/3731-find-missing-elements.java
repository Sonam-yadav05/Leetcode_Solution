class Solution {
    public List<Integer> findMissingElements(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }
        }
        HashSet<Integer> set = new HashSet<>();
        for(int ele : arr){
            set.add(ele);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=min;i<=max;i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }
        return ans;
        
    }
}