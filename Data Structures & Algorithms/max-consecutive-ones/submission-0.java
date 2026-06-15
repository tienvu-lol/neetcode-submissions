class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int x = 0;
        int xMax = 0;
        int max = 0;
        for(int i = 0; i < nums.length; i++)
        {
             
            if(nums[i] == 1)
            {
                x++;
            }
            else
            {
                x = 0;
            }
            if(xMax <= x)
                    xMax = x;

        }
        return xMax;
    }
}