class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        boolean res=true;
        int prev=-1;
        int current=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1&&current==-1)
            {
                current=i;
            }
            else if(nums[i]==1)
            {
                prev=current;
                current=i;
            }
            if(prev!=-1 && current!=-1 && (current-prev-1)<k)
            {
                res=false;
                break;
            }
        }
        return res;
    }
}