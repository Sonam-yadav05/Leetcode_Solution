class Solution {
    int sum;
    public int subsetXORSum(int[] nums) {
        sum=0;
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> current = new ArrayList<>();
        findSubsets(nums,0,current,result);
        return sum;
        
    }
    public void findSubsets(int[] arr, int index, ArrayList<Integer> current,ArrayList<ArrayList<Integer>> result) {
        if (index == arr.length) {
            if(current.size()==0) sum += 0;
            else {
                int xor = current.get(0);
                for(int i=1;i<current.size();i++){
                    xor ^= current.get(i);
                }
                sum += xor;
            }
            result.add(new ArrayList<>(current));
            return;
        }
        current.add(arr[index]);
        findSubsets(arr, index + 1, current, result);
        current.remove(current.size() - 1);
        findSubsets(arr, index + 1, current, result);
    }
}