class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> li=new ArrayList<>();
        int prefix=0;
        for(int bit:nums)
        {
            prefix=((prefix<<1)+bit)%5;
            if(prefix==0)li.add(true);
            else li.add(false);
        }
        return li;
    }
}