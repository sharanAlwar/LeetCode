class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] ans = new int[nums.length];
        int eptr = 0;
        int optr = 1;
        for (int i = 0; i < nums.length; i++) {
            int a;
            String b;
            if(nums[i] % 2 == 0){
                a = nums[i];
                b = "e";
            }else{
                a = nums[i];
                b = "0";
            }
            if(b.equals("e")){
                ans[eptr] = a;
                eptr+=2;
            }else{
                ans[optr] = a;
                optr+=2;
            }
            
        }
        return ans;
    }
}
