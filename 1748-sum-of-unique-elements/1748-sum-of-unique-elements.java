class Solution {
    public int sumOfUnique(int[] nums) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set1.contains(nums[i])){
                set2.remove(nums[i]);
                set1.add(nums[i]);
            }
            else{
                set1.add(nums[i]);
                set2.add(nums[i]);
            }
        }
        int sum=0;
        for(int val : set2){
            sum += val;
        }
        return sum;

        
    }
}