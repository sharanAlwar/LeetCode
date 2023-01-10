class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int x:nums) set.add(x);
        int i;
        for( i=1;i<=nums.length;i++){
            if(!set.contains(i))
            return i;
        }
        return i;
    }
}
