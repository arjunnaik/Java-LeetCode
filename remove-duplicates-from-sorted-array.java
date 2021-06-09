class Solution {
    public int removeDuplicates(int[] nums) {
        int var=0;
        if(nums.length==0)
        {
            return 0;
        }
        else
        {
            
        nums[var++]=nums[0];
        for (int i=1; i<nums.length; i++)
        {
            if (nums[i]>nums[i-1])
            {
             nums[var++]=nums[i];   
            }
        }
        }
     return var;   
    }
}
