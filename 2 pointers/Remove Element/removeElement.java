//https://leetcode.com/problems/remove-element/
class Solution {
    public int removeElement(int[] nums, int key) {
        int notKey = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(key!=nums[i])
            {
                nums[notKey++] = nums[i];
            }
        }
        return notKey;
    }
}
