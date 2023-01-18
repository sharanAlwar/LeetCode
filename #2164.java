class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int[] even = new int[nums.length % 2 == 0 ? nums.length / 2 : nums.length / 2 + 1];
        Integer[] odd = new Integer[nums.length / 2];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                even[count] = nums[i];
            } else {
                odd[count++] = nums[i];
            }
        }
        Arrays.sort(even);
        Arrays.sort(odd, Comparator.reverseOrder());
        count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                nums[i] = even[count];
            } else {
                nums[i] = odd[count++];
            }
        }
        return nums;
    }
}
