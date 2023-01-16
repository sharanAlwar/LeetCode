class Solution {
    public String restoreString(String s, int[] indices) {
        String ans = "";
        HashMap<Integer,Character> map = new HashMap<>();
        //hashmap
        for (int i = 0; i < indices.length; i++) {
            map.put(indices[i],s.charAt(i));
        }
        for(int i : map.keySet()){
            ans += map.get(i);
        }
        return ans;
    }
}
