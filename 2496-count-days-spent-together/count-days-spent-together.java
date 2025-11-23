class Solution {

    private int days(String str)
    {
        int[] month={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int sum=0;
        int m=Integer.valueOf(str.substring(0,2));
        int d=Integer.valueOf(str.substring(3,5));
        for(int i=0;i<m-1;i++)
        {
            sum+=month[i];
        }
        return sum+d;
    }
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {

        int a1=days(arriveAlice);
        int l1=days(leaveAlice);
        int a2=days(arriveBob);
        int l2=days(leaveBob);
        if(l1<a2||a1>l2)
        {
            return 0;
        }
        return Math.abs(Math.max(a1,a2)-Math.min(l1,l2))+1;
        
    }
}