class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> l=new ArrayList<>();
        
        List<Integer> l2=new ArrayList<>();
        Arrays.sort(arr);
        int n=arr.length;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++){
            min=Math.min(min,Math.abs(arr[i]-arr[i+1]));
        }

        for(int i=0;i<n-1;i++){
            List<Integer> l1=new ArrayList<>();
            if(Math.abs(arr[i]-arr[i+1])==min){
                l1.add(arr[i]);
                l1.add(arr[i+1]);
                l.add(l1);
            }
        }

        return l;

    }
}
