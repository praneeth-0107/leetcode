class Solution {
    public boolean istria(int[] nums)
    {
        if(nums[0]+nums[1]>nums[2] && nums[1]+nums[2]>nums[0] && nums[0]+nums[2]>nums[1]){return true;}
        return false;
    }
    public String triangleType(int[] nums) {
        if(istria(nums))
        { 
            if(nums[0]==nums[1] && nums[1]==nums[2])return "equilateral";
            else if(nums[0]==nums[1] || nums[1]==nums[2] || nums[0]==nums[2])return "isosceles";
            else return "scalene";

        }
        return "none";
    }
}