class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int num: nums)
        {
            if(even(num))
            count++;
        }
        return count;
    }

    public boolean even(int num)
    {
        if(num<0)
        num=num*-1;

        return ((int)(Math.log10(num)) +1)%2==0;
    }
}
