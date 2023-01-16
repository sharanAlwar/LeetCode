class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:arr2){
            map.put(num,0);
        }
        int last=arr1.length-1;
        int[] res=new int[arr1.length];
        for(int num:arr1){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }
            else{
                res[last--]=num;
            }
        }
        int p=0;
        for(int num:arr2){
            int count=map.get(num);
            for(int i=0;i<count;i++){
                res[p++]=num;
            }
        }
        Arrays.sort(res,p,res.length);
        return res;
    }
}
