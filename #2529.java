class Solution {
    public int maximumCount(int[] nums) {
        int even = 0;
        int odd = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                even++;
            }else if(nums[i]<0){
                odd++;
            }
        }
        return (even>odd)? even : odd;
    }
}
