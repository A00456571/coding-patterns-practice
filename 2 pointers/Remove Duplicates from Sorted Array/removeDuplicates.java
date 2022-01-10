//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
class Solution {
    public int removeDuplicates(int[] nums) {
        //sorted array ascending
        int s = 0;
    
        for(int i = 0;i<nums.length&&s<nums.length;i++)
        {
            
            while(i!=nums.length-1 && nums[i]==nums[i+1])
            {
                i++;
            }
            s++;
            if(i>=s&&i!=nums.length-1)
            {
                 nums[s]=nums[i+1];
            }
        }
        return s;
    }
}
