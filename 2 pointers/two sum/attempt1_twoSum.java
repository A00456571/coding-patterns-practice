class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        HashMap<Integer,Integer> diff = new HashMap<Integer,Integer>();
        int temp;
        for(int i=0;i<nums.length;i++)
        {
            temp = target-nums[i];
            if(diff.containsKey(nums[i]))
                return new int[]{i,diff.get(nums[i])};
            diff.put(temp,i);
        }
        return new int[]{};
    }
}
