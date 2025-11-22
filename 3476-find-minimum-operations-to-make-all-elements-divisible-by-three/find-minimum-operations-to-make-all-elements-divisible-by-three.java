class Solution {
    public int minimumOperations(int[] nums) {
        int res=0;
        for(int x:nums)
        {
            if(x%3!=0)
            {
                res+=1;
            }
        }
        return res;
    }
}