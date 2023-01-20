class Solution {
    public int[] sortArrayByParity(int[] nums) {
        for (int i = 0, j = nums.length - 1; i < j;) {
            if (nums[i] % 2 == 1) {
                int x = nums[i];
                nums[i] = nums[j];
                nums[j] = x;
                --j;
            } else {
                ++i;
            }
        }
        return nums;
    }
}
