class Solution {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        int[] arr = new int[2];
        for(int i = 0; i < nums.length; i++){
            hashmap.put(nums[i], nums[i]);
            for(int j = 0; j < nums.length; j++){
                if(i != j && nums[i] + nums[j] == target){
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
            }
        }
        return arr;
    }
}
