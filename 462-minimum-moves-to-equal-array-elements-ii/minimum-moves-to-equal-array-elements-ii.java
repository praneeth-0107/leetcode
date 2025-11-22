class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int res=0;
        int med=nums[nums.length/2];
        for(int x:nums)
        {
            res+=Math.abs(x-med);
        }
        return res;
    }
}