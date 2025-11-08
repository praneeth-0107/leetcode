class Solution {
    public int xsum(int[] a,int start,int end,int x)
    {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=start;i<end;i++)
        {
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }

        List<Map.Entry<Integer,Integer>> li=new ArrayList<>(map.entrySet());
        li.sort((aj,b)-> { 
            if(!aj.getValue().equals(b.getValue()))
            {
                return b.getValue()-aj.getValue();
            }
            else{
                return b.getKey()-aj.getKey();
            }
        });

        int sum=0;
        for(int i=0;i<Math.min(x,li.size());i++)
        {
            Map.Entry<Integer,Integer> entry= li.get(i);
            sum+=entry.getKey()*entry.getValue();
        }
        return sum;
         

        

    }
    public int[] findXSum(int[] nums, int k, int x) {
        List<Integer> li=new ArrayList<>();
        for(int i=0;i<=nums.length-k;i++)
        {
            li.add(xsum(nums,i,i+k,x));
        }
         
         int[] res=new int[li.size()];
         for(int i=0;i<li.size();i++){
            res[i]=li.get(i);
         }
         return res;
    }
}