class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i : map.keySet()) {
        	if(1==map.get(i)) {
        		return i;
        	}
        }
        return -1;
    }
}
