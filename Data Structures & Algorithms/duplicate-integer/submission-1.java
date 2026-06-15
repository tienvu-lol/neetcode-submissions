class Solution {
    public boolean hasDuplicate(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++)
        {
            for(int o = 0; o < nums.length; o++)
            {
                if(nums[i] == nums[o])
                count++;
            }
        }
        return count > nums.length;
    }
}