class Solution {
    public int minMoves(int[] nums) {
        int min=Arrays.stream(nums).min().getAsInt();
        int res=0;
        for(int x:nums)
        {
           res+=(x-min);
        }
        return res;
    }
}